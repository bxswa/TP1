package iut;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AddTest 
{

    @Test
    public void testAdd (  )
    {
        //
        Add add = new Add();

        //
        int result = add.add(0,1);

        //
        assertEquals(result,1);
       
    }
}