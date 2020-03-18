package com.project.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sys_teacher")
public class TeacherEntity {
    @Id
    @Column(name = "t_id",length = 32)
    @GenericGenerator(name = "tuuid",strategy ="uuid" )
    @GeneratedValue(generator = "tuuid")
    private String teacherId;
    @Column(name = "t_name",length = 48)
    private String teacherName;
    @Column(name = "t_class",length = 48)
    private String teacherClass;

    //mappedBY 把映射权利交给多的一方 mappedBy = ""多的一方,持有的引用
//    @OneToMany(mappedBy = "teacher")
//    private Set<StudentEntity>setStu;

    @OneToMany(mappedBy = "teacher")
    private Set<TeacherWithStudent>setTT;


    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherClass() {
        return teacherClass;
    }

    public void setTeacherClass(String teacherClass) {
        this.teacherClass = teacherClass;
    }

//    public Set<StudentEntity> getSetStu() {
//        return setStu;
//    }
//
//    public void setSetStu(Set<StudentEntity> setStu) {
//        this.setStu = setStu;
//    }


    public Set<TeacherWithStudent> getSetTT() {
        return setTT;
    }

    public void setSetTT(Set<TeacherWithStudent> setTT) {
        this.setTT = setTT;
    }

    @Override
    public String toString() {
        return "TeacherEntity{" +
                "teacherId='" + teacherId + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacherClass='" + teacherClass + '\'' +
                ", setTT=" + setTT +
                '}';
    }
}
