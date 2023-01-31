package com.aloyolaa.libraryapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customer", uniqueConstraints = {
        @UniqueConstraint(name = "uc_customer_dni", columnNames = {"dni"})
})
public class Customer extends BaseEntity {
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "dni", nullable = false, length = 8)
    private String dni;
}