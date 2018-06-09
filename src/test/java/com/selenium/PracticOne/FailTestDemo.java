package com.selenium.PracticOne;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailTestDemo {
	@Test
	public void name() {
		boolean b = false;
		Assert.assertEquals(b, true);
	}
	@Test
	public void name2() {
		boolean a = true;
		Assert.assertEquals(a, true);
	}
}
