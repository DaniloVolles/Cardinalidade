package danilovolles.cardinalidade.Model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_homework")
public class Homework {

    @Id @GeneratedValue @Column
    private UUID id;

    @ManyToOne @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;
}
