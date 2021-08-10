package com.example.neo4jclasshierarchydemo.repository;

import com.example.neo4jclasshierarchydemo.entities.experiment.ARealThing;
import com.example.neo4jclasshierarchydemo.entities.experiment.Thing;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.neo4j.DataNeo4jTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

@ExtendWith(SpringExtension.class)
@DataNeo4jTest()
@Slf4j
public class ThingRepositoryTest {

    @Autowired
    private ThingRepository thingRepository;


    @Test
    public void createThings() {

        ARealThing savedThing = thingRepository.save(new ARealThing());
        log.info("saved id {}", savedThing.getId());
        Optional<Thing> loadedThing = thingRepository.findById(savedThing.getId());
        Assertions.assertTrue(loadedThing.isPresent());
        log.info("loaded type {}", loadedThing.get().getClass().getName());
    }
}
