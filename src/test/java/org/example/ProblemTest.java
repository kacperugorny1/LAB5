package org.example;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class ProblemTest {


    @Test
    public void NumberCountTest() {
        Problem prb1 = new Problem(5,1,10,10,10,10);
        assertFalse(prb1.solve(100).items.isEmpty());
    }

    @Test
    public void EmptySolutionTest() {
        Problem prb1 = new Problem(5,1,10,10,10,10);
        assertTrue(prb1.solve(5).items.isEmpty());
    }

    @Test
    public void FitsRangeCheck() {
        int rangeMinW = 10, rangeMaxW = 100;
        int rangeMinV = 10, rangeMaxV = 100;
        Problem prb1 = new Problem(5,1,rangeMinW,rangeMaxW,rangeMinV,rangeMaxV);
        for(int i = 0; i < prb1.items.length; ++i){
            assertTrue(prb1.items[i].weight >= rangeMinW && prb1.items[i].weight <= rangeMaxW);
            assertTrue(prb1.items[i].value >= rangeMinV && prb1.items[i].value <= rangeMaxV);
        }
    }

    @Test
    public void InstanceTest() {

        Problem prb = new Problem(10,1,1,10,1,10);
        Solution sol = prb.solve(15);
        assertEquals(25,sol.totalValue);
        assertEquals(15,sol.totalWeight);
    }
}