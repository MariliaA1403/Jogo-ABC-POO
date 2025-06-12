package br.unicap.si.poo.project.demo.service;

import br.unicap.si.poo.project.demo.model.Admin;
import br.unicap.si.poo.project.demo.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository repository;

    public List<Admin> listar() {
        return repository.findAll();
    }

    public Optional<Admin> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Admin salvar(Admin admin) {
        return repository.save(admin);
    }

    public Admin atualizar(Long id, Admin novo) {
        return repository.findById(id).map(a -> {
            a.setUsuario(novo.getUsuario());
            a.setSenha(novo.getSenha());
            return repository.save(a);
        }).orElseThrow(() -> new RuntimeException("Admin não encontrado"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
