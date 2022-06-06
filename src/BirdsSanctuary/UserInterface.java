package BirdsSanctuary;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;

public class UserInterface {
    Scanner scan = new Scanner(System.in);

    int ShowChoice() {
        System.out.println("Enter : 1] Add Bird \nEnter : 2] Remove Bird \nEnter : 3] Update Bird" +
                " \nEnter : 4] Print Bird \nEnter : 5] Exits");
        int choice = scan.nextInt();
        return choice;
    }
    void printBird(Set<Bird> birds) {
        for (Bird bird : birds) {
            System.out.println(bird.toString());
        }
    }
   /* public BirdsSanctuary.Birds createBird(){
        BirdsSanctuary.Birds birds = new BirdsSanctuary.Birds();
        return birds;
    }*/
}

