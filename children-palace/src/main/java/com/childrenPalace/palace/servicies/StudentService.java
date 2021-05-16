package com.childrenPalace.palace.servicies;

import com.childrenPalace.palace.model.Student;
import com.childrenPalace.palace.model.Teacher;
import com.childrenPalace.palace.repositories.StudentRepository;
import com.childrenPalace.palace.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Iterable<Student> listAll() {
        return studentRepository.findAll();
    }

    public void save(Student student) {
        studentRepository.save(student);
    }

    public Student get(Long id) {
        return studentRepository.findById(id).get();
    }

    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
}
