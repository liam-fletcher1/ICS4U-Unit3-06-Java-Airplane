/*
 * The Airplane Test Flight Program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2021-12-14
 */

public class Jet extends Airplane {
    // Initializing fields
    private static final int MULTIPLIER = 2;

    /**
     * Setting field values 
     */
    public Jet() {
        super();
    }

    /**
     * This method sets the speed of the jet.
     */
    public void setSpeed(int speed) {
        super.setSpeed(speed * MULTIPLIER);
    }

    /**
     * This method accelerates the jet.
     */
    public void accelerate() {
        super.setSpeed(getSpeed() * 2);
    }
}
