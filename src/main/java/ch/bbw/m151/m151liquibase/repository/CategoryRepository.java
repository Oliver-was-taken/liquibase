package ch.bbw.m151.m151liquibase.repository;

import ch.bbw.m151.m151liquibase.datamodel.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
}
