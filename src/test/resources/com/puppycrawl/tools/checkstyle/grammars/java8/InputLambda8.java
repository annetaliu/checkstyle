//Compilable with Java8
package com.puppycrawl.tools.checkstyle.grammars.java8;

import java.util.logging.Logger;

public class InputLambda8 {

	private static final Logger LOG = Logger.getLogger(InputLambda8.class.getName());

	public static void testVoidLambda(TestOfVoidLambdas test) {
		LOG.info("Method called");
		test.doSmth("fef", 2);
	}
	
	
	public static void main(String[] args) {
		
		testVoidLambda((s1, s2) -> LOG.info(s1 + s2));
	}

	private interface TestOfVoidLambdas {

		public void doSmth(String first, Integer second);
	}
}
