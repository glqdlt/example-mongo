package com.example.mmongo.mmongoexample;

import org.springframework.data.annotation.TypeAlias;

@TypeAlias("2")
public class SomeLogSub2Renamer extends SomeLog {


    public SomeLogSub2Renamer(String type) {
        super(type);
    }

    private String testField;

    public String getTestField() {
        return testField;
    }

    public void setTestField(String testField) {
        this.testField = testField;
    }
}
