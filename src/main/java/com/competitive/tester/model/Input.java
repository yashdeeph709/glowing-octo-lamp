package com.competitive.tester.model;

import java.util.List;

public class Input {
		List<Argument> arguments;

		public Input(List<Argument> arguments) {
			super(); 
			this.arguments = arguments;
		}

		@Override
		public String toString() {
			return "Input [arguments=" + arguments + "]";
		}

		public Input() {
			super();
			// TODO Auto-generated constructor stub
		}

		public List<Argument> getArguments() {
			return arguments;
		}

		public void setArguments(List<Argument> arguments) {
			this.arguments = arguments;
		}

}
