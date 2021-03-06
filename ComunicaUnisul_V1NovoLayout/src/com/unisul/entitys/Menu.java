package com.unisul.entitys;

public class Menu {

	private Long id;
	private String nome;
	private String descricao;
	private String som;
	
	
	public Menu() {
		super();
	}


	public Menu(String nome, String descricao, String som) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.som = som;
	}


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


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getSom() {
		return som;
	}


	public void setSom(String som) {
		this.som = som;
	}


	@Override
	public String toString() {
		return "Menu [nome=" + nome + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
