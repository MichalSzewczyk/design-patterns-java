package com.szewczyk.learning.patterns.prototype;

import java.net.URI;
import java.util.Collection;

public abstract class DbConnectionConfiguration implements Cloneable<DbConnectionConfiguration> {
    protected final Collection<URI> databaseNodes;

    public DbConnectionConfiguration(Collection<URI> databaseNodes) {
        this.databaseNodes = databaseNodes;
    }

    public final void addNode(URI nodeUri) {
        databaseNodes.add(nodeUri);
    }

    public final Collection<URI> getNodes() {
        return databaseNodes;
    }
}
