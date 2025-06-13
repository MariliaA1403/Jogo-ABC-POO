/*
package br.unicap.si.poo.project.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Progresso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int acertos;
    private int erros;
    private LocalDate data;

    @ManyToOne(optional = false)
    @JoinColumn(name = "jogador_id")
    private Jogador jogador;

    @ManyToOne(optional = false)
    @JoinColumn(name = "jogo_id")
    private Jogo jogo;

    // Construtores
    public Progresso() {
        this.data = LocalDate.now(); // define a data como hoje por padrão
    }

    public Progresso(int acertos, int erros, Jogador jogador, Jogo jogo) {
        this.acertos = acertos;
        this.erros = erros;
        this.jogador = jogador;
        this.jogo = jogo;
        this.data = LocalDate.now();
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getAcertos() { return acertos; }
    public void setAcertos(int acertos) { this.acertos = acertos; }

    public int getErros() { return erros; }
    public void setErros(int erros) { this.erros = erros; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public Jogador getJogador() { return jogador; }
    public void setJogador(Jogador jogador) { this.jogador = jogador; }

    public Jogo getJogo() { return jogo; }
    public void setJogo(Jogo jogo) { this.jogo = jogo; }
}
    
*/