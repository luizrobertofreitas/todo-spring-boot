
package br.com.lizo.worklight.resources.projects.v1;

import br.com.lizo.worklight.resources.projects.v1.vo.ProjectRequest;
import br.com.lizo.worklight.resources.projects.v1.vo.ProjectResponse;
import br.com.lizo.worklight.service.ProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project class resource.
 * 
 * @author Luiz Jr.
 */
@RestController
@RequestMapping("/projects")
public final class ProjectResource {
    
    @Autowired
    private ProjectService projectService;
    
    /**
     * Gets all projects.
     * @return the list of projects
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<ProjectResponse> getProjects() {
        return projectService.getAll();
    }
    
    /**
     * Posts a new project.
     * @param project the project
     * @return the posted project
     */
    @RequestMapping(method = RequestMethod.POST)
    public ProjectResponse postProject(@RequestBody final ProjectRequest project) {
        return projectService.save(project);
    }
    
    
}
