package project.labcitra.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "nilai_normal")

public class NilaiNormalModel implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "kode", nullable = false)
    private Long kode;
    
    /** 
     Connect to nama pemeriksaan
    */

    @NotBlank
    @Size(max = 30)
    @Column(name = "kategori", nullable = false)
    private String kategori;

    @NotBlank
    @Size(max = 30)
    @Column(name = "jenis_kelamin", nullable = false)
    private String jenisKelamin;
}