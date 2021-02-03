package com.example.mmongo.mmongoexample;

import org.springframework.data.annotation.TypeAlias;

import java.util.HashMap;

@TypeAlias("3")
public class SomeLogSubDynamicField extends SomeLog {

    private HashMap dynamicField = new HashMap();


    public SomeLogSubDynamicField(String type) {
        super(type);
    }

    public HashMap getDynamicField() {
        return dynamicField;
    }

    public void setDynamicField(HashMap dynamicField) {
        this.dynamicField = dynamicField;
    }

    @Override
    public String getType() {
        return "3";
    }
}
