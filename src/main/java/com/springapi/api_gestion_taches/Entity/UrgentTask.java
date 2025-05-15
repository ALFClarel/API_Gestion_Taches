package com.springapi.api_gestion_taches.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class UrgentTask extends Task {
    @ManyToOne
    private User author;

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
