package com.szewczyk.learning.patterns.observer.poling.impl;

import com.szewczyk.learning.patterns.observer.poling.Observable;
import com.szewczyk.learning.patterns.observer.poling.Observer;

public class ObservableString implements Observable<String> {

    @Override
    public void subscribe(Observer<String> observer) {

    }

    @Override
    public String getActualValue() {
        return null;
    }
}
