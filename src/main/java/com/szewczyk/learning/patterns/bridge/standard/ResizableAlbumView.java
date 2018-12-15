package com.szewczyk.learning.patterns.bridge.standard;

import com.szewczyk.learning.patterns.bridge.Album;
import com.szewczyk.learning.patterns.bridge.View;

import static java.lang.String.format;

public final class ResizableAlbumView implements View {
    private final Album album;
    private long length;
    private long height;

    public ResizableAlbumView(Album album) {
        this.album = album;
    }

    @Override
    public final void display() {
        System.out.println(format("Album: %s, size: [length: %s, height: %s]" + album, length, height));
    }

    public final void resize(long length, long height) {
        this.length = length;
        this.height = height;
    }
}
