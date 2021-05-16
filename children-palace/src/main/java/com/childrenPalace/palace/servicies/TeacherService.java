package com.childrenPalace.palace.servicies;


import com.childrenPalace.palace.model.Teacher;
import com.childrenPalace.palace.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public Iterable<Teacher> listAll() {
        return teacherRepository.findAll();
    }

    public void save(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    public Teacher get(Long id) {
        return teacherRepository.findById(id).get();
    }

    public void delete(Long id) {
        teacherRepository.deleteById(id);
    }
}
