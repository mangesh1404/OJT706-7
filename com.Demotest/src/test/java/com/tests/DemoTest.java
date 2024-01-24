package com.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class DemoTest {

	@Test
	public void login() {
		System.out.println("login");
	}
	
	@Test
	public void dash() {
		System.out.println("dash");
		throw new SkipException("test case skipped");
	}
	
	@Test
	public void user() {
		System.out.println("user");
		Assert.assertTrue(false);
	}
	
	
}
