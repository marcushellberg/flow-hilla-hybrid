package com.example.application;

import java.time.LocalDate;

public record Contact(
    String name,
    String company,
    String jobTitle,
    LocalDate lastContacted,
    String pictureUrl
) {
}
