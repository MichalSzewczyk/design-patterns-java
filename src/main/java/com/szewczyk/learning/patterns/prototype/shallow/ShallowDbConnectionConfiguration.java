package com.szewczyk.learning.patterns.prototype.shallow;

import com.szewczyk.learning.patterns.prototype.DbConnectionConfiguration;

import java.net.URI;
import java.util.Collection;

public final class ShallowDbConnectionConfiguration extends DbConnectionConfiguration {
    public ShallowDbConnectionConfiguration(Collection<URI> databaseNodes) {
        super(databaseNodes);
    }

    @Override
    public final DbConnectionConfiguration clone() {
        return new ShallowDbConnectionConfiguration(super.databaseNodes);
    }
}
