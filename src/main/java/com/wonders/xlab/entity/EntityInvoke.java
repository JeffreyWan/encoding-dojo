package com.wonders.xlab.entity;

import com.wonders.xlab.vo.PregnentVo;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * Created by Jeffrey on 2015/4/15.
 */
public class EntityInvoke {
    public static Object convert(Class classType, Serializable... pregnents) throws IllegalAccessException, InstantiationException {

        if(null == pregnents || pregnents.length < 1)
            return  null;

        Object object = classType.newInstance();

        for(Serializable pregnent:pregnents){
            Field[] fields = pregnent.getClass().getDeclaredFields();
            for (Field field:fields){
                Field targetField = null;
                try {
                    targetField = classType.getDeclaredField(field.getName());
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                    break;
                }

                boolean isAccess = targetField.isAccessible();
                field.setAccessible(true);
                targetField.setAccessible(true);
                targetField.set(object,field.get(pregnent));
                targetField.setAccessible(isAccess);
            }
        }
//
//        Field[] fields = classType.getDeclaredFields();
//        for (int i = 0; i < fields.length; i++) {
//            System.out.println("fields = " + fields[i].getName());
//        }
//        entity.getMethods();
        return object;
    }
}
