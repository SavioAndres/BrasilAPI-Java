package br.com.brasilapi.api;

public class CnpjCnaesSecundario {
	private Long codigo;
	private String descricao;
	
	public CnpjCnaesSecundario(Long codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "CnpjCnaesSecundario [codigo=" + codigo + ", descricao=" + descricao + "]";
	}
	
	
}
