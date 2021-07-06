package models;

import java.util.ArrayList;
import java.util.List;

public class Club {
    private List<Member> members;
    public Club() {
        this.members = new ArrayList<>();
    }

    public List<Member> getMembers() {
        return members;
    }

    public void addMember(Member member) {
        if(members.add(member)){
            System.out.println("new member was added to club successfully");
        } else {
            System.out.println("Member adding error");
        }
    }

    public void removeMember(int index) {
        try{
            Member member = this.members.remove(index);
            if(member != null){
                System.out.println("member was removed from club successfully");
            } else {
                System.out.println("Member removing error");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("please provide valid index");
        }
    }

    public void print() {
        for (int i = 0; i < this.members.size(); i++) {
            System.out.println("Member #"+i+" "+members.get(i).getFirstName()+" "+members.get(i).getLastName());
            List<Animal> animals = members.get(i).getAnimals();
            if(animals.size() > 0) {
                for (int j = 0; j < animals.size(); j++) {
                    System.out.println("Animal #"+j+" "+animals.get(j).getName()+" "+animals.get(j).getKind());
                }

            }
        }
    }

}
