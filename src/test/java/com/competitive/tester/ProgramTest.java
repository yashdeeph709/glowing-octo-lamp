package com.competitive.tester;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ProgramTest  {

	@Test
	public void smokeTestFindMethod(){
		Program program=new Program();
		Assert.assertEquals(program.findTestMethod(program.getClass()),null);
	}
}
