package com.example.SpringBootProject.service;

import com.example.SpringBootProject.entitiy.GuestSuggestionEntity;
import com.example.SpringBootProject.repositry.GuestSuggestionRepository;
import com.example.SpringBootProject.service.interfaceAuth.SuggestionProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestSuggestionService {
    @Autowired
    private GuestSuggestionRepository repository;

    public SuggestionProcessor printAndProcessSuggestion() {
        return suggestionText -> {
            GuestSuggestionEntity suggestionEntity = new GuestSuggestionEntity();
            suggestionEntity.setSuggestionText(suggestionText);
            repository.save(suggestionEntity);
        };
    }
}
