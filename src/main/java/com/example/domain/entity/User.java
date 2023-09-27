package com.example.domain.entity;


import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@RequiredArgsConstructor
@Table(name="username")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="password")
    private String name;

    @Column(name = "userrole")
    private String role;

    public User(String id, String name, String role) {
        this.id = Long.valueOf(id);
        this.name = name;
        this.role = role;
    }

}
