package br.com.pinalli.personapi.entity;

import br.com.pinalli.personapi.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
/*
@Author AlbertoRochaPinalli
 */

//lombok gera
@Entity
@Data  //os getters e setters
@Builder //construtor do projeto
@AllArgsConstructor // os construtores
@NoArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false)
    private String number;


}