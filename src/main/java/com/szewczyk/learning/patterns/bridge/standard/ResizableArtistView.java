package com.szewczyk.learning.patterns.bridge.standard;

import com.szewczyk.learning.patterns.bridge.Artist;
import com.szewczyk.learning.patterns.bridge.View;

import static java.lang.String.format;

public final class ResizableArtistView implements View {
    private final Artist artist;
    private long length;
    private long height;

    public ResizableArtistView(Artist artist, long length, long height) {
        this.artist = artist;
        this.length = length;
        this.height = height;
    }

    @Override
    public final void display() {
        System.out.println(format("Artist: %s, size: [length: %s, height: %s]" + artist, length, height));
    }

    public final void resize(long length, long height) {
        this.length = length;
        this.height = height;
    }
}
