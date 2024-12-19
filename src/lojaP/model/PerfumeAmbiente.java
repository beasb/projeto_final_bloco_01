package lojaP.model;

public class PerfumeAmbiente extends Perfume {
	
	private String ambiente;

	public PerfumeAmbiente(int cod, String nome, String marca, int tipo, Double preco, String ambiente) {
		super(cod, nome, marca, tipo, preco);
		this.ambiente = ambiente;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	@Override
	public void visualizar() {
		 super.visualizar();
		System.out.println("Tipo de Ambiente: " + this.ambiente);
	}
	
}
