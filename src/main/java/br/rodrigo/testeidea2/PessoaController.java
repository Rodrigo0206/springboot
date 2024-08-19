package br.rodrigo.testeidea2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @GetMapping
    public ResponseEntity<Pessoa> getPessoa(){
        final Pessoa pessoa = new Pessoa("Rodrigo e maria", 37);
        return ResponseEntity.ok(pessoa);
    }
}
