package com.szewczyk.learning.patterns.bridge.standard;

import com.szewczyk.learning.patterns.bridge.Artist;
import com.szewczyk.learning.patterns.bridge.View;

import static java.lang.String.format;

public final class FixedSizeArtistView implements View {
    private final Artist artist;
    private final long length;
    private final long height;

    public FixedSizeArtistView(Artist artist, long length, long height) {
        this.artist = artist;
        this.length = length;
        this.height = height;
    }

    @Override
    public final void display() {
        System.out.println(format("Artist: %s, size: [length: %s, height: %s]" + artist, length, height));
    }
}
