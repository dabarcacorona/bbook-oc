package com.jadm.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jadm.model.BbookJson;
import com.jadm.repository.BbookRepository;

@Service
public class BbookService {

	@Autowired
	BbookRepository bbookrepository;
	
	public ArrayList<BbookJson> obtenerJsob(){
		
		return (ArrayList<BbookJson>) bbookrepository.findAll();
	}
	
	public BbookJson guardarJsob(BbookJson bbookjson){
		
		return bbookrepository.save(bbookjson);
	}
	
	public Optional<BbookJson> buscarJsob(Long idbk){
		
		return bbookrepository.findById(idbk);
	}
}
