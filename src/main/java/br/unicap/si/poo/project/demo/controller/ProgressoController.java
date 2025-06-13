/* 
package br.unicap.si.poo.project.demo.controller;

import br.unicap.si.poo.project.demo.model.Progresso;
import br.unicap.si.poo.project.demo.service.ProgressoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/progresso")
public class ProgressoController {

    @Autowired
    private ProgressoService service;

    @GetMapping
    public ResponseEntity<List<Progresso>> listar() {
        List<Progresso> lista = service.listar();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Progresso> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Progresso> criar(@RequestBody Progresso progresso) {
        Progresso criado = service.salvar(progresso);
        return ResponseEntity.ok(criado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Progresso> atualizar(@PathVariable Long id, @RequestBody Progresso progresso) {
        try {
            Progresso atualizado = service.atualizar(id, progresso);
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