package program;

import java.util.Random;

/**
 * Created by lszlawrence on 16/10/4.
 */
public class Location {

    public final static String[] locations = {"The Cathedral of Learning", "Squirrel Hill", "The Point","Downtown"};

    public  String locationGenerator (int index, int id){


        return locations[index];
    }
}
