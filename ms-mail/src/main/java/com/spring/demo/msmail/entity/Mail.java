package com.spring.demo.msmail.entity;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "mail")
public class Mail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "to")
    private String to;
    @Column(name = "subject")
    private String subject;
    @Column(name = "text")
    private String text;
}
