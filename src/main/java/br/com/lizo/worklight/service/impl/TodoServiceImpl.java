
package br.com.lizo.worklight.service.impl;

import br.com.lizo.worklight.model.repositories.TodoRepository;
import br.com.lizo.worklight.resources.todos.v1.mapper.TodoMapper;
import br.com.lizo.worklight.resources.todos.v1.vo.TodoRequest;
import br.com.lizo.worklight.resources.todos.v1.vo.TodoResponse;
import br.com.lizo.worklight.service.TodoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Todo service implementation.
 * 
 * @author Luiz Jr.
 */
@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoMapper todoMapper;
    
    @Autowired
    private TodoRepository todoRepository;
    
    /**
     * @see TodoService#save(br.com.lizo.worklight.resources.todos.v1.vo.TodoRequest) 
     */
    @Override
    public TodoResponse save(TodoRequest todoRequest) {
        return todoMapper.mapsTToRes(
                todoRepository.save(
                        todoMapper.mapsReqToT(todoRequest)));
    }
    
    /**
     * @see TodoService#getAllByProjectId(java.lang.Integer) 
     */
    @Override
    public List<TodoResponse> getAllByProjectId(Integer projectId) {
        return todoMapper.mapsListOfTToListOfRes(
                todoRepository.findAllByProjectId(projectId));
    }
    
}
