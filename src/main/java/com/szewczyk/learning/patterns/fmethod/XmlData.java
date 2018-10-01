package com.szewczyk.learning.patterns.fmethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class XmlData implements Data {
    @Override
    public void initialize() {
        log.info("Initialization of XML data.");
    }
}
