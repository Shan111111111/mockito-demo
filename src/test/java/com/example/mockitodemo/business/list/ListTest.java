package com.example.mockitodemo.business.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;

class ListTest {

	@Test
	void test() {
		
		List mockList = mock(List.class);
		when(mockList.size()).thenReturn(3);
		assertEquals(3, mockList.size());
		
	}

}
