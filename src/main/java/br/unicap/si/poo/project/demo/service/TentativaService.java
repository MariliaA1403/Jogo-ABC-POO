package br.unicap.si.poo.project.demo.service;

import br.unicap.si.poo.project.demo.model.Tentativa;
import br.unicap.si.poo.project.demo.repository.TentativaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TentativaService {

    @Autowired
    private TentativaRepository repository;

    public List<Tentativa> listar() {
        return repository.findAll();
    }

    public Optional<Tentativa> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Tentativa salvar(Tentativa tentativa) {
        return repository.save(tentativa);
    }

    public Tentativa atualizar(Long id, Tentativa nova) {
        return repository.findById(id).map(t -> {
            t.setNumeroTentativas(nova.getNumeroTentativas());
            t.setJogador(nova.getJogador());
            t.setJogo(nova.getJogo());
            return repository.save(t);
        }).orElseThrow(() -> new RuntimeException("Tentativa não encontrada"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
