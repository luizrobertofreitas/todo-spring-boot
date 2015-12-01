
package br.com.lizo.worklight.model.repositories;

import br.com.lizo.worklight.model.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Project repository.
 * 
 * @author Luiz Jr.
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
    
}
