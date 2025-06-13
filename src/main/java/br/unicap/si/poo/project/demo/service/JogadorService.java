package br.unicap.si.poo.project.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import br.unicap.si.poo.project.demo.model.Jogador;
import br.unicap.si.poo.project.demo.repository.JogadorRepository;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository repository;

    public List<Jogador> listar() {
        return repository.findAll();
    }

    public Optional<Jogador> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Jogador salvar(Jogador jogador) {
        if (jogador.getId() == null) {
            jogador.setDataCadastro(LocalDate.now());
        }
        return repository.save(jogador);
    }

    public Jogador atualizar(Long id, Jogador jogadorAtualizado) {
        return repository.findById(id).map(jogador -> {
            jogador.setNome(jogadorAtualizado.getNome());
            jogador.setIdade(jogadorAtualizado.getIdade());
            jogador.setPontuacaoTotal(jogadorAtualizado.getPontuacaoTotal());
            jogador.setEmail(jogadorAtualizado.getEmail());
            jogador.setSenha(jogadorAtualizado.getSenha());
            jogador.setTipo(jogadorAtualizado.getTipo());
            return repository.save(jogador);
        }).orElseThrow(() -> new RuntimeException("Jogador não encontrado"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
