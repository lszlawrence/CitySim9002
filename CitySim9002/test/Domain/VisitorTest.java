package Domain;

import org.junit.Assert;
import org.junit.Test;
import program.Visitor;

import static org.mockito.Mockito.mock;

/**
 * Created by lszlawrence on 16/10/5.
 */
public class VisitorTest {

    /*
        *Visitor generator should be able to generate professor.
        *Test if the visitor generator can generate professor. */
    @Test
    public void ifProfessorOneOfFour(){

        Assert.assertEquals("Professor", new Visitor().vistorGenerator(2, 1));
    }


    /*
        *Visitor generator should be able to generate BusinessMan.
        *Test if the visitor generator can generate BusinessMan. */
    @Test
    public void ifBusinessManOneOfFour(){
        Assert.assertEquals("BusinessMan",new Visitor().vistorGenerator(1, 1));
    }


    /*
        *Visitor generator should be able to generate Student.
        *Test if the visitor generator can generate Student. */
    @Test
    public void ifStudentOneOfFour(){
        Assert.assertEquals("Student", new Visitor().vistorGenerator(0, 1));
    }


    /*
        *Visitor generator should be able to generate Blogger.
        *Test if the visitor generator can generate Blogger. */
    @Test
    public void ifBloggerOneOfFour(){
        Assert.assertEquals(new Visitor().vistorGenerator(3, 1), "Blogger");
    }

}
