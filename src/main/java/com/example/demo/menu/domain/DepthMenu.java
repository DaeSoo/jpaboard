package com.example.demo.menu.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@SequenceGenerator(name="depth_menu_id_gen", sequenceName = "seq_depth_menu", initialValue = 1, allocationSize = 1)
public class DepthMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_depth_menu")
    private long id;
}
