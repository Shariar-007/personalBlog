package com.example.blogtest.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "details")
    private String details;

    @Column(name = "postedDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date postedDate;

    @ManyToOne
    private User user;

    public Post() {
        super();
    }

    public Post(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setDateOfPosted(Date postedDate) {
        this.postedDate = postedDate;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public Date getPostedDate() {
        return postedDate;
    }
}
