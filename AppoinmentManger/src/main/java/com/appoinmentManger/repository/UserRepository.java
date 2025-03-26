package com.appoinmentManger.repository;

import com.appoinmentManger.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Agent, Long> {

    List<Agent> findByDate(String date);

    List<Agent> findByName(String name);
}
