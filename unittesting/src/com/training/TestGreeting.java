package com.training;


import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestGreeting {
   
	Greeting grtObj;
	@BeforeAll
	public static void init() {
		System.out.println("BEFORE ALL CALLED");
	}
	
	@BeforeEach
	public void setUp(TestInfo info)
	{
		System.out.println("calling :="+ info.getTestMethod().get().getName());
		grtObj = new Greeting();
	}
	@Test
	@DisplayName(value = "To Test the Method returns string of length 10")
	void testForGetMessageLength() {
		
		int actual = grtObj.getMessage().length();
		int excepted=10;
		
		assertEquals(excepted,actual);
	}
	@Test
	void testAsignGrade() {
	String actual = grtObj.assignGrade(40);
	String excepted ="b";
	
	assertEquals(excepted,actual);
		
	}
	@Test
	void testParseMethod() {
		assertThrows(NumberFormatException.class,
				() -> grtObj.parse("fifty"));
	}
	
//	@Disabled("will wait for bug fixes on other methods to complete")
	
	
	@ParameterizedTest
	@ValueSource(ints = {0,1,3})
	void testGetBestBook(int idxPos) {
		
		LocalDate currentDate = LocalDate.now();
		
		assumeTrue(currentDate.getDayOfWeek().equals(DayOfWeek.FRIDAY));
		assertNotNull(grtObj.getBestBook(idxPos));
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("After Each Called ");
	}
	
	@AfterAll
	public static void destroy() {
		System.out.println("AFTER ALL CALLED");
	}

}
