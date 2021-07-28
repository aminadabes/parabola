package com.elaboratecnologia.parabolas.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_parabola")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Parabola {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titulo;

    private String referencia;

    private String ideiaCentral;

    private String ideiaSecundaria;

    private String aplicacao;
}
