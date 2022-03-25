package model;

public class Destino {

	private Integer IdDestino;
	private String NomeDoDestino;
	private String Cidade;
	private String Estado;
	private String Descricao;

	
	
	public Destino() {
		
	}



	public Integer getIdDestino() {
		return IdDestino;
	}



	public void setIdDestino(Integer idDestino) {
		IdDestino = idDestino;
	}



	public String getNomeDoDestino() {
		return NomeDoDestino;
	}



	public void setNomeDoDestino(String nomeDoDestino) {
		NomeDoDestino = nomeDoDestino;
	}



	public String getCidade() {
		return Cidade;
	}



	public void setCidade(String cidade) {
		Cidade = cidade;
	}



	public String getEstado() {
		return Estado;
	}



	public void setEstado(String estado) {
		Estado = estado;
	}



	public String getDescricao() {
		return Descricao;
	}



	public void setDescricao(String descricao) {
		Descricao = descricao;
	}



	@Override
	public String toString() {
		return "Destino [IdDestino=" + IdDestino + ", NomeDoDestino=" + NomeDoDestino + ", Cidade=" + Cidade
				+ ", Estado=" + Estado + ", Descricao=" + Descricao + "]";
	}


}