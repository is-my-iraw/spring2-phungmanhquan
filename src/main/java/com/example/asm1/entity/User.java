package com.example.asm1.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private int address;
    @Column(name = "phone")
    private int phone;

    public User(String name, String email, int address, int phone) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }
}
