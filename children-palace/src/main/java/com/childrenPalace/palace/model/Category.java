package com.childrenPalace.palace.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="category_id")
    private Set<SubCategory> subCategory = new HashSet<>();

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="category_id")
    private Set<Teacher> teachers = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private ActivityCircle activityCircle;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<SubCategory> getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory.add(subCategory);
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public ActivityCircle getActivityCircle() {
        return activityCircle;
    }

    public void setActivityCircle(ActivityCircle activityCircle) {
        this.activityCircle = activityCircle;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teachers=" + teachers +
                '}';
    }
}
