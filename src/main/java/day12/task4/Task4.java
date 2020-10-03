package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        MusicBand mb1 = new MusicBand("Linkin Park", 1996, new ArrayList<String>(Arrays.asList("Mark Wakefield",
                "Mike Shinoda", "Brad Delson", "Joe Hahn", "Rob Bourdon", "Dave Farrell")));
        MusicBand mb2 = new MusicBand("New LP", 2020, new ArrayList<String>(Arrays.asList("Andrew :)")));
       
        mb1.removeMember("Mark Wakefield");
        mb1.addMember("Chester Bennington");
        
        MusicBand.transferMembers(mb1, mb2);
        mb1.printMembers();
        System.out.println();
        mb2.printMembers();
    }
}
