package motor;

import fiets.Racefiets;

/**
 * Created by Beta on 7/19/2016.
 */
public class GPMotor {

    public static void main(String[] args) {

        fiets.Bakfiets fiets1 = null;
        fiets1.Familie("Race motor GP500", "Yamaha", 2);

        Racefiets racefiets = new Racefiets();
        racefiets.Snel("Race motor", "'n viertakt motor.");
    }
}
