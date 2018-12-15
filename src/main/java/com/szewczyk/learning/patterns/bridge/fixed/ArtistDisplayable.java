package com.szewczyk.learning.patterns.bridge.fixed;

import com.szewczyk.learning.patterns.bridge.Artist;

public final class ArtistDisplayable implements Displayable {
    private final Artist artist;

    public ArtistDisplayable(Artist artist) {
        this.artist = artist;
    }

    @Override
    public final String display() {
        return this.artist.getName();
    }
}
