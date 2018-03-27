package com.competitive.tester;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;

import com.competitive.tester.model.TestContainer;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InputParser {
	final static Logger logger = Logger.getLogger(InputParser.class);
	public String filename;
	public File inputFile;
	
	public InputParser(String filename){
		this.inputFile=new File(filename);
	}
	public TestContainer parseFile() throws JsonParseException, JsonMappingException, IOException{
			ObjectMapper objectMapper = new ObjectMapper();
			logger.info("Reading and parsing the input json file: "+filename);
			TestContainer testContainer=objectMapper.readValue(inputFile,TestContainer.class);
			return testContainer;
	}
}
