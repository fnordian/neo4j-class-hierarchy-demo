package com.example.neo4jclasshierarchydemo.repository;

import com.example.neo4jclasshierarchydemo.entities.experiment.ARealThing;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.neo4j.DataNeo4jTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataNeo4jTest
public class ThingRepositoryTest {

    @Autowired
    private ThingRepository thingRepository;


    @Test
    public void createThings() {
        thingRepository.save(new ARealThing());
    }
}
