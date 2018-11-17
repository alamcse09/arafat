package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table( name = "data" )
@lombok.Data
public class Data {


    @Id
    @Column( name = "id" )
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;

    @Column( name = "data" )
    private Integer data;
}
