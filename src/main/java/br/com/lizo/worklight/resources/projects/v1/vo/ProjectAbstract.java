package br.com.lizo.worklight.resources.projects.v1.vo;

import java.io.Serializable;

/**
 * Project abstract class.
 *
 * @author Luiz Jr.
 */
public abstract class ProjectAbstract implements Serializable {

    private Integer id;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
