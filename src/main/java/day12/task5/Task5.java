package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Mark Wakefield", 19));
        members1.add(new MusicArtist("Mike Shinoda", 19));
        members1.add(new MusicArtist("Brad Delson", 19));
        members1.add(new MusicArtist("Joe Hahn", 19));
        members1.add(new MusicArtist("Rob Bourdon", 19));
        members1.add(new MusicArtist("Dave Farrell", 19));
        
        MusicBand mb1 = new MusicBand("Linkin Park", 1996, members1);
        
        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Andrew :)", 19));       
        MusicBand mb2 = new MusicBand("New LP", 2020, members2);
       
//        mb1.removeMember("Mark Wakefield");
        
        mb1.addMember(new MusicArtist("Chester Bennington", 19));
        
        mb1.printMembers();
        System.out.println();
        mb2.printMembers();
        System.out.println();
        System.out.println();
        
        MusicBand.transferMembers(mb1, mb2);
        mb1.printMembers();
        System.out.println();
        mb2.printMembers();
    }
}
