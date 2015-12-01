package br.com.lizo.worklight.resources.todos.v1.vo;

import java.io.Serializable;

/**
 *
 * @author Luiz Jr.
 */
public abstract class TodoAbstract implements Serializable {

    private Integer id;
    private String description;
    private Boolean checked;
    private Integer projectId;

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(final Boolean checked) {
        this.checked = checked;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
}
