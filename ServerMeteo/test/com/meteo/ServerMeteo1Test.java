/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meteo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amar
 */
public class ServerMeteo1Test {

    public ServerMeteo1Test() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getWeather method, of class ServerMeteo1.
     */
    @Test
    public void testGetWeather() {
        System.out.println("getWeather");
        String city = "";
        String country = "";
        ServerMeteo1 instance = new ServerMeteo1();
        String expResult = "";
        String result = instance.getWeather(city, country);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeather method, of class ServerMeteo1.
     */
    @Test
    public void testGetWeather_String_String() {
        System.out.println("getWeather");
        String city = "";
        String country = "";
        ServerMeteo1 instance = new ServerMeteo1();
        String expResult = "";
        String result = instance.getWeather(city, country);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}