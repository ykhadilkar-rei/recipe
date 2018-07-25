package net.khadilkar.recipe.repositories;

import net.khadilkar.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Yatin on 7/25/18
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
