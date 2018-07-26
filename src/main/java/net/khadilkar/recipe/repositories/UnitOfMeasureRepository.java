package net.khadilkar.recipe.repositories;

import net.khadilkar.recipe.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Yatin on 7/25/18
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
