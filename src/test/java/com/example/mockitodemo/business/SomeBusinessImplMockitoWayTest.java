package com.example.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockitoWayTest {
	@Mock
	private DataService dataService;
	
	@InjectMocks
	private SomeBusinessImpl someBusinessImpl;

	@Test
	void findTheGreatestFromAllData_basicScenario() {
		 
		when(dataService.retrieveAllData()).thenReturn(new int[] {25,15,5});
		assertEquals(25, someBusinessImpl.findTheGreatestFromAllData());
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
