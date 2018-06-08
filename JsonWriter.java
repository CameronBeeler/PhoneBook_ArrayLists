package com.cambeeler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*
<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind -->
        <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.9.4</version>
        </dependency>


import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonWriter {
    Country countryObj = new Country();
    countryObj.name = "India";
    countryObj.population = 1000000;

    List<String> listOfStates = new ArrayList<String>();
    listOfStates.add("Madhya Pradesh");
    listOfStates.add("Maharastra");
    listOfStates.add("Rajasthan");

    countryObj.states = listOfStates ;
    ObjectMapper mapper = new ObjectMapper();

    try {

        // Writing to a file
        mapper.writeValue(new File("c:\\country.json"), countryObj );

    } catch (IOException e) {
        e.printStackTrace();
    }

}
*/