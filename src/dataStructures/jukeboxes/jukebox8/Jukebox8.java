package dataStructures.jukeboxes.jukebox8;

import dataStructures.jukeboxes.jukebox2.MockSongs;
import dataStructures.jukeboxes.jukebox2.SongV3;

import java.util.*;

public class Jukebox8 {
    public static void main(String[] args) {
          new Jukebox8().go();
//        Jukebox8 jukebox = new Jukebox8();
//        jukebox.go();
    }
    public void go() {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);
        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);
        Set<SongV3> songSet = new HashSet<>(songList);
//        Set<SongV3> songSet = new TreeSet<>(songList);
        System.out.println(songSet);
    }
}
