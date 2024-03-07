import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Week4Test {
    @Test
    public void testMax2Int1(){
        int expectedResult = 5;
        int actualResult = Week4.max2Int(5,2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMax2Int2(){
        int expectedResult = 9;
        int actualResult = Week4.max2Int(9,3);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMax2Int3(){
        int expectedResult = 199;
        int actualResult = Week4.max2Int(199,10);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMax2Int4(){
        int expectedResult = 12;
        int actualResult = Week4.max2Int(12,7);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMax2Int5(){
        int expectedResult = 2005;
        int actualResult = Week4.max2Int(2005,1);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinArray1(){
        int array[] = {1, 2, 3, 4, 5};
        int expectedResult = 1;
        int actualResult = Week4.minArray(array);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinArray2(){
        int array[] = {10, 8, 30, 99, 50};
        int expectedResult = 8;
        int actualResult = Week4.minArray(array);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinArray3(){
        int array[] = {-1, 3, 4, 7, 9};
        int expectedResult = -1;
        int actualResult = Week4.minArray(array);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinArray4(){
        int array[] = {11, 99, 33, 88, 55};
        int expectedResult = 11;
        int actualResult = Week4.minArray(array);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinArray5(){
        int array[] = {6, 26, 99, 48, 59};
        int expectedResult = 6;
        int actualResult = Week4.minArray(array);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculateBMI1(){
        double weight = 50;
        double height = 1.8;
        String expectedResult = "Thiếu cân";
        String actualResult = Week4.calculateBMI(weight, height);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculateBMI2(){
        double weight = 58;
        double height = 1.8;
        String expectedResult = "Thiếu cân";
        String actualResult = Week4.calculateBMI(weight, height);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculateBMI3(){
        double weight = 45;
        double height = 1.9;
        String expectedResult = "Thiếu cân";
        String actualResult = Week4.calculateBMI(weight, height);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculateBMI4(){
        double weight = 82;
        double height = 1.65;
        String expectedResult = "Béo phì";
        String actualResult = Week4.calculateBMI(weight, height);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculateBMI5(){
        double weight = 99;
        double height = 1.7;
        String expectedResult = "Béo phì";
        String actualResult = Week4.calculateBMI(weight, height);
        assertEquals(expectedResult, actualResult);
    }
}
