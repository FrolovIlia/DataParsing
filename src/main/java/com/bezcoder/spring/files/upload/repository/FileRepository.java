package com.bezcoder.spring.files.upload.repository;

import com.bezcoder.spring.files.upload.model.FileInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface FileRepository extends MongoRepository<FileInfo, String> {
    Optional<FileInfo> findFileByName(String name);
}
