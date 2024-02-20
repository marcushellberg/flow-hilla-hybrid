package com.example.application;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class ContactRepository {


    public List<Contact> findAll() {
        // return a list of 10 contacts with realistic dummy data
        return List.of(
                new Contact("Emma Johnson", "TechWave", "Software Engineer", LocalDate.of(2023, 12, 10), "https://i.pravatar.cc/32"),
                new Contact("James Smith", "InnovateCorp", "Project Manager", LocalDate.of(2023, 12, 5), "https://i.pravatar.cc/32"),
                new Contact("Olivia Brown", "GreenTech Solutions", "Marketing Director", LocalDate.of(2023, 11, 30), "https://i.pravatar.cc/32"),
                new Contact("William Davis", "FutureWorks", "Data Scientist", LocalDate.of(2023, 11, 25), "https://i.pravatar.cc/32"),
                new Contact("Isabella Miller", "CyberSecure", "Security Analyst", LocalDate.of(2023, 11, 20), "https://i.pravatar.cc/32"),
                new Contact("Ethan Wilson", "BrightAI", "AI Researcher", LocalDate.of(2023, 11, 15), "https://i.pravatar.cc/32"),
                new Contact("Ava Martinez", "EcoEnergy", "Environmental Engineer", LocalDate.of(2023, 11, 10), "https://i.pravatar.cc/32"),
                new Contact("Sophia Anderson", "QuantumSpace", "Astrophysicist", LocalDate.of(2023, 11, 5), "https://i.pravatar.cc/32"),
                new Contact("Mason Hernandez", "BioLife Labs", "Biologist", LocalDate.of(2023, 10, 31), "https://i.pravatar.cc/32"),
                new Contact("Mia Clark", "NextGen Robotics", "Robotics Engineer", LocalDate.of(2023, 10, 26), "https://i.pravatar.cc/32")
        );
    }
}
