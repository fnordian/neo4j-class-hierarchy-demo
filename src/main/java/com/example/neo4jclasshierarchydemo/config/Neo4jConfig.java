package com.example.neo4jclasshierarchydemo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.data.neo4j.Neo4jDataAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@EnableNeo4jRepositories(basePackages = { "com.example.neo4jclasshierarchydemo.repository", "com.example.neo4jclasshierarchydemo.entities.experiment"} /* , repositoryBaseClass = BaseNeo4jRepositoryImpl.class */)
@Slf4j
public class Neo4jConfig extends Neo4jDataAutoConfiguration {


    /*
    @Bean
    public Neo4jConversions neo4jConversions()
    {
        Set<GenericConverter> additionalConverters = Stream.of(           )
                .collect(Collectors.toSet());
        return new Neo4jConversions(additionalConverters);
    }
*/


}
