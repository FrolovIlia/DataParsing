package com.bezcoder.spring.files.upload;

import javax.annotation.Resource;

import com.bezcoder.spring.files.upload.model.FileInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.bezcoder.spring.files.upload.repository.FileRepository;

import com.bezcoder.spring.files.upload.service.FilesStorageService;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringBootUploadFilesApplication implements CommandLineRunner {
    @Resource
    FilesStorageService storageService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUploadFilesApplication.class, args);
    }

    @Override
    public void run(String... arg) throws Exception {
//    storageService.deleteAll();
        storageService.init();
    }

    // Пытаюсь прикрутить БД
    @Autowired
    private FileRepository fileRepository;

    public FileInfo saveFileInfo(FileInfo fileInfo) {
        fileRepository.save(fileInfo);
        return fileInfo;
    }

    public List<FileInfo> findAll() {
        return fileRepository.findAll();
    }

    public Optional<FileInfo> findByUsername(String name) {
        return fileRepository.findFileByFileName(name);
    }
}