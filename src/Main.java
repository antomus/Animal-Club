import models.Animal;
import models.Club;
import models.Member;

import java.util.Scanner;

public class Main {
    private Club club;
    public Main() {
        this.club = new Club();
    }

    public static void main(String[] args) {
        final Club club = new Club();
        boolean stopProgram = false;
        int memberNumber;
        Member member;
        int animalNumber;
        while (!stopProgram) {
//            1) додати учасника в клуб;
//            2) додати тваринку до учасника клубу.
//            3) видалити тваринку з власника.
//            4) видалити учасника клубу.
//            5) вивести усіх тваринок конкретного власника
//            6) вивести на екран зооклуб.
            System.out.println("1. Add member to club");
            System.out.println("2. Add animal to club member");
            System.out.println("3. Remove animal from club member");
            System.out.println("3. Remove club member");
            System.out.println("3. Remove all animal from club member");
            System.out.println("6. Print all members of animal club");
            System.out.println("7. Exit program");
            System.out.println("");
            System.out.println("Please enter number of needed operation");
            System.out.println("");
            System.out.println("");
            Scanner in = new Scanner(System.in);
            String operationNumber = in.nextLine();
            switch (operationNumber){
                case("1"):
                    System.out.println("Enter member first name \n");
                    String firstName = in.nextLine();
                    if(firstName != null && firstName.trim().length() > 0) {
                        firstName = firstName.trim();
                    } else {
                        System.out.println("first name  cannot be blank\n");
                        break;
                    }
                    System.out.println("Enter member last name \n");
                    String lastName = in.nextLine();
                    if(lastName != null && lastName.trim().length() > 0) {
                        lastName = lastName.trim();
                    } else {
                        System.out.println("last name cannot be blank\n");
                        break;
                    }
                    club.addMember(new Member(firstName, lastName));
                        break;
                case("2"):
                    System.out.println("Enter member number \n");

                    try {
                        memberNumber = Integer.valueOf(in.nextLine());
                        member = club.getMembers().get(memberNumber);
                    } catch (NumberFormatException | IndexOutOfBoundsException ex) {
                        System.out.println("Incorrect value given, try again");
                        break;
                    }
                    System.out.println("Enter animal name \n");
                    String animalName = in.nextLine();
                    if(animalName != null && animalName.trim().length() > 0) {
                        animalName = animalName.trim();
                    } else {
                        System.out.println("animal name cannot be blank\n");
                        break;
                    }
                    System.out.println("Enter animal kind \n");
                    String kind = in.nextLine();
                    if(kind != null && kind.trim().length() > 0) {
                        kind = kind.trim();
                    } else {
                        System.out.println("animal kind cannot be blank\n");
                        break;
                    }
                    member.addAnimal(new Animal(animalName, kind));
                    break;
                case("3"):
                    System.out.println("Enter member number \n");
                    try {
                        memberNumber = Integer.valueOf(in.nextLine());
                        member = club.getMembers().get(memberNumber);
                    } catch (NumberFormatException | IndexOutOfBoundsException ex) {
                        System.out.println("Incorrect value given, try again");
                        break;
                    }
                    System.out.println("Enter animal number \n");
                    animalNumber = in.nextInt();
                    member.removeAnimal(animalNumber);
                    break;
                case("4"):
                    System.out.println("Enter member number \n");
                    try {
                        memberNumber = Integer.valueOf(in.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Incorrect value given, try again");
                        break;
                    }
                    club.removeMember(memberNumber);
                    break;
                case("5"):
                    System.out.println("3. Remove all animal from club member \n");
                    System.out.println("Enter member number \n");
                    try {
                        memberNumber = Integer.valueOf(in.nextLine());
                        member = club.getMembers().get(memberNumber);
                        member.removeAllAnimal();
                    } catch (NumberFormatException | IndexOutOfBoundsException ex) {
                        System.out.println("Incorrect value given, try again");
                        break;
                    }
                    break;
                case("6"):
                    System.out.println("6.Print all members of animal club \n");
                    club.print();
                    break;
                case("7"):
                    System.out.println("7.Exit program \n");
                    stopProgram = true;
                    break;

            }
        }
    }

}
