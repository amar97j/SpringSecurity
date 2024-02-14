package com.example.SpringBootProject.repositry;

import com.example.SpringBootProject.entitiy.GuestSuggestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GuestSuggestionRepository extends JpaRepository<GuestSuggestionEntity, Long> {

}