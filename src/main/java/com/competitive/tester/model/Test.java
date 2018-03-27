package com.competitive.tester.model;

public class Test {
		private Input input;

		public Input getInput() {
			return input;
		}

		public Test() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Test [input=" + input + "]";
		}

		public void setInput(Input input) {
			this.input = input;
		}
		
		public Test(Input input) {
			super();
			this.input = input;
		}
}
