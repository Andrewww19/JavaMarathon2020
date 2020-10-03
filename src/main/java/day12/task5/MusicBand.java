package day12.task5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static void transferMembers(MusicBand A, MusicBand B) {
        B.members = Stream.concat(A.members.stream(), B.members.stream()).collect(Collectors.toList());
        A.members.clear();
    }

    public void printMembers() {
        System.out.println("Members of " + this.name + " :");

        for (MusicArtist member : this.members) {
            System.out.println(member);
        }
    }

    public void addMember(MusicArtist member) {
        this.members.add(member);
    }

//    public void removeMember(String name) {
//        Comparator<MusicArtist> c = new Comparator<MusicArtist>() {
//            public int compare(MusicArtist u1, MusicArtist u2) {
//                return u1.getName().compareTo(u2.getName());
//            }
//        };
//        this.members.remove(Collections.binarySearch(members, new MusicArtist(name, 0), c));
//    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "name = " + name + ", year = " + year;
    }

}
