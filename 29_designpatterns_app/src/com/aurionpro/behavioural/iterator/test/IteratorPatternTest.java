package com.aurionpro.behavioural.iterator.test;

import java.util.Iterator;

import com.aurionpro.behavioural.iterator.model.Playlist;
import com.aurionpro.behavioural.iterator.model.Song;

import com.aurionpro.behavioural.iterator.model.SongIterator;

public class IteratorPatternTest {

	public static void main(String[] args) {
		Playlist playlist = new Playlist();
        playlist.addSong(new Song("Song 1", "Artist 1"));
        playlist.addSong(new Song("Song 2", "Artist 2"));
        playlist.addSong(new Song("Song 3", "Artist 3"));

        SongIterator iterator = playlist.createIterator();
        while (iterator.hasNext()) {
            Song song = (Song) iterator.next();
            System.out.println("Title: " + song.getTitle() + ", Artist: " + song.getArtist());
        }
    }
}