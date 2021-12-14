/*
 * The Airplane Test Flight Program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2021-12-14
 */

public class Airplane {
    // set up fields
    private int speed;

    /**
     * Setting field values with constructor
     */
    public Airplane() {
        this.speed = 0;
    }

    /**
     * This method gets the speed of the airplane
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * This method sets the speed of the airplane.
     */
    public void setSpeed(int userSpeed) {
        this.speed = userSpeed;
    }
}
