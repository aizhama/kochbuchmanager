package de.itech.kochbuchmanager.repository;

import de.itech.kochbuchmanager.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    //Optional<Recipe> findById(Long id);
    //Recipe findBYTitelContaining(String title);
}
