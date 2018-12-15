package com.szewczyk.learning.patterns.bridge.standard;

import com.szewczyk.learning.patterns.bridge.Album;
import com.szewczyk.learning.patterns.bridge.View;

import static java.lang.String.format;

public final class FixedSizeAlbumView implements View {
    private final Album album;
    private final long length;
    private final long height;

    public FixedSizeAlbumView(Album album, long length, long height) {
        this.album = album;
        this.length = length;
        this.height = height;
    }

    @Override
    public final void display() {
        System.out.println(format("Album: %s, size: [length: %s, height: %s]" + album, length, height));
    }
}
