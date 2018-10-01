package com.szewczyk.learning.patterns.fmethod.def;

import com.szewczyk.learning.patterns.fmethod.Data;
import com.szewczyk.learning.patterns.fmethod.DataStorage;
import com.szewczyk.learning.patterns.fmethod.DefaultData;

public abstract class DataService {
    private Data data;

    public void createAndInitialize() {
        this.data = createData();
        this.data.initialize();
    }

    protected Data createData() {
        return new DefaultData();
    }

    void storeData(DataStorage dataStorage) {
        dataStorage.storeData(data);
    }
}
