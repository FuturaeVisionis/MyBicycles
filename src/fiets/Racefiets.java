package fiets;


/**
 * Created by Beta on 7/19/2016.
 */
public class Racefiets {

    public void Snel(String vervoermiddel, String aandrijving) {
        System.out.println("De " + vervoermiddel + " heeft als aandrijving " + aandrijving);
    }

    public static void main(String[] args) {

        Bakfiets fiets = null;
        fiets.Familie("Bakfiets", "Batavus", 3);

        Bakfiets bakfiets = new Bakfiets();
        bakfiets.Boodschappen();
    }
}
