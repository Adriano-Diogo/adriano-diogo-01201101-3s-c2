package br.com.lutadores.lutadoresprova.controle;


import br.com.lutadores.lutadoresprova.dominio.Lutador;
import br.com.lutadores.lutadoresprova.repositorio.LutadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/lutadores")
public class LutadorController {

    @Autowired
    private LutadorRepository repository;

    @PostMapping
    public ResponseEntity createLutador(@RequestBody @Valid Lutador novoLutador){

        novoLutador.setVivo(true);
        novoLutador.setConcentracoesRealizadas(0);
        novoLutador.setVida(100.0);

        repository.save(novoLutador);
        return ResponseEntity.status(201).build();
    }

    @GetMapping
    public ResponseEntity getLutador(){
        return ResponseEntity.status(200).body(repository.findAll());
    }



}
