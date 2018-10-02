package com.szewczyk.learning.patterns.fmethod.nondefault;

import com.szewczyk.learning.patterns.fmethod.Data;
import com.szewczyk.learning.patterns.fmethod.JsonData;

public class JsonDataService extends DataService {
    @Override
    protected Data createData() {
        return new JsonData();
    }
}
