package com.example.dataparsing.service;

import com.example.dataparsing.model.Parser;
import com.example.dataparsing.repository.ParserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ParserService {

    @Autowired
    private ParserRepository parserRepository;

    public ParserService(ParserRepository parserRepository) {
        this.parserRepository = parserRepository;
    }

    public Parser saveParsing(Parser doctor){
        parserRepository.save(doctor);
        return doctor;
    }


}
