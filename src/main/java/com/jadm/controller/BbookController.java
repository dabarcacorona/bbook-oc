package com.jadm.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Optional;

import javax.json.Json;
import javax.json.JsonObject;
import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.InvalidDataAccessResourceUsageException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jadm.model.BbookJson;
import com.jadm.repository.BbookSdiPmgcaiRepository;
import com.jadm.repository.BbookSdiValmsiRepository;
import com.jadm.repository.BbookSdipmgdtiRepository;
import com.jadm.repository.BbookSdipmghdiRepository;
import com.jadm.repository.BbookSpInvoke;
import com.jadm.service.BbookGeneralService;
import com.jadm.service.BbookService;

@RestController
@RequestMapping("/api/CreaOC")
public class BbookController {
	private static final Logger LOG = LoggerFactory.getLogger(BbookController.class);
	
	@Value("${tokken}")
	private String tokken;
	
	@Autowired
	BbookService bbookservice;
	
	@Autowired
	BbookSpInvoke bbookspinvoke;
	
	@Autowired
	BbookGeneralService bbookgeneralservice;
	
	@Autowired
	BbookSdiPmgcaiRepository bbooksdipmgcairepository;

	@Autowired
	BbookSdipmgdtiRepository bbooksdipmgdtirepository;

	@Autowired
	BbookSdipmghdiRepository bbooksdipmghdirepository;

	@Autowired
	BbookSdiValmsiRepository bbooksdivalmsirepository;

	@Autowired
	private EntityManager entityManager;
	
	@GetMapping()
	public ArrayList<BbookJson> obtenerJsob(){
		
		return bbookservice.obtenerJsob();
	}

	@PostMapping()
	@ResponseBody
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    //public Optional<BbookJson> guardarJsob(@RequestBody String StrBbookJson, @RequestHeader(value="Authorization") String token) throws IOException{
    public String  guardarJsob(@RequestBody String StrBbookJson, @RequestHeader(value="Authorization") String token) throws IOException{
		String response;
		if(token == null) {
			
			return "{\"status\":\"Err\",\"statusCode\":401,\"internalCode\":\"00\",\"message\":\"Unauthorized\",\"alert\":\"Llamada sin token \"}";
		}
		
		if(token.equals(tokken)) {
			
		BigDecimal id_bk = (BigDecimal) entityManager.createNativeQuery("select bbook_number.nextval from dual").getSingleResult();
		BbookJson bbookjson = new BbookJson(id_bk.longValue(),StrBbookJson, null);
		
		try {
		   bbookservice.guardarJsob(bbookjson);
           }catch (Exception e) {			
			LOG.debug("{} Err al guardar json ", e);
			return "{\"status\":\"Err\",\"statusCode\":000,\"internalCode\":\"01\",\"message\":\"Error al guardar json\",\"alert\":\"Error al guardar json\"}";
		}   
		
		try {
		   bbookspinvoke.CallSp(id_bk.longValue());
		}catch (Exception e) {
			LOG.debug("{} El Proceso Almacenado BBOOK CARGA OC con error", e);
			return "{\"status\":\"Err\",\"statusCode\":000,\"internalCode\":\"02\",\"message\":\"Error sp carga oc\",\"alert\":\"Error sp carga oc\"}";			
		}
		
		try {
        	bbookgeneralservice.llamadaGenaral(id_bk.longValue());
        	
        } catch (InvalidDataAccessResourceUsageException e) {
        	LOG.error("{}: Ocurrio un error al momento de enviar las OC: ", e );
			return "{\"status\":\"Err\",\"statusCode\":000,\"internalCode\":\"03\",\"message\":\"Error al enviar oc a pmm\",\"alert\":\"Error al enviar oc a pmm\"}";			
        }
		
		bbooksdipmgcairepository.updSdiPmgcai(id_bk.longValue());
		bbooksdipmgdtirepository.updSdipmgdti(id_bk.longValue());
		bbooksdipmghdirepository.updSdipmghdi(id_bk.longValue());
		bbooksdivalmsirepository.updSdiValmsi(id_bk.longValue());
	
        return "{\"status\":\"OK\",\"statusCode\":201,\"internalCode\":\"00\",\"message\":\"Created\",\"alert\":\"Solicitud de oc creada\"}";
		
	} else {
		
		return "{\"status\":\"Err\",\"statusCode\":403,\"internalCode\":\"00\",\"message\":\"Forbidden\",\"alert\":\"Llamada con token invalido\"}";
	}
		
}	

}
