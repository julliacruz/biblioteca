package br.unitins.biblioteca.livro;

import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class LivroRepository {
    @Autowired
    LivroRepository LivroRepository;

    List<Livro> getLivros(){
        return LivroRepository.findAll(); 
    }
}