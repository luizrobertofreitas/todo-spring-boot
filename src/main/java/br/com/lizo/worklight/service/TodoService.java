
package br.com.lizo.worklight.service;

import br.com.lizo.worklight.resources.todos.v1.vo.TodoRequest;
import br.com.lizo.worklight.resources.todos.v1.vo.TodoResponse;
import java.util.List;

/**
 * Todo service interface.
 * 
 * @author Luiz Jr.
 */
public interface TodoService {
    
    /**
     * Saves a to do.
     * @param todoRequest the to do 
     * @return the saved to do
     */
    TodoResponse save(final TodoRequest todoRequest);
    
    /**
     * Gets a list of to do by project id.
     * @param projectId the project id
     * @return the list of to do
     */
    List<TodoResponse> getAllByProjectId(final Integer projectId);
    
}
