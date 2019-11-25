package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(6, -1, 1);
    	int b = hw.Method3(4,-1,-3);
        int c = hw.Method3(5,0,-1);
        int d = hw.Method3(6,2,2);
        int e = hw.Method3(4,-1,0);
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
     @Test
     public void testMethod4() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method4(0,0,1,2,1);
        int b = hw.Method4(1,1,2,2,1);
        int c = hw.Method4(5,5,2,2,1);
        int d = hw.Method4(5,2,2,2,1);
     }
     @Test
     public void testBug() {
         HelloWorld hw = new HelloWorld();
         boolean a = hw.bug(5);
         boolean b = hw.bug(4);
     }
     @Test
     public void testIsTriangle() {
        HelloWorld hw = new HelloWorld();
        boolean a = hw.isTriangle(1,2,3);
        boolean b = hw.isTriangle(3,5,1);
        boolean c = hw.isTriangle(5,1,4);
        boolean d = hw.isTriangle(3,3,3);
     }
     @Test
     public void testIsBirthday() {
         HelloWorld hw = new HelloWorld();
         boolean a = hw.isBirthday(1997,9,28);
         boolean b = hw.isBirthday(2019,12,31);
         boolean c = hw.isBirthday(100,1,1);
     }
     @Test
     public void testMiniCalculator() {
         HelloWorld hw = new HelloWorld();
         double a = hw.miniCalculator(1,1,'+');
         double b = hw.miniCalculator(1,1,'-');
         double c = hw.miniCalculator(1,1,'*');
         double d = hw.miniCalculator(1,1,'/');
         double e = hw.miniCalculator(1,1,'0');

     }
}
