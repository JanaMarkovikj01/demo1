package com.example.demo2.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class God {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;
    @Column
    private int height;
    @Column
    private String mother;
    @Column
    private String father;


    @OneToMany(fetch =FetchType.LAZY, mappedBy = "god")
    private List<Power> powers;

}
