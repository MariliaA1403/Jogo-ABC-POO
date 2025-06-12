package br.unicap.si.poo.project.demo.model;

import jakarta.persistence.*;

@Entity
public class Tentativa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numeroTentativas;

    @ManyToOne
    @JoinColumn(name = "jogador_id")
    private Jogador jogador;

    @ManyToOne
    @JoinColumn(name = "jogo_id")
    private Jogo jogo;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getNumeroTentativas() { return numeroTentativas; }
    public void setNumeroTentativas(int numeroTentativas) { this.numeroTentativas = numeroTentativas; }

    public Jogador getJogador() { return jogador; }
    public void setJogador(Jogador jogador) { this.jogador = jogador; }

    public Jogo getJogo() { return jogo; }
    public void setJogo(Jogo jogo) { this.jogo = jogo; }
}
