/* 
package br.unicap.si.poo.project.demo.controller;

import br.unicap.si.poo.project.demo.model.Jogo;
import br.unicap.si.poo.project.demo.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    @Autowired
    private JogoService service;

    @GetMapping
    public ResponseEntity<List<Jogo>> listar() {
        List<Jogo> jogos = service.listar();
        return ResponseEntity.ok(jogos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Jogo> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Jogo> criar(@RequestBody Jogo jogo) {
        Jogo criado = service.salvar(jogo);
        URI location = URI.create("/jogos/" + criado.getId());
        return ResponseEntity.created(location).body(criado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Jogo> atualizar(@PathVariable Long id, @RequestBody Jogo jogo) {
        try {
            Jogo atualizado = service.atualizar(id, jogo);
            return ResponseEntity.ok(atualizado);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        try {
            service.deletar(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
*/