package com.app.DockerHub;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestMain {
	@Test
	public void testInputIsEven(){
		assertTrue(Main.CheckIfInputIsAnEvenNumber(23)); //Assertion
	}
}