package com.lcwd.todo.todomanager.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Todo")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "User_ID",length = 10)
    private int id;

    @Column(name = "User_name",length = 50)
    private String name;

    @Column(name = "User_content",length = 50)
    private String content;

    @Column(name="User_status",length = 50)
    private String status;


    public Todo(int id, String name, String content, String status) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.status = status;
    }

    public Todo() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", status='" + status + '\'' +
                '}';
    }


}
