/*
package br.unicap.si.poo.project.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.unicap.si.poo.project.demo.model.Progresso;
import br.unicap.si.poo.project.demo.repository.ProgressoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProgressoService {

    @Autowired
    private ProgressoRepository repository;

    public List<Progresso> listar() {
        return repository.findAll();
    }

    public Optional<Progresso> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Progresso salvar(Progresso progresso) {
        // Define a data como hoje se estiver nulo
        if (progresso.getData() == null) {
            progresso.setData(java.time.LocalDate.now());
        }
        return repository.save(progresso);
    }

    public Progresso atualizar(Long id, Progresso nova) {
        return repository.findById(id).map(p -> {
            p.setAcertos(nova.getAcertos());
            p.setErros(nova.getErros());
            p.setJogador(nova.getJogador());
            p.setJogo(nova.getJogo());
            // Não atualiza a data para manter o registro original
            return repository.save(p);
        }).orElseThrow(() -> new RuntimeException("Progresso com ID " + id + " não encontrado"));
    }

    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Progresso com ID " + id + " não existe para exclusão");
        }
        repository.deleteById(id);
    }
}

*/