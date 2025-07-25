package com.lft.tylerspub.dao;

import com.lft.tylerspub.entity.EmployeeJobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "employeeJobs", path = "employee-jobs")
public interface EmployeeJobsRepository extends JpaRepository<EmployeeJobs, Integer> {
}
