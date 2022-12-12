package project.labcitra.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="kategori_pemeriksaan")
public class KategoriPemeriksaanModel implements Serializable{
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(name = "nama_pemeriksaan", nullable = false)
    private String namaPemeriksaan;

    @NotNull
    @Column(name = "kelas", nullable = false)
    private Long kelas;

    @NotNull
    @Column(name = "harga", nullable = false)
    private Long harga;
    
    @NotNull
    @Size(max = 300)
    @Column(name = "nilai_normal", nullable = false)
    private String nilaiNormal;

    @NotNull
    @Column(name = "jenis_paket", nullable = false)
    private Long jenisPaket;

    /**
      Pasien memiliki n daftar pemeriksaan, daftar pemeriksaan memiliki n kategori pemeriksaan
     */
}
