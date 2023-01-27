package ch.bbw.m151.m151liquibase.repository;

import ch.bbw.m151.m151liquibase.datamodel.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentEntity, Integer> {
}
