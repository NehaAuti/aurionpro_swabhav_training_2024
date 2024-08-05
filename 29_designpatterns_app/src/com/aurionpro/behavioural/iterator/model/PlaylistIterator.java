package com.aurionpro.behavioural.iterator.model;

import java.util.List;

public class PlaylistIterator implements SongIterator {
    private List<Song> songs;
    private int position;

    public PlaylistIterator(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public Song next() {
        if (this.hasNext()) {
            return songs.get(position++);
        }
        return null;
    }
}
