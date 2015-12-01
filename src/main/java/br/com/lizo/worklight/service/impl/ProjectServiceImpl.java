
package br.com.lizo.worklight.service.impl;

import br.com.lizo.worklight.model.repositories.ProjectRepository;
import br.com.lizo.worklight.resources.projects.v1.mapper.ProjectMapper;
import br.com.lizo.worklight.resources.projects.v1.vo.ProjectRequest;
import br.com.lizo.worklight.resources.projects.v1.vo.ProjectResponse;
import br.com.lizo.worklight.service.ProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Project service implementation.
 * 
 * @author Luiz Jr.
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;
    
    @Autowired
    private ProjectRepository projectRepository;
    
    /**
     * @see ProjectService#save(br.com.lizo.worklight.resources.projects.v1.vo.ProjectRequest) 
     */
    @Override
    public ProjectResponse save(ProjectRequest request) {
        return projectMapper.mapsTToRes(
                projectRepository.save(
                        projectMapper.mapsReqToT(request)));
    }

    /**
     * @see ProjectService#getAll() 
     */
    @Override
    public List<ProjectResponse> getAll() {
        return projectMapper.mapsListOfTToListOfRes(
                projectRepository.findAll());
    }
    
}
