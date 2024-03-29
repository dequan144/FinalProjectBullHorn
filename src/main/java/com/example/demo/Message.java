package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=0)
    private String content;

    @NotNull
    @Size(min=0)
    private String posteddate;

    @NotNull
    @Size(min=0)
    private String sentby;

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getPosteddate() {
        return posteddate;
    }

    public String getSentby() {
        return sentby;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPosteddate(String dueDate) {
        this.posteddate = posteddate;
    }

    public void setSentby(String sentby) {
        this.sentby = sentby;
    }
}
