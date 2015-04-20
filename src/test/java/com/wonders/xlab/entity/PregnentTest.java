package com.wonders.xlab.entity;

import com.wonders.xlab.vo.PregnentVo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.Serializable;

import static org.junit.Assert.assertEquals;

public class PregnentTest implements Serializable {

    private Preg preg = new Preg();

    private Pregnent pregnent = new Pregnent();


    @Before
    public void setUp() throws Exception {
        preg.setAutor("zhangsan");
        preg.setCount("2");
        preg.setDetail("balabala");
        preg.setFileName("buzhidao");
        preg.setSize(555L);

        pregnent.setAge(55);
        pregnent.setName("lisi");
        pregnent.setAddress("balabla");
        pregnent.setAppPlatform("xxx");
    }

    @Test
    public void testInvokeMethed() throws Exception {

        final PregnentVo pregnentVo = (PregnentVo)EntityInvoke.convert(PregnentVo.class, preg, pregnent);

        System.out.println("pregnentVo.getAutor() = " + pregnentVo.getAutor());
        assertEquals(pregnentVo.getAutor(),pregnentVo.getAutor(),preg.getAutor());
        assertEquals(pregnentVo.getAddress(),pregnent.getAddress());
    }

    @After
    public void tearDown() throws Exception {

    }
}