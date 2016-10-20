package Domain;

import org.junit.Test;
import org.junit.Assert;
import program.Location;


import java.util.Random;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Created by lszlawrence on 16/10/5.
 */
public class LocationTest {

    /*
    *The location generator should generate the point.
    *To test if location generator can generate the point */
    @Test
    public void ifThePointOneOfFour(){
        Random mockRandom = mock(Random.class);
        when(mockRandom.nextInt(any(Integer.class))).thenReturn(2);
        Assert.assertEquals("The Point", new Location().locationGenerator(mockRandom));
    }

    /*
 *The location generator should generate the cathedral.
 *To test if location generator can generate the cathedral */
    @Test
    public void ifCLOneOfFour(){
        Random mockRandom = mock(Random.class);
        when(mockRandom.nextInt(any(Integer.class))).thenReturn(0);
        Assert.assertEquals("The Cathedral of Learning", new Location().locationGenerator(mockRandom));
    }

    /*
   *The location generator should generate downtown.
   *To test if location generator can generate downtown */
    @Test
    public void ifDownTownOneOfFour(){

        Random mockRandom = mock(Random.class);
        when(mockRandom.nextInt(any(Integer.class))).thenReturn(3);
        Assert.assertEquals("Downtown", new Location().locationGenerator(mockRandom));
    }

    /*
 *The location generator should generate squirrel hill.
 *To test if location generator can generate squirrel hill */

    @Test
    public void ifSquirrelHillOneOfFour(){
        Random mockRandom = mock(Random.class);
        when(mockRandom.nextInt(any(Integer.class))).thenReturn(1);
        Assert.assertEquals("Squirrel Hill", new Location().locationGenerator(mockRandom));
    }
}
