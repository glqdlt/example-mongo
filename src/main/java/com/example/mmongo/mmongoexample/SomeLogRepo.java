package com.example.mmongo.mmongoexample;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface SomeLogRepo extends MongoRepository<SomeLog, String> {
    List<SomeLog> findAllByRegDateBetween(LocalDateTime from, LocalDateTime to);
    List<SomeLog> findTop1000ByOrderByRegDateDesc();
}
