package com.aloyolaa.libraryapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "location")
public class Location extends BaseEntity {
    @Column(name = "denomination", nullable = false)
    private String denomination;
}