/**
 * Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()
 */

public class Gorilla extends Mammal {


    /**
     * For the throwSomething() method, have it print out a message indicating that the gorilla has thrown something, as well as decrease the energy level by 5
     */
    public void throwSomething(){
        System.out.println("The gorilla has thrown something!!!");
        this.energyLevel -= 5;

    }

    /**
     * For the eatBananas() method, have it print out a message indicating the gorilla's satisfaction and increase its energy by 10
     */
    public void eatBananas(){
        this.energyLevel += 10;
        System.out.println("The gorilla's very satisfied and is bounding with energy!!!!");
    }

    /**
     * For the climb() method, have it print out a message indicating the gorilla has climbed a tree and decrease its energy by 10
     */
    public void climb(){
        this.energyLevel -= 10;
        System.out.println("You know, gurrrl!");
    }
}
