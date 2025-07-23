package com.lft.tylerspub.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_jobs")
//@Data -- Bug with getters and setters
public class EmployeeJobs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_job_id")
    private int employeeJobId;

    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "job_id")
    private int jobId;

    @Column(name = "active")
    private boolean active;

    public int getEmployeeJobId() {
        return employeeJobId;
    }

    public void setEmployeeJobId(int employeeJobId) {
        this.employeeJobId = employeeJobId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
