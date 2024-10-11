package Atividade01;

public class Casa {
	private long id;
	private String nome;
	private double valoAluguel;
	private String cor;
	
	public Casa() {
	}
	public Casa(long id, String nome, double valoAluguel, String cor) {
		this.id = id;
		this.nome = nome;
		this.cor = cor;
		setValoAluguel(valoAluguel);
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
	public double getValoAluguel() {
		return valoAluguel;
	}
	public void setValoAluguel(double valoAluguel) {
		if(valoAluguel > 0) {
			this.valoAluguel = valoAluguel;			
		}else {
			System.out.println("O valor é negativo ou nullo(0)");
		}
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
}
