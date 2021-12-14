/*
 * The Airplane Test Flight Program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2021-12-14
 */

public class AirMain {

    /**
     * This function runs flight tests for Airplanes
     */
    public static void main(String[] args) {

        // Setting speed
        Airplane biplane = new Airplane();
        biplane.setSpeed(212);
        System.out.println(biplane.getSpeed());

        // Setting speed
        Jet jetPlane = new Jet();
        jetPlane.setSpeed(422);
        System.out.println(jetPlane.getSpeed());

        //counter var
        int counter = 0;

        // Loop that tests acceleration on each plane
        while (counter < 4) {

            // Accelerating jetPlane
            jetPlane.accelerate();
            System.out.println(jetPlane.getSpeed());
            if (jetPlane.getSpeed() > 5000) {

                // Accelerating the biplane should the jetPlane speed be over 5000
                biplane.setSpeed(biplane.getSpeed() * 2);
            } else {

                // Accelerating the jetPlane 
                jetPlane.accelerate();
            }

            // + 1 counter
            counter++;
        }

        // Printing out the final speed of biplane
        System.out.println(biplane.getSpeed());
    }
}
