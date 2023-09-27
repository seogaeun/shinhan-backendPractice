package com.example.domain.entity;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@RequiredArgsConstructor
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 자료형을 Long으로 변경

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name = "role")
    private String role;

    public User(String password, String name, String role) {
        this.username = name;
        this.password = password;
        this.role = role;
    }
}

