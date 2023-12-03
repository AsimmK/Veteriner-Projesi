package com.veterinerprojesi.app.enteties;

import com.veterinerprojesi.app.enums.HastalikTehlikesi;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Table(name="hastaliklar")
@Data

public class Hastalik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String hastalikAdi;
    private HastalikTehlikesi hastalikTehlikesi;
    private Boolean bulasiciMi;

    @OneToMany(mappedBy = "kullanilanHastalik")
    private List<Ilac> ilaclar;

    @ManyToMany
    @JoinTable(name="riskaltindaki_hayvanlar")
    private List<Hayvan> riskAltindakihayvanlar;

}
