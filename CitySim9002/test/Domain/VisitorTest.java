package Domain;

import org.junit.Assert;
import org.junit.Test;
import program.Visitor;

import java.util.Random;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by lszlawrence on 16/10/5.
 */
public class VisitorTest {

    /*
        *Visitor generator should be able to generate professor.
        *Test if the visitor generator can generate professor. */
    @Test
    public void ifProfessorOneOfFour(){
        Random mockRandom = mock(Random.class);
        when(mockRandom.nextInt(any(Integer.class))).thenReturn(2);
        Assert.assertEquals("Professor", new Visitor().vistorGenerator(mockRandom));
    }


    /*
        *Visitor generator should be able to generate BusinessMan.
        *Test if the visitor generator can generate BusinessMan. */
    @Test
    public void ifBusinessManOneOfFour(){
        Random mockRandom = mock(Random.class);
        when(mockRandom.nextInt(any(Integer.class))).thenReturn(1);
        Assert.assertEquals("BusinessMan",new Visitor().vistorGenerator(mockRandom));
    }


    /*
        *Visitor generator should be able to generate Student.
        *Test if the visitor generator can generate Student. */
    @Test
    public void ifStudentOneOfFour(){
        Random mockRandom = mock(Random.class);
        when(mockRandom.nextInt(any(Integer.class))).thenReturn(0);
        Assert.assertEquals("Student", new Visitor().vistorGenerator(mockRandom));
    }


    /*
        *Visitor generator should be able to generate Blogger.
        *Test if the visitor generator can generate Blogger. */
    @Test
    public void ifBloggerOneOfFour(){
        Random mockRandom = mock(Random.class);
        when(mockRandom.nextInt(any(Integer.class))).thenReturn(3);
        Assert.assertEquals(new Visitor().vistorGenerator(mockRandom), "Blogger");
    }

}
