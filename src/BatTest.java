/**
 * Create a BatTest class to instantiate a bat and have it attack three towns, eat two humans, and fly twice.
 */

public class BatTest {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.displayEnergy();
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        bat.eatHumans();
        bat.eatHumans();
        bat.fly();
        bat.fly();
        bat.displayEnergy();
    }
}
