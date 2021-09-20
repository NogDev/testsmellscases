package br.ufba.aries.testsmellscases;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;

import br.ufba.aries.testsmellscases.suport.Facade;
import br.ufba.aries.testsmellscases.suport.FlightDto;

public class ComplexTeardownTest {

	private Facade facade;

	@Test
	public void testGetFlightsByOrigin_NoInboundFlight_SMRTD() throws Exception {
		// Set Up Fixture
		BigDecimal outboundAirport = createTestAirport("1OF");
		BigDecimal inboundAirport = null;
		FlightDto expFlightDto = null;
		try {
			inboundAirport = createTestAirport("1IF");
			expFlightDto = createTestFlight(outboundAirport, inboundAirport);
			// Exercise System
			List<?> flightsAtDestination1 = facade.getFlightsByOriginAirport(inboundAirport);
			// Verify Outcome
			assertEquals(0, flightsAtDestination1.size());
		} finally {
			try {
				facade.removeFlight(expFlightDto.getFlightNumber());
			} finally {
				try {
					facade.removeAirport(inboundAirport);
				} finally {
					facade.removeAirport(outboundAirport);
				}
			}
		}
	}

	private FlightDto createTestFlight(BigDecimal outboundAirport, BigDecimal inboundAirport) {
		// TODO Auto-generated method stub
		return null;
	}

	private BigDecimal createTestAirport(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
