package com.childrenPalace.palace.servicies;

import com.childrenPalace.palace.model.SubCategory;
import com.childrenPalace.palace.model.Teacher;
import com.childrenPalace.palace.repositories.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SubCategoryService {
    @Autowired
    private SubCategoryRepository subCategoryRepository;

    public Iterable<SubCategory> listAll() {
        return subCategoryRepository.findAll();
    }

    public void save(SubCategory subCategory) {
        subCategoryRepository.save(subCategory);
    }

    public SubCategory get(Long id) {
        return subCategoryRepository.findById(id).get();
    }

    public void delete(Long id) {
        subCategoryRepository.deleteById(id);
    }
}
