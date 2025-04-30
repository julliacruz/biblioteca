package br.unitins.biblioteca.livro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMappaing;
import org.springframework.web.bind.annotation.RestContoller;
import java.util.List;

@RestContoller
public class LivroController{

    @Autowired
    LivroService LivroService

    @GetMappaing("/Livros")
    List<Livro> pegarLivros(){
        return LivroService.getLivros();
    }
}