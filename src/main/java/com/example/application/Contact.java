package com.example.application;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;


// snippet start
@Entity
public final class Contact {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String company;
    private String jobTitle;
    private LocalDate lastContacted;
    private String pictureUrl;

    // Constructor, getters and setters

    // Snippet end

    public Contact() {
    }

    public Contact(
            String name,
            String company,
            String jobTitle,
            LocalDate lastContacted,
            String pictureUrl
    ) {
        this.name = name;
        this.company = company;
        this.jobTitle = jobTitle;
        this.lastContacted = lastContacted;
        this.pictureUrl = pictureUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public LocalDate getLastContacted() {
        return lastContacted;
    }

    public void setLastContacted(LocalDate lastContacted) {
        this.lastContacted = lastContacted;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
