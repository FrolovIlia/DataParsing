//package com.example.dataparsing.controller;
//
//import com.example.dataparsing.model.Parser;
//import com.example.dataparsing.repository.ParserRepository;
//import com.example.dataparsing.service.ParserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.server.ResponseStatusException;
//
//import javax.validation.Valid;
//import java.util.List;
//import java.util.Optional;
//
//import static org.springframework.http.HttpStatus.NOT_FOUND;
//
//
//@RestController
//public class ParserController {
//    @Autowired
//    private ParserService doctorService;
//    @Autowired
//    private ParserRepository doctorRepository;
//
//    @GetMapping(path = "/doctors")
//    public ResponseEntity<List<Parser>> findAll() {
//        return ResponseEntity.ok(doctorService.findAll());
//    }
//
//    @GetMapping(path = "/doctor/{username}")
//    public Optional<Parser> findByDoctorName(@PathVariable("username") String username) {
//        return doctorService.findByUsername(username);
//    }
//
//    @PostMapping(path = "/doctor")
//    public Parser post(@RequestBody Parser doctor) {
//        return doctorService.saveDoctor(doctor);
//    }
//
//    @PutMapping("/doctors/{doctorId}")
//    public ResponseEntity<Parser> updateDoctor(@PathVariable(value = "doctorId") String doctorId,
//                                               @Valid @RequestBody Parser newDoctor) throws ResponseStatusException {
//        Parser doctor = doctorRepository.findById(doctorId)
//                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Unable to find resource"));
//
//        doctor.setDoctorId(newDoctor.getDoctorId());
//        doctor.setDoctorFullName(newDoctor.getDoctorFullName());
//
//        final Parser updatedDoctor = doctorRepository.save(doctor);
//        return ResponseEntity.ok(updatedDoctor);
//    }
//
//    @DeleteMapping(path = "/doctor/{id}")
//    public void deleteDoctor(@PathVariable("id") String doctorId) {
//        doctorRepository.deleteById(doctorId);
//    }
//}
//
