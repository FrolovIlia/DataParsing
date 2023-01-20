package com.example.dataparsing.controller;

import com.example.dataparsing.model.Parser;
import com.example.dataparsing.repository.ParserRepository;
import com.example.dataparsing.service.ParserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ParserController {
    @Autowired
    private ParserService parserService;
    @Autowired
    private ParserRepository parserRepository;
    @PostMapping(path = "/parser")
    public Parser post(@RequestBody Parser parser) {
        return parserService.saveParsing(parser);
    }

    @DeleteMapping(path = "/parser")
    public void deleteParsing(@RequestBody Parser parser) {
        parserRepository.deleteAll();
    }
}

