package lojaP.repository;

import lojaP.model.Perfume;

public interface PerfumeRepository {

	public void procurarPorCod(int cod);
	public void listarTodas();
	public void cadastrar(Perfume perfume);
	public void atualizar(Perfume perfume);
	public void deletar(int cod);
}
