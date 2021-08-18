package com.example.demo;

import com.example.demo.mapper.GodMapper;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.example.demo.mapper.GodMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        //dali raboti ALlArgsConstructor i getters
        God Zeus = new God("zeus", 200, "rhea", "cronus");
        System.out.println("Zeus' father is: " + Zeus.getFather());

        // dali rabotat setters
        God Dionysus = new God();
        Dionysus.setName("Dionysus");
        Dionysus.setHeight(215);
        Dionysus.setMother("Semele");
        Dionysus.setFather("Zeus");
        System.out.println("Dionysus' height is: " + Dionysus.getHeight());

        GodDto mapper = GodMapper.MAPPER.toGodDto(Zeus);


        System.out.println("check dto: " + mapper.toString());

    }

}
