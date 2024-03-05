package com.example.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SomeBusinessImplTest {
	

	@Test
	void test() {
		 
		DataService dataServiceStub = new DataServiceStub();
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceStub );
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(25, result);
	}
}

class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		return new int[] {25, 15, 5};
	}
	
}