package br.unicap.si.poo.project.demo.controller;

import br.unicap.si.poo.project.demo.model.Tentativa;
import br.unicap.si.poo.project.demo.service.TentativaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tentativas")
public class TentativaController {

    @Autowired
    private TentativaService service;

    @GetMapping
    public List<Tentativa> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Tentativa buscar(@PathVariable Long id) {
        return service.buscarPorId(id).orElseThrow(() -> new RuntimeException("Tentativa não encontrada"));
    }

    @PostMapping
    public Tentativa criar(@RequestBody Tentativa tentativa) {
        return service.salvar(tentativa);
    }

    @PutMapping("/{id}")
    public Tentativa atualizar(@PathVariable Long id, @RequestBody Tentativa tentativa) {
        return service.atualizar(id, tentativa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
