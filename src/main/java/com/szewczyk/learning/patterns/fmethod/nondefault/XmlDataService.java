package com.szewczyk.learning.patterns.fmethod.nondefault;

import com.szewczyk.learning.patterns.fmethod.Data;
import com.szewczyk.learning.patterns.fmethod.JsonData;
import com.szewczyk.learning.patterns.fmethod.def.DataService;

public class XmlDataService extends DataService {
    @Override
    protected Data createData() {
        return new JsonData();
    }
}
