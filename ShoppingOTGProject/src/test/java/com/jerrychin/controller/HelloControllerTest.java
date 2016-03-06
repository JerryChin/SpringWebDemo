package com.jerrychin.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.ui.ModelMap;

import com.jerrychin.controller.HelloController;

public class HelloControllerTest {
	
	@Test
	public void welcomeTest() {
		HelloController hello = new HelloController();
		ModelMap model = new ModelMap();
		hello.welcome(model);
		Assert.assertNotNull(model.get("items"));
	}
}
