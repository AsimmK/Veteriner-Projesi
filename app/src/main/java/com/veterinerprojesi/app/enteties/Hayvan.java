package com.veterinerprojesi.app.enteties;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Table(name="hayvan")
@Data

public class Hayvan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cins;
    private String tur;
    private Integer ayakSayisi;
    private String uremeSekli;
    private Integer omur;
    private String yasamYeri;
    private Boolean zehirliMi;

    @ManyToMany
    @JoinTable(name="hayvan_hastaliklari")
    private List<Hastalik> hastaliklari;


}
