package com.example.dataparsing.model;

import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
public class Parser {
    @Id
    private String id;
    private String locality;
    private String street;
    private String canonicalName;
}