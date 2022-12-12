package project.labcitra.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="ruangan")
public class RuanganModel implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(name = "kode_ruangan", nullable = false)
    private String kodeRuangan;

    @NotNull
    @Size(max = 100)
    @Column(name = "nama_ruangan", nullable = false)
    private String namaRuangan;

    @NotNull
    @Column(name = "nama_alias", nullable = false)
    private Long kelas;

}
