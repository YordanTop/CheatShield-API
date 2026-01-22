package org.cs.entity;

import jakarta.persistence.*;

@Entity
public class MonitorSettings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "settings_name")
    private String settingsName;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private User teacher;



}
