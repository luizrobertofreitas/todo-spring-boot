
package br.com.lizo.worklight.resources.todos.v1.mapper;

import br.com.lizo.worklight.model.entities.Todo;
import br.com.lizo.worklight.resources.todos.v1.vo.TodoRequest;
import br.com.lizo.worklight.resources.todos.v1.vo.TodoResponse;
import br.com.lizo.worklight.utils.Mapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * To do mapper.
 * 
 * @author Luiz Jr.
 */
@Component
public class TodoMapper implements Mapper<Todo, TodoRequest, TodoResponse> {

    /**
     * Maps Todo to a TodoResponse.
     * @param t the Todo
     * @return the TodoResponse
     */
    @Override
    public TodoResponse mapsTToRes(Todo t) {
        
        TodoResponse res = new TodoResponse();
        
        if (t != null) {
            res.setChecked(t.getChecked());
            res.setDescription(t.getDescription());
            res.setId(t.getId());
            res.setProjectId(t.getProjectId());
        }
        
        return res;
    }

    /**
     * Maps a list of Todo to a list of TodoResponse
     * @param ts the list of Todo
     * @return the list of TodoResponse
     */
    @Override
    public List<TodoResponse> mapsListOfTToListOfRes(List<Todo> ts) {
        
        List<TodoResponse> resList = new ArrayList<>();
        
        if (ts != null && !ts.isEmpty()) {
            for (Todo t : ts) {
                resList.add(mapsTToRes(t));
            }
        }
        
        return resList;
    }

    /**
     * Maps a TodoRequest to a Todo.
     * @param req the TodoRequest
     * @return the Todo
     */
    @Override
    public Todo mapsReqToT(TodoRequest req) {
        
        Todo t = new Todo();
        
        if (req != null) {
            t.setChecked(req.getChecked());
            t.setDescription(req.getDescription());
            t.setId(req.getId());
            t.setProjectId(req.getProjectId());
        }
        
        return t;
    }
    
}
