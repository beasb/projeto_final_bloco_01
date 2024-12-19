package lojaP.controller;

import java.util.ArrayList;

import lojaP.model.Perfume;
import lojaP.repository.PerfumeRepository;

public class PerfumeController implements PerfumeRepository{
	
	private ArrayList<Perfume> listaPerfumes = new ArrayList<Perfume>();


	@Override
	public void procurarPorCod(int cod) {
		var perfume = buscarCod(cod);
		
		if (perfume != null) {
			perfume.visualizar();
		}else {
			System.out.println("O Perfume " + cod + " não foi encontrando");
		}
	}

	@Override
	public void listarTodas() {
		for (var perfume : listaPerfumes) {
			perfume.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Perfume perfume) {
		listaPerfumes.add(perfume);
		System.out.println("\nO Perfume " + perfume.getNome() + " foi cadastrado com sucesso!");
		
	}

	@Override
	public void atualizar(Perfume perfume) {
		var buscaPerfume = buscarCod(perfume.getCod());
		
		if (buscaPerfume != null) {
			listaPerfumes.set(listaPerfumes.indexOf(buscaPerfume), perfume);
			System.out.println("\nO Perfume " + perfume.getCod() + " foi atualizado com sucesso!");
		}else {
			System.out.println("\\nO Perfume " + perfume.getCod() + "não foi encontrada!");
		}
		
	}

	@Override
	public void deletar(int cod) {
		var perfume = buscarCod(cod);
		
		if (perfume != null) {
			if (listaPerfumes.remove(perfume) == true);
			System.out.println("\nO Perfume " + cod + " foi removido com sucesso!");
		}else {
			System.out.println("\nO Perfume " + cod  + " não foi encontrado!");
		}
		
	}
	
	
	public Perfume buscarCod(int cod) {
		for (var perfume : listaPerfumes) {
			if (perfume.getCod() == cod) {
				return perfume;
			}
		}
		return null;
	}

}

