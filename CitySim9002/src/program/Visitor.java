package program;

import java.util.Random;

/**
 * Created by lszlawrence on 16/10/4.
 */
public class Visitor {

    //Store visitor type in a string array
    public final static String[] visitors = {"Student", "BusinessMan", "Professor", "Blogger"};

    //give the visitor type corresponds to the index
    public String vistorGenerator(Random rand) {

        return visitors[rand.nextInt(4)];
    }
}
