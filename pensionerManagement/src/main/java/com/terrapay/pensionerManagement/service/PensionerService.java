package com.terrapay.pensionerManagement.service;

import com.terrapay.pensionerManagement.model.Pensioner;
import com.terrapay.pensionerManagement.repository.PensionerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PensionerService {

    @Autowired
    private PensionerRepository pensionerRepository;

    public Pensioner addPensioner(Pensioner pensioner) {
       return pensionerRepository.save(pensioner);

    }

    public List<Pensioner> getPensioners(){
        return pensionerRepository.findAll();
    }

    public Pensioner getPensionersByAadhar(String aadhar) {
        return pensionerRepository.getPensionersByAadhar(aadhar);
    }
}
