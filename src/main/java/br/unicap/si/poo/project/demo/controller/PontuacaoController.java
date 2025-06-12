package br.unicap.si.poo.project.demo.controller;

import br.unicap.si.poo.project.demo.model.Pontuacao;
import br.unicap.si.poo.project.demo.service.PontuacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pontuacoes")
public class PontuacaoController {
    @Autowired
    private PontuacaoService service;

    @GetMapping
    public List<Pontuacao> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Pontuacao buscar(@PathVariable Long id) {
        return service.buscarPorId(id).orElseThrow(() -> new RuntimeException("Pontuação não encontrada"));
    }

    @PostMapping
    public Pontuacao criar(@RequestBody Pontuacao pontuacao) {
        return service.salvar(pontuacao);
    }

    @PutMapping("/{id}")
    public Pontuacao atualizar(@PathVariable Long id, @RequestBody Pontuacao pontuacao) {
        return service.atualizar(id, pontuacao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
