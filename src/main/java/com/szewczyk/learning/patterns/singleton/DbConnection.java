package com.szewczyk.learning.patterns.singleton;

import static java.util.Objects.isNull;

public final class DbConnection {
    private static final Object LOCK = new Object();
    private static volatile DbConnection dbConnection;

    private DbConnection() {
    }

    public static DbConnection getInstance() {
        if (isNull(dbConnection)) {
            synchronized (LOCK) {
                if (isNull(dbConnection)) {
                    dbConnection = new DbConnection();
                }
            }
        }
        return dbConnection;
    }
}
