package Lesson_7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Class refCl = null;
        try {
            refCl = Class.forName("Lesson_7.TestClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        assert refCl != null;
        Method[] methods = refCl.getDeclaredMethods();
        Method mBeforeSuite = null;
        Method mAfterSuite  = null;

        for (Method m: methods) {
            if(m.isAnnotationPresent(BeforeSuite.class)) {
                if(mBeforeSuite == null) {
                    mBeforeSuite = m;
                } else {
                    throw new RuntimeException();
                }
            }
            if(m.isAnnotationPresent(AfterSuite.class)) {
                if(mAfterSuite == null) {
                    mAfterSuite = m;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        if(mBeforeSuite != null) {
            try {
                mBeforeSuite.invoke(null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        for (int i = 1; i <= 10; i++) {
            for (Method m: methods) {
                if(m.isAnnotationPresent(Test.class)) {
                    if(m.getAnnotation(Test.class).priority()==i) {
                        try {
                            m.invoke(null);
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        if(mAfterSuite != null) {
            try {
                mAfterSuite.invoke(null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
