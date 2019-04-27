package controller;
import java.util.ArrayList;
import java.util.List;
import model.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		LeituraCSV obj = new LeituraCSV();
		List<Pais> listPais = new ArrayList<Pais>();
		obj.ler(listPais);
		
		System.out.println("\n");
		System.out.println("---------------Objetos dentro da lista---------------");
		for(Pais item : listPais){
			System.out.println("Código "+ item.getCod() + " Nome: " + item.getNome());
		}
		*/
		
		LeituraTXT obj = new LeituraTXT();
		List<Integer> listEntradas = new ArrayList<Integer>();
		obj.ler(listEntradas);
		System.out.println("\n");
		System.out.println("---------------Objetos dentro da lista---------------");
		for(Integer item : listEntradas){
			System.out.println(item.intValue());
		}
	}
	
	

}
