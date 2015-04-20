package com.wonders.xlab.service;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by Jeffrey on 2015/4/15.
 */
public class Calculator {
    public static Double add(int firstNumber, int secondNumber) {
        return 0.0;
    }

    public static Object enginCalculate(final String sourceString) throws ScriptException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        final ScriptEngine engine = scriptEngineManager.getEngineByName("JavaScript");
        System.out.println("sourceString = " + sourceString);
        return engine.eval(sourceString);
    }
}
