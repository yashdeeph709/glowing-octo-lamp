package com.competitive.tester.model;

import java.util.ArrayList;
import java.util.List;

public class TestContainer {
		@Override
		public String toString() {
			return "TestContainer [tests=" + tests + "]";
		}
		public List<Test> tests;
		
		public TestContainer(){
			this.tests=new ArrayList<Test>();
		}
		public boolean addTest(Test test){
			return tests.add(test);
		}
		public boolean removeTest(Test test){
			return tests.remove(test);
		}
}	
