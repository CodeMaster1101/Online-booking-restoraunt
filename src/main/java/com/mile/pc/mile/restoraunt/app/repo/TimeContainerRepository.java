package com.mile.pc.mile.restoraunt.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mile.pc.mile.restoraunt.app.model.TimeContainer;
import com.mile.pc.mile.restoraunt.app.model.User;

@Repository
public interface TimeContainerRepository extends JpaRepository<TimeContainer, Long>{
	TimeContainer findByUser(User user);
}