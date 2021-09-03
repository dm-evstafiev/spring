package org.example.springtest;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    public void setMusicList(List<Music> list) {
        this.musicList = list;
    }

    public void playMusic() {
        for (Music music : musicList) {
            System.out.println("Play: " + music.getSong());
        }
    }

}
