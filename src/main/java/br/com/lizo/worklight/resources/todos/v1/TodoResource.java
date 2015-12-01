
package br.com.lizo.worklight.resources.todos.v1;

import br.com.lizo.worklight.resources.todos.v1.vo.TodoRequest;
import br.com.lizo.worklight.resources.todos.v1.vo.TodoResponse;
import br.com.lizo.worklight.service.TodoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Todo class resource.
 * 
 * @author Luiz Jr.
 */
@RestController
@RequestMapping("/projects/{projectId}/todos")
public class TodoResource {
    
    @Autowired
    private TodoService todoService;
    
    /**
     * Gets all Todo.
     * @param projectId the project id
     * @return the list of TodoResponse
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<TodoResponse> getTodos(@PathVariable("projectId") final Integer projectId) {
        return todoService.getAllByProjectId(projectId);
    }
    
    /**
     * Posts a new Todo.
     * @param projectId the project id
     * @param todo the Todo
     * @return the Todo response
     */
    @RequestMapping(method = RequestMethod.POST)
    public TodoResponse postTodo(
            @PathVariable("projectId") final Integer projectId, 
            @RequestBody final TodoRequest todo) {
        return todoService.save(todo);
    }
}
