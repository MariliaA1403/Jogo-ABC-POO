package br.unicap.si.poo.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import br.unicap.si.poo.project.demo.model.Jogador;
import br.unicap.si.poo.project.demo.service.JogadorService;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorService service;

    @GetMapping
    public List<Jogador> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Jogador buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id).orElseThrow(() -> new RuntimeException("Jogador não encontrado"));
    }

    @PostMapping
    public Jogador criar(@RequestBody Jogador jogador) {
        return service.salvar(jogador);
    }

    @PutMapping("/{id}")
    public Jogador atualizar(@PathVariable Long id, @RequestBody Jogador jogador) {
        return service.atualizar(id, jogador);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
