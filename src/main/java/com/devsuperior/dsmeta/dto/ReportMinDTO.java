package com.devsuperior.dsmeta.dto;

import com.devsuperior.dsmeta.entities.Sale;

import java.time.LocalDate;

public class ReportMinDTO {

    private Long id;
    private LocalDate date;
    private Double amount;
    private String sellerName;


    public ReportMinDTO(Long id, LocalDate date, Double amount, String sellerName){
        this.id=id;
        this.date=date;
        this.amount=amount;
        this.sellerName=sellerName;
    }

    public ReportMinDTO(Sale entity){
        id=entity.getId();
        date=entity.getDate();
        amount=entity.getAmount();
        sellerName=entity.getSeller().getName();
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getAmount() {
        return amount;
    }

    public String getSellerName() {
        return sellerName;
    }

    @Override
    public String toString() {
        return "ReportMinDTO{" +
                "id=" + id +
                ", date=" + date +
                ", amount=" + amount +
                ", name='" + sellerName + '\'' +
                '}';
    }
}