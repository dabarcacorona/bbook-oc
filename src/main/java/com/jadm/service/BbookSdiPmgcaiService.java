package com.jadm.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.jadm.model.BbookSdiPmgcai;
import com.jadm.model.CsvBbookSdiPmgcai;
import com.jadm.model.JsonCab;
import com.jadm.model.JsonDet;
import com.jadm.repository.BbookSdiPmgcaiRepository;
import com.jadm.utilities.HttpUtilities;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import com.opencsv.CSVWriter;
import com.opencsv.CSVWriterBuilder;
import com.opencsv.ICSVWriter;

@Service
@Transactional
public class BbookSdiPmgcaiService {

	@Autowired
	BbookSdiPmgcaiRepository bbooksdipmgcairepository;
	
	private static final Logger LOG = LoggerFactory.getLogger(BbookSdiPmgcaiService.class);

	public  List<BbookSdiPmgcai> writeToCsvDetailCsv(String archivo, String ruta, long idn) {		
	       final String pathCompletoArchivoResultanteDescarga = ruta+archivo;
	       final String ColumnasCsv= ";";
	       List<BbookSdiPmgcai> ResultsToWriteIntoCsv=null;
	       
	       // Streams para escribir csv
	        FileWriter fileWriter = null;
	        ICSVWriter csvWriter = null;

	        int linesWrittenIntoCsv = 0;

	        try {

	           // Streams para leer y escribir csv
	             fileWriter = new FileWriter(pathCompletoArchivoResultanteDescarga);
	             csvWriter = new CSVWriterBuilder(fileWriter)
	             .withLineEnd(CSVWriter.DEFAULT_LINE_END)
	             .withQuoteChar(CSVWriter.NO_QUOTE_CHARACTER)
//	             .withSeparator()
	             .build();

	                // Escribiendo el encabezado del archivo resultante.
	                // Orden esta definido en metodo estatico utilitario de CsvDetalleCuadraturaRcvWms
	                // y corresponde a como se declararon los miembros, del tipo "protected", en clase CuadraturaRcvWms
	                final String[] fieldNamesToWriteIntoCsv = CsvBbookSdiPmgcai.getHeader();
	                csvWriter.writeNext(fieldNamesToWriteIntoCsv);
	                linesWrittenIntoCsv++;

	                ResultsToWriteIntoCsv = new ArrayList<>();
	               
	                try {
	                	ResultsToWriteIntoCsv=bbooksdipmgcairepository.findByDownloadDate1IsNullAndBatchNum(idn);
	                	//totreg = ResultsToWriteIntoCsv.size();
	                } catch (Exception e) {

			             LOG.error("Error al {}",  e);

		            }
	                    for(BbookSdiPmgcai row : ResultsToWriteIntoCsv) {

	                        final String[] fieldValuesToWriteIntoCsv  = new CsvBbookSdiPmgcai(row).getCsvLine();
	                        csvWriter.writeNext(fieldValuesToWriteIntoCsv);
	                        csvWriter.flush();
	                        linesWrittenIntoCsv++;
	                    } // fin iteracion resultados pagina
	               
	            } catch (Exception e) {

		             LOG.error("Error al escribir archivo CSV en  Archivo {}", pathCompletoArchivoResultanteDescarga, e);

	              } // fin validacion paginas iteradas corresponde al total existente en la BD

   		       finally {
				
			       // Asegurandose de cerrar los potenciales streams abiertos
			
			       if (csvWriter!=null) {
			           try {
			               csvWriter.close();
			           } catch (IOException e) {
			               //e.printStackTrace();
			               LOG.error("Error al cerrar stream csvWriter", e);
			           }
			       } // fin cierre csvWriter
			
			       if (fileWriter!=null) {
			           try {
			               fileWriter.close();
			           } catch (IOException e) {
			               //e.printStackTrace();
			               LOG.error("Error al cerrar stream fileWriter ", e);
			           }
			       } // fin cierre fileWriter
			   } // fin finally		        
	        
	        return ResultsToWriteIntoCsv; 
	}
}
