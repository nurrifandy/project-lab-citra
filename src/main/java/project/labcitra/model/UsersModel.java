package project.labcitra.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "profile")

public class UsersModel implements Serializable{
    @Id
    @Size(max = 16)
    @Column(name = "nik", nullable = false)
    private String nik;

    @NotNull
    @Size(max = 50)
    @Column(name = "nama", nullable = false)
    private String nama;
    
}