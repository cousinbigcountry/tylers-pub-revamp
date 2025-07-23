package com.lft.tylerspub.dao;

import com.lft.tylerspub.entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "jobs", path = "jobs")
public interface JobsRepository extends JpaRepository<Jobs, Integer> {
}
