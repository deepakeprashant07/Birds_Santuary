package BirdsSanctuary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BirdsSanctuary {
    public static final int addBirds = 1;
    public static final int removeBirds = 2;
    public static final int updateBirds = 3;
    public static final int printBirds = 4;
    public static final int Exits = 5;
    BirdsRepositiory birdRepository = new BirdsRepositiory();
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("WELCOME BIRDS SANCTUARY");
        UserInterface userInterface = new UserInterface();
        BirdsSanctuary birdsSanctuary = new BirdsSanctuary();
        while (true) {
            birdsSanctuary.handleChoice(userInterface.ShowChoice());
        }
    }

    private void handleChoice(int showChoice) {
        switch (showChoice) {
            case addBirds:
                addBird();
                break;
            case removeBirds:
                removeBird();
                break;
            case updateBirds:
                updateBird();
                break;
            case printBirds:
                UserInterface userInterface = new UserInterface();
                Set<Bird> birdList = birdRepository.getBirdList();
                userInterface.printBird(birdList);
                break;
            case Exits:
                System.out.println("Thank You..!");
                System.exit(0);
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }

    private void updateBird() {
        System.out.println("Enter Birds Id");
        String Id = scan.next();
        Bird bird = birdRepository.getBirdId(Id);
        if (bird!=null) {
            birdRepository.updateBirdsData(bird);
            System.out.println("Successfully Update Information");
        }
        else {
            System.out.println("Sorry..! Invalid Data");
        }
    }

    void addBird() {
        Duck duck = new Duck();
        duck.name = "Angry Duck";
        duck.id = "D001";
        duck.age = 4;
        duck.colour = "White";

        Parrot parrot = new Parrot();
        parrot.name = "My Parrot";
        parrot.id = "PA001";
        parrot.age = 2;
        parrot.colour = "Green";

        Penguin penguin = new Penguin();
        penguin.name = "Penguin";
        penguin.id = "PE001";
        penguin.age = 4;
        penguin.colour = "White";

        Penguin penguin2 = new Penguin();
        penguin2.name = "Penguin";
        penguin2.id = "PE001";
        penguin2.age = 555;
        penguin2.colour = "White";

        Eagle eagle = new Eagle();
        eagle.name = "Eagle";
        eagle.id = "O001";
        eagle.age = 4;
        eagle.colour = "Black";
        System.out.println("Add Successfully");

        birdRepository.add(duck);
        birdRepository.add(parrot);
        birdRepository.add(penguin);
        birdRepository.add(eagle);
        birdRepository.add(eagle);
        birdRepository.add(penguin2);
    }

    private void removeBird() {
        System.out.println("Enter Birds Id");
        String Id = scan.next();
        Bird bird = birdRepository.getBirdId(Id);
        birdRepository.remove(bird);

    }
}
