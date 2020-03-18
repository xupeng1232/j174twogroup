package com.project.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sys_student")
public class StudentEntity {

    @Id
    @Column(name = "s_id",length = 32)
    @GenericGenerator(name = "suuid",strategy ="uuid" )
    @GeneratedValue(generator = "suuid")
    private String studentId;
    @Column(name = "s_name",length = 48)
    private String studentName;

    //feach 抓取策略-急加载或懒加载, cascade:级联操作
//    @ManyToOne(fetch = FetchType.LAZY,cascade =CascadeType.ALL )
//    @JoinColumn(name = "fk_t_id")
//    private TeacherWithStudent ts;

    @OneToMany(mappedBy = "student")
    private Set<TeacherWithStudent> setTS;


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Set<TeacherWithStudent> getSetTS() {
        return setTS;
    }

    public void setSetTS(Set<TeacherWithStudent> setTS) {
        this.setTS = setTS;
    }
}
