package com.competitive.tester;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.competitive.tester.model.TestContainer;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class InputParserTests {

	@Test
	public void SmokeTest() throws JsonParseException, JsonMappingException, IOException {
		InputParser parser=new InputParser("src/test/resources/InputParserTestInput/SmokeTest.json");
		TestContainer container=parser.parseFile();
		System.out.println(container);
		Assert.assertNotNull(container);
	}
	
}
