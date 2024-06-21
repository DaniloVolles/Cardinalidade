package danilovolles.cardinalidade.Model;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_teacher")
public class Teacher {

    @Id @GeneratedValue @Column
    private UUID id;

    @ManyToMany(mappedBy = "teachers")
    private List<Student> students;

}
