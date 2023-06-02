package com.dio.santander.banklineapi;

public class Correntista {
     private Integer id;
     private String cpf;
     private String nome;
     
     private Conta conta;
     
     public Conta getConta() {
          return conta;
     }
     public void setConta(Conta conta) {
          this.conta = conta;
     }

     public Integer getId() {
          return this.id;
     }

     public void setId(Integer id) {
          this.id = id;
     }

     public String getCpf() {
          return this.cpf;
     }

     public void setCpf(String cpf) {
          this.cpf = cpf;
     }

     public String getNome() {
          return this.nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }
    

}
