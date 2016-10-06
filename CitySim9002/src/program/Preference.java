package program;

import java.util.Random;

/**
 * Created by lszlawrence on 16/10/4.
 */
public class Preference {





    public boolean like(String location, String visitor){
        if(visitor == "Student"){
            if(location == "The Cathedral of Learning"){return false;}
            if(location == "Squirrel Hill"){return true;}
            if(location == "The Point"){return true;}
            if(location == "Downtown"){return true;}

        }

        if(visitor == "BusinessMan"){
            if(location == "The Cathedral of Learning"){return false;}
            if(location == "Squirrel Hill"){return true;}
            if(location == "The Point"){return false;}
            if(location == "Downtown"){return true;}

        }

        if(visitor == "Professor"){
            if(location == "The Cathedral of Learning"){return true;}
            if(location == "Squirrel Hill"){return true;}
            if(location == "The Point"){return true;}
            if(location == "Downtown"){return true;}

        }

        if(visitor == "Blogger"){
            if(location == "The Cathedral of Learning"){return false;}
            if(location == "Squirrel Hill"){return false;}
            if(location == "The Point"){return false;}
            if(location == "Downtown"){return false;}

        }
        return Boolean.parseBoolean(null);
    }
}
