package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand mb1 = new MusicBand("Nirvana", 1987);
        MusicBand mb2 = new MusicBand("Metallica", 1981);
        MusicBand mb3 = new MusicBand("Sum41", 1996);
        MusicBand mb4 = new MusicBand("System Of a Down", 1994);
        MusicBand mb5 = new MusicBand("Rolling Stone", 1967);
        MusicBand mb6 = new MusicBand("Dotan", 2011);
        MusicBand mb7 = new MusicBand("Some unknownBand", 2010);
        MusicBand mb8 = new MusicBand("Some other unknowngBand", 2019);
        MusicBand mb9 = new MusicBand("Some new stupid Band", 2018);
        MusicBand mb10 = new MusicBand("Some new stupid Band2", 2020);
        List<MusicBand> bandsList = new ArrayList<MusicBand>(
                Arrays.asList(mb1, mb2, mb3, mb4, mb5, mb6, mb7, mb8, mb9, mb10));
        Collections.shuffle(bandsList);

        List<MusicBand> bandsAftrer2000 = new ArrayList<>();
        bandsAftrer2000 = groupsAfter2000(bandsList);
        System.out.println(bandsList.toString());
        System.out.println(bandsAftrer2000.toString());
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> resultList = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                resultList.add(band);
            }
        }
        return resultList;
    }
}
