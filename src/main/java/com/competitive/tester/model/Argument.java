package com.competitive.tester.model;

public class Argument {
		@Override
		public String toString() {
			return "Argument [key=" + key + ", value=" + value + ", array=" + array + "]";
		}

		private String key;
		private String value;
		private boolean array;
		
		public Argument(String key, String value, boolean array) {
			super();
			this.setKey(key);
			this.setValue(value);
			this.array = array;
		}

		public Argument() {
			super();
			// TODO Auto-generated constructor stub
		}

		public boolean isArray() {
			return array;
		}

		public void setArray(boolean array) {
			this.array = array;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
				
}
