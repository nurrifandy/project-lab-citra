package project.labcitra.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.servlet.FlashMapManager;

@Entity
@Table(name="data_pemeriksaan")
public class PemeriksaanModel implements Serializable{
    /*
     * pasien memiliki n data pemeriksaan
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "tanggal_pemeriksaan" ,nullable = false)
    private Date tanggalPemeriksaant;

    @NotBlank
    @Size(max = 300)
    @Column(name = "diagnosa_awal", nullable = false)
    private String diagnosaAwal;

    /*
     * satu pemeriksaan memiliki 0-1 dokter rujukan
     * satu pemeriksaan memiliki 0-1 ruangan
     * satu pemeriksaan memiliki 0-1 bahan
     * satu pemeriksaan memiliki 0-1 faskes
     */

     /*
      satu data pemeriksaan memiliki n category pemeriksaan
      */


}
