package com.childrenPalace.palace.repositories;

import com.childrenPalace.palace.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
