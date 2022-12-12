package project.labcitra.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "pasien")

public class PasienModel implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "nik", nullable = false)
    private Long nik;

    @NotNull
    @Size(max = 50)
    @Column(name = "nama", nullable = false)
    private String nama;

    @NotNull
    @Size(max = 50)
    @Column(name = "jenis_kelamin" ,nullable = false)
    private String jenisKelamin;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "tanggal_lahir" ,nullable = false)
    private Date tanggalLahir;

    @NotBlank
    @Size(max = 200)
    @Column(name = "alamat" ,nullable = false)
    private String alamat;

    public Long getId() {
        return id;
    }

    public Long getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNik(Long nik) {
        this.nik = nik;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

}
