package com.example.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SomeBusinessImplStubWayTest {
	

	@Test
	void test() {
		 
		DataService dataServiceStub = new DataServiceStubWithThreeMemberArray();
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceStub );
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(25, result);
	}
	
	@Test
	void testfindTheGreatestWithOneValue() {
		 
		DataService dataServiceStub = new DataServiceStub2WithOneValue();
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceStub );
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(35, result);
	}
}

class DataServiceStubWithThreeMemberArray implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] { 25, 15, 5 };
	}
}

class DataServiceStub2WithOneValue implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] { 35 };
	}
}

class DataServiceStub3WithEmptyArray implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] {};
	}
}