package lojaP.model;

public class Perfume {
	
	private int cod;
	private String nome;
	private String marca;
	private String tipo;
	private Double preco;
	
	public Perfume(int cod, String nome, String marca, String tipo, Double preco) {
		this.cod = cod;
		this.nome = nome;
		this.marca = marca;
		this.tipo = tipo;
		this.preco = preco;	
	}
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
public void visualizar() {
		 
		System.out.println("\n\n**********************************************");
		System.out.println("Dados do Perfume: ");
		System.out.println("Código do Perfume: " + this.cod);
		System.out.println("Nome do Perfume: " + this.nome);
		System.out.println("Marca do Perfume: " + this.marca);
		System.out.println("Tipo do Perfume: " + tipo);
		System.out.println("Preço do Perfume: " + this.preco);
	}

	
}
