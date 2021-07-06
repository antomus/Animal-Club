package models;

import java.util.ArrayList;
import java.util.List;

public class Member {
    public List<Animal> getAnimals() {
        return animals;
    }

    private List<Animal> animals;
    private final String firstName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private final String lastName;

    public Member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        if(animals.add(animal)){
            System.out.println("new animal was added successfully");
        } else {
            System.out.println("Animal adding error");
        }
    }

    public void removeAnimal(int index){
        try{
            Animal animal = this.animals.remove(index);
            if(animal != null){
                System.out.println("animal was removed from member successfully");
            } else {
                System.out.println("animal removing error");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("please provide valid index");
        }
    }

    public void removeAllAnimal(){
        this.animals.clear();
    }

}
