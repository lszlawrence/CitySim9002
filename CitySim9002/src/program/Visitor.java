package program;

import java.util.Random;

/**
 * Created by lszlawrence on 16/10/4.
 */
public class Visitor {

    public final static String[] visitors = {"Student", "BusinessMan", "Professor", "Blogger"};

    public String vistorGenerator(int typeIndex, int id) {

        return visitors[typeIndex];
    }
}
