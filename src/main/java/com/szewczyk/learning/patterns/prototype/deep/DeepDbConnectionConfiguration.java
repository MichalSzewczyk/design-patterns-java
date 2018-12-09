package com.szewczyk.learning.patterns.prototype.deep;

import com.szewczyk.learning.patterns.prototype.DbConnectionConfiguration;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;

public final class DeepDbConnectionConfiguration extends DbConnectionConfiguration {
    public DeepDbConnectionConfiguration(Collection<URI> databaseNodes) {
        super(databaseNodes);
    }

    @Override
    public final DbConnectionConfiguration clone() {
        return new DeepDbConnectionConfiguration(new ArrayList<>(super.databaseNodes));
    }
}
