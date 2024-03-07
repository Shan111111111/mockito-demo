package com.example.mockitodemo.codewhisperergenerated;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.example.mockitodemo.business.DataService;
import com.example.mockitodemo.business.SomeBusinessImpl;


public class SomeBusinessImplTest {

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

}

