package com.example.demo.menu.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@SequenceGenerator(name="menu_id_gen", sequenceName = "seq_menu", initialValue = 1, allocationSize = 1)
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "menu_id_gen")
    private long id;

    private String name;

//    private List<>

}
