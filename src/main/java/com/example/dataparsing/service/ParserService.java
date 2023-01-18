//package com.example.dataparsing.service;
//
//import com.example.dataparsing.model.Parser;
//import com.example.dataparsing.repository.ParserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ParserService {
//
//    @Autowired
//    private ParserRepository doctorRepository;
//
//    public ParserService(ParserRepository doctorRepository) {
//        this.doctorRepository = doctorRepository;
//    }
//
//    public Parser saveDoctor(Parser doctor){
//        doctorRepository.save(doctor);
//        return doctor;
//    }
//
//    public List<Parser> findAll(){
//        return doctorRepository.findAll();
//    }
//
//    public Optional<Parser> findByUsername(String username){
//        return doctorRepository.findDoctorByDoctorFullName(username);
//    }
//
//
//}
