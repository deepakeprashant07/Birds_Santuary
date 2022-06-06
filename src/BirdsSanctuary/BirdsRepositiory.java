package BirdsSanctuary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BirdsRepositiory {
    private Set<Bird> birdList = new HashSet<>();

    public Set<Bird> getBirdList() {
        return birdList;
    }

    public void add(Penguin penguin) {
        birdList.add(penguin);
    }

    public void add(Eagle eagle) {
        birdList.add(eagle);
    }

    public void add(Parrot parrot) {
        birdList.add(parrot);
    }

    public void add(Duck duck) {
        birdList.add(duck);
    }

    public Bird getBirdId(String birdId) {
        /* {
            if (birdId.equals(birdList.))
                return birdList.get(i);
        }*/
        for (Bird bird : birdList) {
            if (birdId.equals(bird.id)) {

                return bird;
            }
        }
        return null;

    }

    public void remove(Bird bird) {
        birdList.remove(bird);
    }

    public void updateBirdsData(Bird bird) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1] Change Bird Name \n2] Change Colour \n3] Change Age");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Bird Name");
                bird.name = scan.next();
                birdList.add(bird);
                break;
            case 2:
                System.out.println("Enter Bird color");
                bird.colour = scan.next();
                birdList.add(bird);
                break;
            case 3:
                System.out.println("Enter Bird Age");
                bird.age = scan.nextInt();
                birdList.add(bird);
                break;
            default:
                System.out.println("Sorry Wrong Choice");
        }
    }
}
