package com.szewczyk.learning.patterns.fmethod.def;

import com.szewczyk.learning.patterns.fmethod.Data;
import com.szewczyk.learning.patterns.fmethod.JsonData;

public class XmlDataService extends DataService {
    @Override
    protected Data createData() {
        return new JsonData();
    }
}
