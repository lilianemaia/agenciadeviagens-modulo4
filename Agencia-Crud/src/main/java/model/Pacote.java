package model;

import java.util.List;

public class Pacote {
	
	
	private int idPacote;
	private String NomeDoPacote;
	private int Destino;
	private int Duracao;
	private boolean Promo;
	private float Preco;
	private int PacoteId;
	
	

	public Pacote() {
	
}

	public int getIdPacote() {
		return idPacote;
	}

	public void setIdPacote(int idPacote) {
		this.idPacote = idPacote;
	}

	public String getNomeDoPacote() {
		return NomeDoPacote;
	}

	public void setNomeDoPacote(String nomeDoPacote) {
		NomeDoPacote = nomeDoPacote;
	}

	public int getDestino() {
		return Destino;
	}

	public void setDestino(int destino) {
		Destino = destino;
	}

	public int getDuracao() {
		return Duracao;
	}

	public void setDuracao(int duracao) {
		Duracao = duracao;
	}

	public boolean isPromo() {
		return Promo;
	}

	public void setPromo(boolean promo) {
		Promo = promo;
	}

	public float getPreco() {
		return Preco;
	}

	public void setPreco(float preco) {
		Preco = preco;
	}

	public int getPacoteId() {
		return PacoteId;
	}

	public void setPacoteId(int pacoteId) {
		PacoteId = pacoteId;
	}

	@Override
	public String toString() {
		return "Pacote [idPacote=" + idPacote + ", NomeDoPacote=" + NomeDoPacote + ", Destino=" + Destino + ", Duracao="
				+ Duracao + ", Promo=" + Promo + ", Preco=" + Preco + ", PacoteId=" + PacoteId + "]";
	}

	public void add(List<Pacote> pacote) {
		// TODO Auto-generated method stub
		
	}
	

}
