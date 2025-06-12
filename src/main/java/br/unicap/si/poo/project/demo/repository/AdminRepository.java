package br.unicap.si.poo.project.demo.repository;

import br.unicap.si.poo.project.demo.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsuario(String usuario);
}
