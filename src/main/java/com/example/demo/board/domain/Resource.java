package com.example.demo.board.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Resource {

    @Id
    private long id;

    private String title;

    private String description;

}
