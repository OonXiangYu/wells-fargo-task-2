package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.Date;

public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioID;

    @Column(nullable = false)
    private Date creationDate;

    @ManyToOne
    @JoinColumn(name = "clientID")
    private Client client;

    public Portfolio(long portfolioID,Date date ,Client client) {
        this.portfolioID = portfolioID;
        this.creationDate = date;
        this.client = client;
    }

    public long getPortfolioID() {
        return portfolioID;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
