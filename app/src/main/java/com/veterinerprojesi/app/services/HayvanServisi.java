package com.veterinerprojesi.app.services;

import com.veterinerprojesi.app.enteties.Hayvan;
import com.veterinerprojesi.app.repositeries.IHayvanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HayvanServisi {

    IHayvanRepo iHayvanRepo;

    @Autowired
    public HayvanServisi(IHayvanRepo iHayvanRepo) {
        this.iHayvanRepo = iHayvanRepo;
    }

    public List<Hayvan> hayvanlarinListesiniOlustur() {
        return iHayvanRepo.findAll();
    }
}