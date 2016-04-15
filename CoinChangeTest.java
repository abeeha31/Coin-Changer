/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coinchange;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ashafiq.bscs13seecs
 */
public class CoinChangeTest {
    
    public CoinChangeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of GreedyCoinChange method, of class CoinChange.
     */
    @Test
    public void testGreedyCoinChange() {
        System.out.println("GreedyCoinChange");
        int amount = 10;
        CoinChange instance = new CoinChange();
        int expResult = 1;
        int result = instance.GreedyCoinChange(amount);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of DynamicCoinChange method, of class CoinChange.
     */
    @Test
    public void testDynamicCoinChange() {
        System.out.println("DynamicCoinChange");
        int amount = 10;
        int c = 0;
        CoinChange instance = new CoinChange();
        int expResult = 1;
        int result = instance.DynamicCoinChange(amount, c);
        assertEquals(expResult, result);
    }

    
    
}
