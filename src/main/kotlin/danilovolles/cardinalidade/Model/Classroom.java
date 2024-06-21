package danilovolles.cardinalidade.Model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_classroom")
public class Classroom {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private UUID id;

    @OneToOne(mappedBy = "classroom")
    private Student student;
}
