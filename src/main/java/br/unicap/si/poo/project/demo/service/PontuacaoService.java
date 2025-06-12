package br.unicap.si.poo.project.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.unicap.si.poo.project.demo.model.Pontuacao;
import br.unicap.si.poo.project.demo.repository.PontuacaoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PontuacaoService {
    @Autowired
    private PontuacaoRepository repository;

    public List<Pontuacao> listar() {
        return repository.findAll();
    }

    public Optional<Pontuacao> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Pontuacao salvar(Pontuacao pontuacao) {
        return repository.save(pontuacao);
    }

    public Pontuacao atualizar(Long id, Pontuacao nova) {
        return repository.findById(id).map(pontuacao -> {
            pontuacao.setValor(nova.getValor());
            pontuacao.setJogador(nova.getJogador());
            pontuacao.setJogo(nova.getJogo());
            return repository.save(pontuacao);
        }).orElseThrow(() -> new RuntimeException("Pontuação não encontrada"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
