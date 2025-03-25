package com.appoinmentManger.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="users")
public class UserDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
}
