
package br.com.lizo.worklight.service;

import br.com.lizo.worklight.resources.projects.v1.vo.ProjectRequest;
import br.com.lizo.worklight.resources.projects.v1.vo.ProjectResponse;
import java.util.List;

/**
 * Project service interface.
 * 
 * @author Luiz Jr.
 */
public interface ProjectService {
    
    /**
     * Saves a project.
     * 
     * @param request the project
     * @return the saved project
     */
    ProjectResponse save(ProjectRequest request);
    
    /**
     * Gets a list of projects.
     * 
     * @return the list of projects
     */
    List<ProjectResponse> getAll();
    
}
