package com.example.demo2.Repository;

import com.example.demo2.Model.God;
import com.example.demo2.Model.Power;
import net.bytebuddy.dynamic.scaffold.MethodGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

@Repository
public interface GodRepository extends JpaRepository<God, Integer> {


}
