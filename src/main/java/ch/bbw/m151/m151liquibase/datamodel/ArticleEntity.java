package ch.bbw.m151.m151liquibase.datamodel;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "articles")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleEntity {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid")
    private UUID id;

    @Column(nullable = false)
    String title;

    @Column
    String text;

    @Column(nullable = false)
    LocalDateTime createdTs;

    @Column(nullable = false)
    int version;

    @OneToMany
    List<CommentEntity> comments;
}
