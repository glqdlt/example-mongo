package com.example.mmongo.mmongoexample;

import org.springframework.data.annotation.TypeAlias;

@TypeAlias("1")
public class SomeLogSub extends SomeLog {
    private String columnd1;

    public String getColumnd1() {
        return columnd1;
    }

    public void setColumnd1(String columnd1) {
        this.columnd1 = columnd1;
    }

    @Override
    public String getType() {
        return "1";
    }
}
