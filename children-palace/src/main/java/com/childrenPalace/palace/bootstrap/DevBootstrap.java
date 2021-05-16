package com.childrenPalace.palace.bootstrap;

import com.childrenPalace.palace.model.*;
import com.childrenPalace.palace.repositories.*;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private ActivityCircleRepository activityCircleRepository;
    private CategoryRepository categoryRepository;
    private StudentRepository studentRepository;
    private SubCategoryRepository subCategoryRepository;
    private TeacherRepository teacherRepository;

    public DevBootstrap(ActivityCircleRepository activityCircleRepository, CategoryRepository categoryRepository, StudentRepository studentRepository, SubCategoryRepository subCategoryRepository, TeacherRepository teacherRepository) {
        this.activityCircleRepository = activityCircleRepository;
        this.categoryRepository = categoryRepository;
        this.studentRepository = studentRepository;
        this.subCategoryRepository = subCategoryRepository;
        this.teacherRepository = teacherRepository;
    }

    private void initData() {
//        Eric
        Teacher nicolaie = new Teacher("Morari", "Nicolae", 35);
        Teacher vasile = new Teacher("Furdui", "Vasile", 27);
        Student student1 = new Student("Mihai", "Cocalea", new Date(), 7);
        Student student2 = new Student("Ion", "Cosneanu", new Date(), 7);
        SubCategory subCategory1 = new SubCategory("Arte Plastice");
        SubCategory subCategory2 = new SubCategory("Muzica");
        Category category1 = new Category("culturale");
        Category category2 = new Category("sportive");
        subCategory1.setCategory(category1);
        subCategory2.setCategory(category2);
        nicolaie.setCategory(category1);
        vasile.setCategory(category2);
        ActivityCircle activityCircle1 = new ActivityCircle("First Cirlce", new Date(), new Date());
        ActivityCircle activityCircle2 = new ActivityCircle("Second Cirlce", new Date(), new Date());
        student1.setActivityCircle(activityCircle1);
        student2.setActivityCircle(activityCircle2);
        category1.setActivityCircle(activityCircle1);
        category2.setActivityCircle(activityCircle2);
        activityCircleRepository.save(activityCircle1);
        activityCircleRepository.save(activityCircle2);
        categoryRepository.save(category1);
        categoryRepository.save(category2);
        teacherRepository.save(nicolaie);
        teacherRepository.save(vasile);
        studentRepository.save(student1);
        studentRepository.save(student2);
        subCategoryRepository.save(subCategory1);
        subCategoryRepository.save(subCategory2);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
