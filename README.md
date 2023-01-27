# liquibase
liquibase demo programm

I've completed all the gives Tasks. Therefore I expect the grade 6.

# Tasks:
| Task | State |
| ---- | :---: |
| 1. 255 chars for our article is not good enough. Change it to something bigger. | ✅ |
| 2. Rename the article table to articles. | ✅ |
| 3. Introduce our technical fields like createdTs and version to the article. Provide reasonable default values. | ✅ |
| 4. Introduce a new CommentEntity with a foreign key constraint on the article. Use an @ManyToOne in the Java world and an integer as ID type. | ✅ | 
| 5. We want to search articles by title , therefore introduce an appropriate index. As a complication, the DBA already introduced such an index on some environments manually. Use "preconditions" to not crash the script in those cases. | ✅ | 
| 6. Introduce a new CategoryEntity , which has name (PK) and description . Each article belongs to exactly 1 such category. Can you do this without a foreign key constraint in the Java world? | ✅ |
| 7. Add sample data to all tables using liquibase.
| 8. Verify the final state with JUnit.
| 9. Move all change-sets to individual files and use the includeAll -tag
| 10. Provide rollback for all change-sets: https://www.baeldung.com/liquibase-rollback
