package br.dh.meli.storage01.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor

@Entity // indica que esta classe será persistida no BD
@Table(name = "tb_user") // nome dado a tabela no BD, é opcional. É do 'javax'
public class UserBD {
    // cada atributo é um coluna
    @Id // indica que "cod" é chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera id automático, autoincrement
    // se colocar 'long' com 'L' maiúsculo ele pode ser null, e com 'l' minúsculo não pode ser nulo
    private long cod;

    @Column(length = 150, nullable = false)
    private String name;
    @Column(name = "e_mail", length = 100, unique = true)
    private String email;
}
