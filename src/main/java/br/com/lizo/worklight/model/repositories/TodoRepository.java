
package br.com.lizo.worklight.model.repositories;

import br.com.lizo.worklight.model.entities.Todo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * To do repository.
 * 
 * @author Luiz Jr.
 */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
    
    /**
     * Finds all to do by project id.
     * @param projectId the project id
     * @return the list of to do
     */
    @Query("SELECT t FROM Todo t WHERE t.projectId = :projectId")
    List<Todo> findAllByProjectId(@Param("projectId") final Integer projectId);
    
}
