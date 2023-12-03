package com.veterinerprojesi.app.enteties;

import com.veterinerprojesi.app.enums.Periyot;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="ilac")
@Data

public class Ilac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ilacAdi;
    private String etkenMaddesi;
    private Integer doz; //Günlük vücüt kg başına mg değeri (mg/kg*gün)
    private Periyot kullanimPeriyotu;
    private Integer kullanimSayisi;
    @ManyToOne
    @JoinColumn(name="hatalik_id")
    private Hastalik kullanilanHastalik;

}
