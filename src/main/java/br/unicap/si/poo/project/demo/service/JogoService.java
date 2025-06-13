/* 
package br.unicap.si.poo.project.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.unicap.si.poo.project.demo.model.Jogo;
import br.unicap.si.poo.project.demo.repository.JogoRepository;


import java.util.List;
import java.util.Optional;

@Service
public class JogoService {

    @Autowired
    private JogoRepository repository;

    public List<Jogo> listar() {
        return repository.findAll();
    }

    public Optional<Jogo> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Jogo salvar(Jogo jogo) {
        validar(jogo);
        return repository.save(jogo);
    }

    public Jogo atualizar(Long id, Jogo novoJogo) {
        validar(novoJogo);
        return repository.findById(id).map(jogo -> {
            jogo.setNome(novoJogo.getNome());
            jogo.setDescricao(novoJogo.getDescricao());
            jogo.setTipo(novoJogo.getTipo());
            return repository.save(jogo);
        }).orElseThrow(() -> new RuntimeException("Jogo não encontrado com ID: " + id));
    }

    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Jogo não encontrado com ID: " + id);
        }
        repository.deleteById(id);
    }

    private void validar(Jogo jogo) {
        if (jogo.getNome() == null || jogo.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do jogo é obrigatório.");
        }
        if (jogo.getNome().length() > 100) {
            throw new IllegalArgumentException("O nome do jogo deve ter no máximo 100 caracteres.");
        }
        if (jogo.getDescricao() != null && jogo.getDescricao().length() > 500) {
            throw new IllegalArgumentException("A descrição deve ter no máximo 500 caracteres.");
        }
        if (jogo.getTipo() != null && jogo.getTipo().length() > 50) {
            throw new IllegalArgumentException("O tipo deve ter no máximo 50 caracteres.");
        }
    }
}
*/