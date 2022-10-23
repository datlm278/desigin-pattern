package com.example.facade.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Database {
    private Long id;
    private String name;
    private String host;
    private Timestamp workAt;
    private Timestamp stopAt;
}
