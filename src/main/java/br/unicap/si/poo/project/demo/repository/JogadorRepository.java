package br.unicap.si.poo.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.unicap.si.poo.project.demo.model.Jogador;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
}
