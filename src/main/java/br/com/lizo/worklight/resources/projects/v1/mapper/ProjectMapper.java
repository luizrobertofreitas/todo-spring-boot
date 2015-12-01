package br.com.lizo.worklight.resources.projects.v1.mapper;

import br.com.lizo.worklight.model.entities.Project;
import br.com.lizo.worklight.resources.projects.v1.vo.ProjectRequest;
import br.com.lizo.worklight.resources.projects.v1.vo.ProjectResponse;
import br.com.lizo.worklight.utils.Mapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Project mapper.
 * 
 * @author Luiz Jr.
 */
@Component
public class ProjectMapper implements Mapper<Project, ProjectRequest, ProjectResponse> {

    /**
     * Maps a Project to a ProjectResponse.
     * 
     * @param t the Project
     * @return the ProjectResponse
     */
    @Override
    public ProjectResponse mapsTToRes(Project t) {
        ProjectResponse res = new ProjectResponse();
        
        if (t != null) {
            res.setDescription(t.getDescription());
            res.setId(t.getId());
        }
        
        return res;
    }

    /**
     * Maps a List of Project to a List of ProjectResponse.
     * 
     * @param ts the list of Project
     * @return the List of ProjectResponse
     */
    @Override
    public List<ProjectResponse> mapsListOfTToListOfRes(List<Project> ts) {
        
        List<ProjectResponse> projects = new ArrayList<>();

        if (ts != null && !ts.isEmpty()) {
            for (Project p : ts) {
                projects.add(mapsTToRes(p));
            }
        }
        
        return projects;
    }

    /**
     * Maps a ProjectRequest to a Project.
     * 
     * @param req the ProjectRequest
     * @return the Project
     */
    @Override
    public Project mapsReqToT(ProjectRequest req) {
        
        Project p = new Project();
        
        if (req != null) {
            p.setDescription(req.getDescription());
            p.setId(req.getId());
        }
        
        return p;
    }
    
}
