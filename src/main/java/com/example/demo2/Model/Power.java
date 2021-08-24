package com.example.demo2.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Power {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String standardPower;

    @Column
    private String uniquePower;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="god_fk")
    private God god;


}

/*{
    "god":{
        "name":"Zeus",
        "height":"200",
        "mother": "rhea",
        "father":"cronus",
        "powers":{
            "id":"1",
            "standardPower":"strength",
            "uniquePower": "lightning"

        }
    }*/