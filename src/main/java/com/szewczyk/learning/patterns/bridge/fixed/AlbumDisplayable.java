package com.szewczyk.learning.patterns.bridge.fixed;

import com.szewczyk.learning.patterns.bridge.Album;

public final class AlbumDisplayable implements Displayable {
    private final Album album;

    public AlbumDisplayable(Album album) {
        this.album = album;
    }

    @Override
    public final String display() {
        return this.album.getTitle();
    }
}
