# liquibase
liquibase demo programm

I've completed all the gives Tasks. Therefore I expect the grade 6.

# Tasks:
| Task | State |
| ---- | :---: |
| 255 chars for our article is not good enough. Change it to something bigger. | ✅ |
| Rename the article table to articles. | ✅ |
| Introduce our technical fields like createdTs and version to the article. Provide reasonable default values. | ✅ |
| Introduce a new CommentEntity with a foreign key constraint on the article. Use an @ManyToOne in the Java world and an integer as ID type. | ✅ | 
| We want to search articles by title , therefore introduce an appropriate index. As a complication, the DBA already introduced such an index on some environments manually. Use "preconditions" to not crash the script in those cases. | ✅ | 
| Introduce a new CategoryEntity , which has name (PK) and description . Each article belongs to exactly 1 such category. Can you do this without a foreign key constraint in the Java world? | ✅ |
| Add sample data to all tables using liquibase. | ✅ |
| Verify the final state with JUnit. | ✅ |
| Move all change-sets to individual files and use the includeAll -tag | ✅ |
|  Provide rollback for all change-sets: https://www.baeldung.com/liquibase-rollback | ✅ |
