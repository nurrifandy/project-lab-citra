package project.labcitra.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="bidang")
public class BidangModel implements Serializable{
    @Id
    @Column(name="id", nullable = false)
    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(name = "nama_bidang", nullable = false)
    private String namaBidang;

    /**
     1. satu bidang memiliki banyak kategori pemeriksaan
     2. satu kategori pemeriksaan memiliki satu bidang
     */

}
