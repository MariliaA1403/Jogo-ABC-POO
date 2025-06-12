package br.unicap.si.poo.project.demo.controller;

import br.unicap.si.poo.project.demo.model.Admin;
import br.unicap.si.poo.project.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admins")
public class AdminController {

    @Autowired
    private AdminService service;

    @GetMapping
    public List<Admin> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Admin buscar(@PathVariable Long id) {
        return service.buscarPorId(id).orElseThrow(() -> new RuntimeException("Admin não encontrado"));
    }

    @PostMapping
    public Admin criar(@RequestBody Admin admin) {
        return service.salvar(admin);
    }

    @PutMapping("/{id}")
    public Admin atualizar(@PathVariable Long id, @RequestBody Admin admin) {
        return service.atualizar(id, admin);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
