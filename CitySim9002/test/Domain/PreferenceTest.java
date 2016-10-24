package Domain;

import org.junit.Assert;
import org.junit.Test;
import program.Location;
import program.Preference;
import program.Visitor;

import java.util.Random;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by lszlawrence on 16/10/5.
 */
public class PreferenceTest {

   //Test Professor likes The point
    @Test
    public void ProfessorThePoint(){
        Random mockRandom = mock(Random.class);
        Visitor mockVisitor = mock (Visitor.class);
        Location mockLocation = mock (Location.class);
        when(mockVisitor.vistorGenerator(any(Random.class))).thenReturn("Professor");
        when(mockLocation.locationGenerator(any(Random.class))).thenReturn("The Point");
        Assert.assertTrue(new Preference().like(mockLocation.locationGenerator(mockRandom), mockVisitor.vistorGenerator(mockRandom)));
    }

    //Test Professor likes the C:
    @Test
    public void ProfessorTheCL(){
        Random mockRandom = mock(Random.class);
        Visitor mockVisitor = mock (Visitor.class);
        Location mockLocation = mock (Location.class);
        when(mockVisitor.vistorGenerator(any(Random.class))).thenReturn("Professor");
        when(mockLocation.locationGenerator(any(Random.class))).thenReturn("The Cathedral of Learning");
        Assert.assertTrue(new Preference().like(mockLocation.locationGenerator(mockRandom), mockVisitor.vistorGenerator(mockRandom)));
    }

    //Test professor likes the squirrel hill
    @Test
    public void ProfessorTheSH(){
        Random mockRandom = mock(Random.class);
        Visitor mockVisitor = mock (Visitor.class);
        Location mockLocation = mock (Location.class);
        when(mockVisitor.vistorGenerator(any(Random.class))).thenReturn("Professor");
        when(mockLocation.locationGenerator(any(Random.class))).thenReturn("Squirrel Hill");
        Assert.assertTrue(new Preference().like(mockLocation.locationGenerator(mockRandom), mockVisitor.vistorGenerator(mockRandom)));
    }

    //Test professor likes downtown
    @Test
    public void ProfessorTheDT(){
        Random mockRandom = mock(Random.class);
        Visitor mockVisitor = mock (Visitor.class);
        Location mockLocation = mock (Location.class);
        when(mockVisitor.vistorGenerator(any(Random.class))).thenReturn("Professor");
        when(mockLocation.locationGenerator(any(Random.class))).thenReturn("Downtown");
        Assert.assertTrue(new Preference().like(mockLocation.locationGenerator(mockRandom), mockVisitor.vistorGenerator(mockRandom)));
    }

    //Test Blogger dislikes downtown
    @Test
    public void BloggerTheDT(){
        Random mockRandom = mock(Random.class);
        Visitor mockVisitor = mock (Visitor.class);
        Location mockLocation = mock (Location.class);
        when(mockVisitor.vistorGenerator(any(Random.class))).thenReturn("Blogger");
        when(mockLocation.locationGenerator(any(Random.class))).thenReturn("Downtown");
        Assert.assertFalse(new Preference().like(mockLocation.locationGenerator(mockRandom), mockVisitor.vistorGenerator(mockRandom)));
    }

    //Test Blogger dislikes The point
    @Test
    public void BloggerThePoint(){
        Random mockRandom = mock(Random.class);
        Visitor mockVisitor = mock (Visitor.class);
        Location mockLocation = mock (Location.class);
        when(mockVisitor.vistorGenerator(any(Random.class))).thenReturn("Blogger");
        when(mockLocation.locationGenerator(any(Random.class))).thenReturn("The Point");
        Assert.assertFalse(new Preference().like(mockLocation.locationGenerator(mockRandom), mockVisitor.vistorGenerator(mockRandom)));
    }

    //Test Blogger dislikes The CL
    @Test
    public void BloggerTheCL(){
        Random mockRandom = mock(Random.class);
        Visitor mockVisitor = mock (Visitor.class);
        Location mockLocation = mock (Location.class);
        when(mockVisitor.vistorGenerator(any(Random.class))).thenReturn("Blogger");
        when(mockLocation.locationGenerator(any(Random.class))).thenReturn("The Cathedral of Learning");
        Assert.assertFalse(new Preference().like(mockLocation.locationGenerator(mockRandom), mockVisitor.vistorGenerator(mockRandom)));
    }

    //Test Blogger dislikes Squirrel Hill
    @Test
    public void BloggerTheSH(){
        Random mockRandom = mock(Random.class);
        Visitor mockVisitor = mock (Visitor.class);
        Location mockLocation = mock (Location.class);
        when(mockVisitor.vistorGenerator(any(Random.class))).thenReturn("Blogger");
        when(mockLocation.locationGenerator(any(Random.class))).thenReturn("Squirrel Hill");
        Assert.assertFalse(new Preference().like(mockLocation.locationGenerator(mockRandom), mockVisitor.vistorGenerator(mockRandom)));
    }

    //Test Student likes the point
    @Test
    public void StudentThePoint(){
        Random mockRandom = mock(Random.class);
        Visitor mockVisitor = mock (Visitor.class);
        Location mockLocation = mock (Location.class);
        when(mockVisitor.vistorGenerator(any(Random.class))).thenReturn("Student");
        when(mockLocation.locationGenerator(any(Random.class))).thenReturn("The Point");
        Assert.assertTrue(new Preference().like(mockLocation.locationGenerator(mockRandom), mockVisitor.vistorGenerator(mockRandom)));
    }

    //Test student dislikes the CL
    @Test
    public void StudentTheCL(){
        Random mockRandom = mock(Random.class);
        Visitor mockVisitor = mock (Visitor.class);
        Location mockLocation = mock (Location.class);
        when(mockVisitor.vistorGenerator(any(Random.class))).thenReturn("Student");
        when(mockLocation.locationGenerator(any(Random.class))).thenReturn("The Cathedral of Learning");
        Assert.assertFalse(new Preference().like(mockLocation.locationGenerator(mockRandom), mockVisitor.vistorGenerator(mockRandom)));
    }

    //Test student likes squirrel hill
    @Test
    public void StudentTheSH(){
        Random mockRandom = mock(Random.class);
        Visitor mockVisitor = mock (Visitor.class);
        Location mockLocation = mock (Location.class);
        when(mockVisitor.vistorGenerator(any(Random.class))).thenReturn("Student");
        when(mockLocation.locationGenerator(any(Random.class))).thenReturn("Squirrel Hill");
        Assert.assertTrue(new Preference().like(mockLocation.locationGenerator(mockRandom), mockVisitor.vistorGenerator(mockRandom)));
    }

    //Test student likes Downtown
    @Test
    public void StugentTheDT(){
        Random mockRandom = mock(Random.class);
        Visitor mockVisitor = mock (Visitor.class);
        Location mockLocation = mock (Location.class);
        when(mockVisitor.vistorGenerator(any(Random.class))).thenReturn("Student");
        when(mockLocation.locationGenerator(any(Random.class))).thenReturn("Downtown");
        Assert.assertTrue(new Preference().like(mockLocation.locationGenerator(mockRandom), mockVisitor.vistorGenerator(mockRandom)));
    }

    //Test Businessman dislikes the point
    @Test
    public void BusinessManThePoint(){
        Random mockRandom = mock(Random.class);
        Visitor mockVisitor = mock (Visitor.class);
        Location mockLocation = mock (Location.class);
        when(mockVisitor.vistorGenerator(any(Random.class))).thenReturn("BusinessMan");
        when(mockLocation.locationGenerator(any(Random.class))).thenReturn("The Point");
        Assert.assertFalse(new Preference().like(mockLocation.locationGenerator(mockRandom), mockVisitor.vistorGenerator(mockRandom)));
    }

    //Test businessman dislikes CL
    @Test
    public void BusinessManTheCL(){
        Random mockRandom = mock(Random.class);
        Visitor mockVisitor = mock (Visitor.class);
        Location mockLocation = mock (Location.class);
        when(mockVisitor.vistorGenerator(any(Random.class))).thenReturn("BusinessMan");
        when(mockLocation.locationGenerator(any(Random.class))).thenReturn("The Cathedral of Learning");
        Assert.assertFalse(new Preference().like(mockLocation.locationGenerator(mockRandom), mockVisitor.vistorGenerator(mockRandom)));
    }

    //Test businessman likes squirrel hill
    @Test
    public void BusinessManTheSH(){
        Random mockRandom = mock(Random.class);
        Visitor mockVisitor = mock (Visitor.class);
        Location mockLocation = mock (Location.class);
        when(mockVisitor.vistorGenerator(any(Random.class))).thenReturn("BusinessMan");
        when(mockLocation.locationGenerator(any(Random.class))).thenReturn("Squirrel Hill");
        Assert.assertTrue(new Preference().like(mockLocation.locationGenerator(mockRandom), mockVisitor.vistorGenerator(mockRandom)));
    }

    //Test businessman likes downtown
    @Test
    public void BussinessManTheDT(){
        Random mockRandom = mock(Random.class);
        Visitor mockVisitor = mock (Visitor.class);
        Location mockLocation = mock (Location.class);
        when(mockVisitor.vistorGenerator(any(Random.class))).thenReturn("BusinessMan");
        when(mockLocation.locationGenerator(any(Random.class))).thenReturn("Downtown");
        Assert.assertTrue(new Preference().like(mockLocation.locationGenerator(mockRandom), mockVisitor.vistorGenerator(mockRandom)));
    }


}
