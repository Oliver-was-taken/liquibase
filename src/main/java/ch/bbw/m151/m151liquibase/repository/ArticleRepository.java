package ch.bbw.m151.m151liquibase.repository;

import ch.bbw.m151.m151liquibase.datamodel.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<ArticleEntity, Integer> {
}
