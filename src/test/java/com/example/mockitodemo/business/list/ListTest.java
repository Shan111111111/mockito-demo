package com.example.mockitodemo.business.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ListTest {

	@Test
	void test() {

		List mockList = mock(List.class);
		when(mockList.size()).thenReturn(3);
		assertEquals(3, mockList.size());

	}

	@Test
	void multopleReturns() {

		List mockList = mock(List.class);
		when(mockList.size()).thenReturn(3).thenReturn(2);
		assertEquals(3, mockList.size());
		assertEquals(2, mockList.size());
		assertEquals(2, mockList.size());
		assertEquals(2, mockList.size());

	}

	@Test
	void testMethodsinMockwithSpecificParametersValue() {

		List mockList = mock(List.class);
		when(mockList.get(0)).thenReturn("Something in 0 location");
		assertEquals("Something in 0 location", mockList.get(0));
		assertEquals(null, mockList.get(1));

	}

	@Test
	void testMethodsinMockwithGenericParametersValue() {

		List mockList = mock(List.class);
		when(mockList.get(Mockito.anyInt())).thenReturn("SomeOther string");
		assertEquals("SomeOther string", mockList.get(0));
		assertEquals("SomeOther string", mockList.get(23));
		assertEquals("SomeOther string", mockList.get(15));
		assertEquals("SomeOther string", mockList.get(2));

	}

}
