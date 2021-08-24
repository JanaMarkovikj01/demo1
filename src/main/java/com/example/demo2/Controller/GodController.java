package com.example.demo2.Controller;

import com.example.demo2.Model.God;
import com.example.demo2.Repository.GodRepository;
import com.example.demo2.Repository.PowerRepository;
import com.example.demo2.dto.GodDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GodController {
    @Autowired
    private GodRepository godRepository;
    @Autowired
    private PowerRepository powerRepository;


    @GetMapping("/findAllGods")
    public List<God> findAllGods() {
        System.out.println(godRepository.findAll());
        return godRepository.findAll();

    }


}
