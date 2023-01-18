package com.example.dataparsing.repository;

import com.example.dataparsing.model.Parser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParserRepository extends MongoRepository<Parser, String> {
    Optional<Parser> findAddressById(String id);
}
