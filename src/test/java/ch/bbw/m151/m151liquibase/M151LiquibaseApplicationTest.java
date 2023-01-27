package ch.bbw.m151.m151liquibase;

import ch.bbw.m151.m151liquibase.datamodel.ArticleEntity;
import ch.bbw.m151.m151liquibase.datamodel.CategoryEntity;
import ch.bbw.m151.m151liquibase.datamodel.CommentEntity;
import ch.bbw.m151.m151liquibase.repository.ArticleRepository;
import ch.bbw.m151.m151liquibase.repository.CategoryRepository;
import ch.bbw.m151.m151liquibase.repository.CommentRepository;
import jakarta.transaction.Transactional;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDateTime;
import java.util.List;

@ActiveProfiles("test")
@SpringBootTest(properties = "spring.liquibase.drop-first=true")
// Deletes Data after each test
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@Transactional
class LiquibaseDemoApplicationTests implements WithAssertions {
    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Test
    void setupAndTestDatabase() {
        // initial article
        ArticleEntity article = ArticleEntity.builder()
                .title("a title")
                .text("H".repeat(300))
                .createdTs(LocalDateTime.now())
                .version(1)
                .build();

        // test object for comment
        CommentEntity comment = CommentEntity.builder()
                .article(article)
                .text("Very very good article")
                .build();

        article = articleRepository.saveAndFlush(article);
        comment = commentRepository.saveAndFlush(comment);

        assertThat(article.getId()).isNotNull();
        assertThat(comment.getId()).isNotNull();
        assertThat(comment.getArticle().getId()).isEqualTo(article.getId());
    }

    @Test
    void testDataCheck() {
        List<ArticleEntity> articleEntities = articleRepository.findAll();
        List<CommentEntity> commentEntities = commentRepository.findAll();
        List<CategoryEntity> categoryEntities = categoryRepository.findAll();

        assertThat(articleEntities).hasSizeGreaterThanOrEqualTo(1);
        assertThat(commentEntities).hasSizeGreaterThanOrEqualTo(1);
        assertThat(categoryEntities).hasSizeGreaterThanOrEqualTo(1);
    }
}
