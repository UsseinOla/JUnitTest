/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d_unittesr;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author User
 */
public class D_UnitTesrTest {

    public D_UnitTesrTest() {
    }

    @BeforeClass
         public static void beforeClass()
         {
         System.out.println("Before Class");
         }
    
    
    D_UnitTesr helper;
     @Before
    public void setup()
    {
        //create helper object before test
        
    helper= new D_UnitTesr();
    
    }
    
    
    /**
     * Test of SquareArea method, of class D_UnitTesr.
     */
    @Test
    public void testSquareArea() {
       D_UnitTesr obj=new D_UnitTesr();
       
       double actuall=obj.squareArea(2);
       
       double expected=4;
       
       assertEquals(expected,actuall,0.00001);
        
    }

    /**
     * Test of subtractTech method, of class D_UnitTesr.
     */
    @Test
    public void testSubtractTech() {
        
        D_UnitTesr ts=new D_UnitTesr();
        
        double expected =ts.subtractTech(5, 5);
        assertTrue(expected==0);
        
        double actuall =0;
        
        assertEquals(expected,actuall,0.001);
         
    }
    
    @Test
    public void test()
    {
    D_UnitTesr helper=new D_UnitTesr();
    
   String actual= helper.truncateAInFirst2Positions("AACD");
   String expected ="CD";
   
   //AACD=>CD ACD=> CD CDEF=>CDEF CDAA=>CDAA
   assertEquals(expected,actual);

    }
    
    
    @Test
    public void testTruncateAInFirst2Positions2()
    {
    D_UnitTesr helper=new D_UnitTesr();
    assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
    }
    
    
    //ABCD=> false, ABAB=>true, AB=>TRUE, A=>false
    @Test
    public void testFunctionAreFirstAndLastTwoCharactersTheSame()
    {
         D_UnitTesr helper=new D_UnitTesr();
    boolean actualValue=helper.areFirstAndLastTwoCharactersTheSame("ABCD");
    boolean expectedValue=false;
    assertEquals(expectedValue,actualValue);
    }
    
    
    @Test
    public void testFunctionAreFirstAndLastTwoCharactersTheSame_NegativeSenario()
    {
    assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }
    
    
     @Test
    public void testFunctionAreFirstAndLastTwoCharactersTheSame_PositiveSenario()
    {
    assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }
   
    
     @Test
       public void testSortArray()
       {
       int[] numbers={12,3,4,1};
       int[] expected={1,3,4,12};
       
       Arrays.sort(numbers);
       assertArrayEquals(expected,numbers);
       }
    
       
       @Test(expected=NullPointerException.class)
       public void testArraySort_NullArray()
       {
       int[] numbers=null;
       Arrays.sort(numbers);
       
           
       }
    
    //check the time that array takes to finish the task
    @Test(timeout=1000)
    public void testSort_Performacne()
    {
    int array[]={12,23,4};
    for(int i=0; i<=100;i++)
    {
    array[0]= i;
    Arrays.sort(array);        
    }
    }

   @After
   public void teardown()
   {
   System.out.println("After test");
   }
    
   
   @AfterClass
   public static void afterClass()
   {
       System.out.println("After Class");
   }
    
   

   
   
   
   
   
   
    
}
