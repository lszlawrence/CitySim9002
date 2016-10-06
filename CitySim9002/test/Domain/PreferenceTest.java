package Domain;

import org.junit.Assert;
import org.junit.Test;
import program.Location;
import program.Preference;
import program.Visitor;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by lszlawrence on 16/10/5.
 */
public class PreferenceTest {

    /*
    *The Comparator should return true when visitor like the location.
    *Test if the comparator return true when visitor like the location */
    @Test
    public void ifTheVisitorLikeTheLocationReturnTrue(){
        Visitor mockVisitor = mock (Visitor.class);
        Location mockLocation = mock (Location.class);
        when(mockVisitor.vistorGenerator(anyInt(), anyInt())).thenReturn("Professor");
        when(mockLocation.locationGenerator(anyInt(), anyInt())).thenReturn("The Point");
        Assert.assertTrue(new Preference().like(mockLocation.locationGenerator(1, 1), mockVisitor.vistorGenerator(1, 1)));
    }

    /*
    *The comparator should return false when visitor not like the location.
    *Test if the comparator return false when visitor not like the location */
    @Test
    public void ifTheVisitorLikeTheLocationReturnFalse(){
        Visitor mockVisitor = mock (Visitor.class);
        Location mockLocation = mock (Location.class);
        when(mockVisitor.vistorGenerator(anyInt(), anyInt())).thenReturn("Blogger");
        when(mockLocation.locationGenerator(anyInt(), anyInt())).thenReturn("Downtown");
        Assert.assertFalse(new Preference().like(mockLocation.locationGenerator(1, 1), mockVisitor.vistorGenerator(1, 1)));
    }
}
