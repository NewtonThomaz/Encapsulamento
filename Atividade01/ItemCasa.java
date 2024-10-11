package Atividade01;

public class ItemCasa {
	private long id;
	private String nome;
	private String descriçao;
	
	public ItemCasa() {
	}
	public ItemCasa(long id, String nome, String descriçao) {
		this.id = id;
		this.nome = nome;
		this.descriçao = descriçao;
	}
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
	public String getDescriçao() {
		return descriçao;
	}
	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}
}