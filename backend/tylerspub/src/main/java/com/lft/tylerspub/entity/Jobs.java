package com.lft.tylerspub.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "jobs")
//@Data -- Bug with getters and setters
public class Jobs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private int jobId;

    @Column(name = "title")
    private String title;

    @ManyToMany(mappedBy = "jobs")
    private Set<Employee> employees;

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
