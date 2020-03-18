package com.project.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "sys_t_u")
public class TeacherWithStudent {
    @Id
    @Column(name = "t_id",length = 32)
    @GenericGenerator(name = "tuuid",strategy ="uuid" )
    @GeneratedValue(generator = "tuuid")
    private String id;


    @ManyToOne(fetch = FetchType.LAZY,cascade =CascadeType.ALL )
    @JoinColumn(name = "fk_t_id")
    private TeacherEntity teacher;

    @ManyToOne(fetch = FetchType.LAZY,cascade =CascadeType.ALL )
    @JoinColumn(name = "fk_s_id")
    private StudentEntity student;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TeacherEntity getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherEntity teacher) {
        this.teacher = teacher;
    }

    public StudentEntity getStudent() {
        return student;
    }

    public void setStudent(StudentEntity student) {
        this.student = student;
    }


}
