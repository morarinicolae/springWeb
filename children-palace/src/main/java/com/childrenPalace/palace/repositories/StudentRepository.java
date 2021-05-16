package com.childrenPalace.palace.repositories;

import com.childrenPalace.palace.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
