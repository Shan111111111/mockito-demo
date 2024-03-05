package com.example.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class SomeBusinessImplMockitoWayTest {
	

	@Test
	void findTheGreatestFromAllData_basicScenario() {
		 
		DataService mock = mock(DataService.class);
		when(mock.retrieveAllData()).thenReturn(new int[] {25,15,5});
		
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(mock );
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(25, result);
	}
	
	
	@Test
	void findTheGreatestFromAllData_withOneValue() {
		 
		DataService mock = mock(DataService.class);
		when(mock.retrieveAllData()).thenReturn(new int[] {35});
		
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(mock );
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(35, result);
	}

}
