package com.example.mockitodemo.business;

public class SomeBusinessImpl {
	
	private DataService dataService;
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}



	public int findTheGreatestFromAllData() {
		int[] data = dataService.retrieveAllData();
		
		int greatestValue = Integer.MIN_VALUE;
		for (int value : data) {
			if (value > greatestValue) {
				greatestValue = value;
			}
		}
		
		return greatestValue;
	}
	
	public int add(int[] intArray) {
		int sum = 0;
		for (int i : intArray) {
			sum = sum + i;
		}
		return sum;
	}


}
