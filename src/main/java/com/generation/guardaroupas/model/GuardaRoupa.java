package com.generation.guardaroupas.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Feito a classe precisamos transforma-la em uma entidade par aque ela vire uma tabela no nosso banco
 * de dados, para fazer isso usaremos os data anotation (explicação de cada data anotation nos comentarios)
 * */

@Entity  //Indica que a classe será uma entidade/tabela
@Table(name = "tb_quarda_rouba") //nomeia a tabela
public class GuardaRoupa {
	
	@Id // Informa que esta atributo se trata de uma Pk/ chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private long id;
	
	@NotBlank // não aceita valores null e nem " " 
	@Size(min = 3, max = 40) // define tamanho minimo e maximo de caracteres
	private String nome;
	
	@Min(0) // Definindo um valor minino obs. tambem temos o @Max()
	private int qtd;
	
	@Min(0)
	private BigDecimal valor; //este tipo vira um decimal la no banco de dados
	
	@NotBlank // não aceita valores null e nem " " 
	@Size(min = 3, max = 10) // define tamanho minimo e maximo de caracteres
	private String cor;
	
	@NotBlank // não aceita valores null e nem " " 
	@Size(min = 3, max = 20) // define tamanho minimo e maximo de caracteres
	private String marca;
	
	private boolean ativo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
