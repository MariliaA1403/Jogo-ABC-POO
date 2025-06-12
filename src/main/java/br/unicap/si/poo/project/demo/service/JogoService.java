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
        return repository.save(jogo);
    }

    public Jogo atualizar(Long id, Jogo novo) {
        return repository.findById(id).map(jogo -> {
            jogo.setNome(novo.getNome());
            jogo.setDescricao(novo.getDescricao());
            jogo.setTipo(novo.getTipo());
            return repository.save(jogo);
        }).orElseThrow(() -> new RuntimeException("Jogo não encontrado"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
