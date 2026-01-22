package org.cs.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class AuthenticationStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "login_time")
    private LocalDateTime loginTime;

    @Column(name = "currently_active")
    private boolean isActive;

    @Column(name = "logged_device")
    private String device;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User student;
}
