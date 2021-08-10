package com.example.neo4jclasshierarchydemo.repository;

import com.example.neo4jclasshierarchydemo.entities.experiment.Thing;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThingRepository extends Neo4jRepository<Thing, Long> {
}
