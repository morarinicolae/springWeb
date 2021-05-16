package com.childrenPalace.palace.servicies;

import com.childrenPalace.palace.model.Category;
import com.childrenPalace.palace.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Iterable<Category> listAll() {
        return categoryRepository.findAll();
    }

    public void save(Category category) {
        categoryRepository.save(category);
    }

    public Category get(Long id) {
        return categoryRepository.findById(id).get();
    }

    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }

}
