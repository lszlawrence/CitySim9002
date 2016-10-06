package Domain;

import org.junit.Test;
import org.junit.Assert;
import program.Location;

import static org.mockito.Matchers.anyInt;
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

        Assert.assertEquals("The Point", new Location().locationGenerator(2 ,1));
    }

    /*
 *The location generator should generate the cathedral.
 *To test if location generator can generate the cathedral */
    @Test
    public void ifCLOneOfFour(){
        Assert.assertEquals("The Cathedral of Learning", new Location().locationGenerator(0 ,1));
    }

    /*
   *The location generator should generate downtown.
   *To test if location generator can generate downtown */
    @Test
    public void ifDownTownOneOfFour(){
        Assert.assertEquals("Downtown", new Location().locationGenerator(3 ,1));
    }

    /*
 *The location generator should generate squirrel hill.
 *To test if location generator can generate squirrel hill */

    @Test
    public void ifSquirrelHillOneOfFour(){
        Assert.assertEquals("Squirrel Hill", new Location().locationGenerator(1, 1));
    }
}
