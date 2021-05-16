package com.childrenPalace.palace.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private Date birtDate;
    private Integer studentClass;

    @ManyToOne(fetch = FetchType.LAZY)
    private ActivityCircle activityCircle;

    public Student() {
    }

    public Student(String firstName, String lastName, Date birtDate, Integer studentClass) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birtDate = birtDate;
        this.studentClass = studentClass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(Date birtDate) {
        this.birtDate = birtDate;
    }

    public Integer getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(Integer studentClass) {
        this.studentClass = studentClass;
    }

    public ActivityCircle getActivityCircle() {
        return activityCircle;
    }

    public void setActivityCircle(ActivityCircle activityCircle) {
        this.activityCircle = activityCircle;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birtDate=" + birtDate +
                ", studentClass=" + studentClass +
                '}';
    }
}
