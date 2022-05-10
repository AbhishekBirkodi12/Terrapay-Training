package com.terrapay.pensionerManagement.controller;

import com.terrapay.pensionerManagement.model.Pensioner;
import com.terrapay.pensionerManagement.service.PensionerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pensioner")
public class PensionerController {

    @Autowired
    private PensionerService pensionerService;

    @PostMapping
    public ResponseEntity<Pensioner> addPensioner(@RequestBody Pensioner pensioner){
        Pensioner pensioner1= pensionerService.addPensioner(pensioner);
        return new ResponseEntity(pensioner1, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Pensioner>> getPensioners(){
        List<Pensioner> li= pensionerService.getPensioners();
        return new ResponseEntity(li, HttpStatus.OK);
    }

    @GetMapping("{aadhar}")
    public ResponseEntity<Pensioner> getPensionersByAadhar(@PathVariable  String aadhar){
        Pensioner pensioner= pensionerService.getPensionersByAadhar(aadhar);
        return new ResponseEntity(pensioner, HttpStatus.OK);
    }


}
