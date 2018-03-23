package demospring2.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Portifolio {
	
	
	// relacao 1:1 com pessoa
	private Long id;
	@OneToOne
	private Pessoa pessoa;
	
	// relacao 1:n com trabalh
	@OneToMany
	private List<Trabalho> trabalho;
	@Column
	private String descricao;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public List<Trabalho> getTrabalho() {
		return trabalho;
	}
	public void setTrabalho(List<Trabalho> trabalho) {
		this.trabalho = trabalho;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}