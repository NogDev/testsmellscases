package br.ufba.aries.testsmellscases;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import br.ufba.aries.testsmellscases.suport.FlightDto;

public class ConditionalVerificationLogicTest {

	private FlightDto expectedCalgaryToVan;
	private Object flightsFromCalgary;

	@SuppressWarnings({ "unchecked", "unused" })
	@Test
	public void testCVLT() {
		// verify Vancouver is in the list actual = null;
		
		List<Object>i = (List<Object>) ((List<Object>) flightsFromCalgary).iterator(); 
		while (((Iterator<Object>) i).hasNext()) {
		FlightDto flightDto = (FlightDto) ((Iterator<Object>) i).next(); 
	
		
		if (flightDto.getFlightNumber().equals(
		expectedCalgaryToVan.getFlightNumber()))
		         {
		            FlightDto actual = flightDto;
		            assertEquals("Flight from Calgary to Vancouver",
		            		expectedCalgaryToVan,
		            		flightDto);
		            break; 
		            }
		
				}
	}

}
