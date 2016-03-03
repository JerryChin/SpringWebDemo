package com.jerrychin.controller;

import org.junit.Assert;
import org.junit.Test;

import com.jerrychin.controller.HelloController;

public class HelloControllerTests {
	
	@Test
	public void welcomeTest() {
		HelloController hello = new HelloController();
		Assert.assertNotNull(hello.welcome(null));
	}
}
