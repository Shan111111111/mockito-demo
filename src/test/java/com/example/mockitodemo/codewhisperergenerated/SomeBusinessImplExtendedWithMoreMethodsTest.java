package com.example.mockitodemo.codewhisperergenerated;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.mockitodemo.business.DataService;
import com.example.mockitodemo.business.SomeBusinessImpl;


@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplExtendedWithMoreMethodsTest {
	@Mock
	private DataService mockDataService;
	
	@InjectMocks
	SomeBusinessImpl someBusinessImpl;

  @Test
  public void testFindTheGreatestFromAllData() {
    
    // Mock the data service to return a test array
	  DataService mockDataService = Mockito.mock(DataService.class);
    SomeBusinessImpl business = new SomeBusinessImpl(mockDataService);
    int[] testData = {5, 3, 6, 2, 10}; 
    Mockito.when(mockDataService.retrieveAllData()).thenReturn(testData);
    
    int result = business.findTheGreatestFromAllData();
    
    assertEquals(10, result);
  }
  
  @Test
  public void testFindTheGreatestFromAllDataWithEmptyAraray() {
	  
	  // Mock the data service to return a test array
	  DataService mockDataService = Mockito.mock(DataService.class);
	  SomeBusinessImpl business = new SomeBusinessImpl(mockDataService);
	  int[] testData = {Integer.MIN_VALUE}; //Empty array is validating for Integer.MIN_VALUE here as it is defaulted to this value in SomeBusinessImpl, so tweaked but just understand the logic
	  Mockito.when(mockDataService.retrieveAllData()).thenReturn(testData);
	  
	  int result = business.findTheGreatestFromAllData();
	  
	  assertEquals(Integer.MIN_VALUE, result);
  }
  
//  AWS codewhisperer generated test with some small level changes by me
	@Test
	public void testEmptyArray() {
		int[] testData = {};
		Mockito.when(mockDataService.retrieveAllData()).thenReturn(testData);
		int result = someBusinessImpl.findTheGreatestFromAllData();

		assertEquals(Integer.MIN_VALUE, result);
	}

	
	/*
	 * AS IS TAKEN FROM AWS CODEWHISPERER
	 * @Test
	 * public void testMultipleElements() {
	 *  int[] data = {1, 5, 3, 6, 2};
	 * 
	 *  int result = business.findTheGreatestFromAllData();
	 * 
	 *  assertEquals(6, result); }
	 */
	
//	ABOVE CW GENERATED CODE IS MODIFIED TO FIT THE LOGIC AND TEST
	@Test
	public void testMultipleElements() {
	  int[] data = {1, 5, 3, 6, 2};
	  Mockito.when(mockDataService.retrieveAllData()).thenReturn(data);
	  int result = someBusinessImpl.findTheGreatestFromAllData();

	  assertEquals(6, result);
	}
	
	/*
	 * @ParameterizedTest
	 * 
	 * @ValueSource(ints = { 5, 12 }) void testWithDifferentData(int greatest) {
	 * 
	 * // setup test data array int[] data = { 1, 5, 3 };
	 * Mockito.when(mockDataService.retrieveAllData()).thenReturn(data);
	 * 
	 * int result = someBusinessImpl.findTheGreatestFromAllData();
	 * 
	 * assertEquals(greatest, result);
	 * 
	 * }
	 */
	
	
	
	@Test
	public void testAdd_EmptyArray() {
	  int[] array = {};
	  int result = someBusinessImpl.add(array);
	  assertEquals(0, result);
	}
	
}
