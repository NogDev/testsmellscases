package br.ufba.aries.testsmellscases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ufba.aries.testsmellscases.suport.Calculator;

public class ProductionLogicTest {

	@Test
	public void testCombinationsOfInputValues() {
		// Set up fixture
		Calculator sut = new Calculator();
		int expected; // TBD inside loops
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				// Exercise SUT
				int actual = sut.calculate(i, j);
				// Verify result
				if (i == 3 & j == 4) // special case
					expected = 8;
				else
					expected = i + j;
				assertEquals(message(i, j), expected, actual);
			}
		}
	}

	private String message(int i, int j) { 
		return "Cell( " + String.valueOf(i)+ ","+ String.valueOf(j) + ")";
	}

}
