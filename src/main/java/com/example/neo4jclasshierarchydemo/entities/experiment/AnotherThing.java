package com.example.neo4jclasshierarchydemo.entities.experiment;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node("AnotherThing")
public class AnotherThing implements Thing {
    @Id
    @GeneratedValue
    @Getter
    @Setter
    private Long id;
}
