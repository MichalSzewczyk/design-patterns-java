package com.szewczyk.learning.patterns.fmethod.nondefault;

import com.szewczyk.learning.patterns.fmethod.Data;
import com.szewczyk.learning.patterns.fmethod.DataStorage;

public abstract class DataService {
    private Data data;

    public void createAndInitialize() {
        this.data = createData();
        this.data.initialize();
    }

    protected abstract Data createData();

    void storeData(DataStorage dataStorage) {
        dataStorage.storeData(data);
    }
}
