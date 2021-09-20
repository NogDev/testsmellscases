package br.ufba.aries.testsmellscases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ufba.aries.testsmellscases.suport.Calculator;
import br.ufba.aries.testsmellscases.suport.TestValues;

public class MultipleTestConditionsTest {

	@Test
	public void testMultipleValueSets() {
		// Set Up Fixture
		Calculator sut = new Calculator();
		TestValues[] testValues = { new TestValues(1, 2, 3), new TestValues(2, 3, 5), new TestValues(3, 4, 8), // special
																												// case!
				new TestValues(4, 5, 9) };
		for (int i = 0; i < testValues.length; i++) {
			TestValues values = testValues[i];
			// Exercise SUT
			int actual = sut.calculate(values.a, values.b); // Verify Outcome
			assertEquals(message(i), values.expectedSum, actual);
		}
	}

	private String message(int i) {
		return "Row " + String.valueOf(i);
	}

}
