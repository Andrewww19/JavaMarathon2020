package day12.task4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }
    
    public static void transferMembers (MusicBand A, MusicBand B) {
        B.members = Stream.concat(
                A.members.stream(), 
                B.members.stream()).collect(Collectors.toList());
        A.members.removeAll(A.members);
    }
    
    public void printMembers() {
        System.out.println("Members of " + this.name + " :");
        for(String member : this.members) {
            System.out.println(member);
        }
    }
    
    public void addMember(String member) {
        this.members.add(member);
    }
    
    public void removeMember(String member) {
        this.members.remove(member);
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
   
    public List<String> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "name = " + name + ", year = " + year;
    }

}
