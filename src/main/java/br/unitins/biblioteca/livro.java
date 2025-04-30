package br.unitins.biblioteca.livro;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.setter;

@Entity
@Getter
@Setter
public class livro{
    @Id
    Long idLivro;
    String titulo;
    String autor;
    String editora;
    int gtdePaginas;
}
