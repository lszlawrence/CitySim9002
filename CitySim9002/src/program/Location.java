package program;

import java.util.Random;

/**
 * Created by lszlawrence on 16/10/4.
 */
public class Location {

    //store different locations in a string array
    public final static String[] locations = {"The Cathedral of Learning", "Squirrel Hill", "The Point","Downtown"};

    //generate locations corresponds to the index
    public  String locationGenerator (Random rand){


        return locations[rand.nextInt(4)];
    }
}
