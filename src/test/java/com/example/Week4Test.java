package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class Week4Test {
    /**
     * Rigorous Test.
     */

    @Test
    public void testMax2Int1(){
        assertEquals(Week4.max2Int(1, 2), 2);
    }

    @Test
    public void testMax2Int2(){
        assertEquals(Week4.max2Int(0, 3), 3);
    }

    @Test
    public void testMax2Int3(){
        assertEquals(Week4.max2Int(-1, -2), -1);
    }

    @Test
    public void testMax2Int4(){
        assertEquals(Week4.max2Int(-1, 2), 2);
    }

    @Test
    public void testMax2Int5(){
        assertEquals(Week4.max2Int(100, 200), 200);
    }

    @Test
    public void testMinArray1(){
        assertEquals(Week4.minArray(new int[]{1, 2, 3}), 1);
    }

    @Test
    public void testMinArray2(){
        assertEquals(Week4.minArray(new int[]{1, 2, -3}), -3);
    }

    @Test
    public void testMinArray3(){
        assertEquals(Week4.minArray(new int[]{-1, -2, -3}), -3);
    }

    @Test
    public void testMinArray4(){
        assertEquals(Week4.minArray(new int[]{-1, -2, 3, 4, 5}), -2);
    }

    @Test
    public void testMinArray5(){
        assertEquals(Week4.minArray(new int[]{1, 2, 3, 4, 5, -9, -10}), -10);
    }

    @Test
    public void testCalculateBMI1(){
        assertEquals(Week4.calculateBMI(57, 1.7), "Bình thường");
    }

    @Test
    public void testCalculateBMI2(){
        assertEquals(Week4.calculateBMI(50, 1.7), "Thiếu cân");
    }

    @Test
    public void testCalculateBMI3(){
        assertEquals(Week4.calculateBMI(70, 1.7), "Thừa cân");
    }

    @Test
    public void testCalculateBMI4(){
        assertEquals(Week4.calculateBMI(80, 1.7), "Béo phì");
    }

    @Test
    public void testCalculateBMI5(){
        assertEquals(Week4.calculateBMI(53.3783, 1.7), "Bình thường");
    }
}
