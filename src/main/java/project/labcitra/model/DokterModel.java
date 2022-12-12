package project.labcitra.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "dokter")
public class DokterModel implements Serializable{
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(name = "nama_alias", nullable = false)
    private String nikName;

    @NotNull
    @Size(max = 100)
    @Column(name = "nama_dokter", nullable = false)
    private String nama;
}
