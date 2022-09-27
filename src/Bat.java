/**
 *
 Create a Bat class that can fly(), eatHumans(), and attackTown() and has a default energy level of 300.
 */

public class Bat extends Mammal{


    int energyLevel = 300;

    @Override
    public int displayEnergy(){
        System.out.println(this.energyLevel);
        return this.energyLevel;
    }

    /**
     * For the fly() method, print the sound of a bat taking off and decrease its energy by 50.
     */
    public void fly(){}


    /**
     * For the eatHumans() method, print the so- well, never mind, just increase its energy by 25.
     */
    public void eatHumans(){}


    /**
     * For the attackTown() method, print the sound of a town on fire and decrease its energy by 100.
     */
    public void attackTown(){}
}
