package com.wonders.xlab.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.script.ScriptException;

import static org.junit.Assert.*;

public class CalculatorTest {

    private String sourceString="1d*f2/=//=!@1+||、d(s5+23-ss2)*5";

    @Before
    public void setUp() throws Exception {
        sourceString = sourceString.replaceAll("[a-zA-Z@!~,`^_=、//|]","" );
        System.out.println("sourceString = " + sourceString);
    }

    @Test
    public void testAdd() throws Exception {

        Assert.assertNotNull(Calculator.add(1,2));
    }

    @Test
    public void testEnginCalculator() throws Exception {

        Assert.assertEquals(151D,Calculator.enginCalculate(sourceString));
    }

    @Test(expected = Exception.class)
    public void testEngineThrowExcption() throws Exception {
        Calculator.enginCalculate(sourceString);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("CalculatorTest.tearDown");
    }
}