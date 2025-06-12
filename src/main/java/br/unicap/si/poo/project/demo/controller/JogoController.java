package br.unicap.si.poo.project.demo.controller;

import br.unicap.si.poo.project.demo.model.Jogo;
import br.unicap.si.poo.project.demo.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoController {
    @Autowired
    private JogoService service;

    @GetMapping
    public List<Jogo> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Jogo buscar(@PathVariable Long id) {
        return service.buscarPorId(id).orElseThrow(() -> new RuntimeException("Jogo não encontrado"));
    }

    @PostMapping
    public Jogo criar(@RequestBody Jogo jogo) {
        return service.salvar(jogo);
    }

    @PutMapping("/{id}")
    public Jogo atualizar(@PathVariable Long id, @RequestBody Jogo jogo) {
        return service.atualizar(id, jogo);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
