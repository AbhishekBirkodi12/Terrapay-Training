package com.terrapay.pensionerManagement.repository;

import com.terrapay.pensionerManagement.model.Pensioner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PensionerRepository extends JpaRepository<Pensioner, Integer> {

    Pensioner getPensionersByAadhar(String aadhar);
}
