package com.dio.santander.banklineapi;

import java.time.LocalDateTime;

public class Movimentacao {
     private Integer id;
     private LocalDateTime dataHora;
     private String descricao;
     private Double valor;
     private MovimentacaoTipo tipo;

     public Integer getId() {
          return this.id;
     }

     public void setId(Integer id) {
          this.id = id;
     }

     public LocalDateTime getDataHora() {
          return this.dataHora;
     }

     public void setDataHora(LocalDateTime dataHora) {
          this.dataHora = dataHora;
     }

     public String getDescricao() {
          return this.descricao;
     }

     public void setDescricao(String descricao) {
          this.descricao = descricao;
     }

     public Double getValor() {
          return this.valor;
     }

     public void setValor(Double valor) {
          this.valor = valor;
     }

     public MovimentacaoTipo getTipo() {
          return this.tipo;
     }

     public void setTipo(MovimentacaoTipo tipo) {
          this.tipo = tipo;
     }

}
