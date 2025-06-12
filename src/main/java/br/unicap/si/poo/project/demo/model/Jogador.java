package br.unicap.si.poo.project.demo.model;

import jakarta.persistence.*;

@Entity
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int idade;
    private int pontuacaoTotal;

    
    public Long getId() {
         return id; 
        }
    public void setId(Long id) {
         this.id = id; 
        }

    public String getNome() {
         return nome; 
        }
    public void setNome(String nome) {
         this.nome = nome; 
        }

    public int getIdade() {
         return idade;
         }
    public void setIdade(int idade) {
         this.idade = idade;
         }

    public int getPontuacaoTotal() {
         return pontuacaoTotal;
         }
    public void setPontuacaoTotal(int pontuacaoTotal) {
         this.pontuacaoTotal = pontuacaoTotal;
         }
}
