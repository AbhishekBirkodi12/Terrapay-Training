package com.terrapay.pensionerManagement.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Pensioner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dob;
    private String pan;
    private String aadhar;
    private int lastSalary;
    private int allowance;
    @Enumerated(EnumType.STRING)
    private PensionType pensionType;
   /* private Bank bankDetails;*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public int getLastSalary() {
        return lastSalary;
    }

    public void setLastSalary(int lastSalary) {
        this.lastSalary = lastSalary;
    }

    public int getAllowance() {
        return allowance;
    }

    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }

    public PensionType getPensionType() {
        return pensionType;
    }

    public void setPensionType(PensionType pensionType) {
        this.pensionType = pensionType;
    }

  /*  public Bank getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(Bank bankDetails) {
        this.bankDetails = bankDetails;
    }*/



    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }
}
