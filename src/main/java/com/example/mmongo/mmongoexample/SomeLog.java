package com.example.mmongo.mmongoexample;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@Document(collection = "summary_log")
public abstract class SomeLog {
    private String id = UUID.randomUUID().toString();
    private LocalDateTime regDate = LocalDateTime.now();
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public SomeLog(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }
}
