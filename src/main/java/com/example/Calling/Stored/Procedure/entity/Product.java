package com.example.Calling.Stored.Procedure.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int pId;

    @Column(name = "product_name")
    private String pName;

    @Column(name = "product_prize")
    private double pPrize;

    @Column(name="mfg_date")
    private String mfgDate;

    @Column(name = "exp_date")
    private String expDate;

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getpPrize() {
        return pPrize;
    }

    public void setpPrize(double pPrize) {
        this.pPrize = pPrize;
    }
    public String getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(String mfgDate) {
        this.mfgDate = mfgDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }



}
