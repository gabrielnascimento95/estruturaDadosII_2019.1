package controller;
import java.util.ArrayList;
import java.util.List;
import model.*;
import algoritOrdenacao.*;

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
		
		
		LeituraTXT obj = new LeituraTXT();
		List<Integer> listEntradas = new ArrayList<Integer>();
		obj.ler(listEntradas);
		System.out.println("\n");
		System.out.println("---------------Objetos dentro da lista---------------");
		for(Integer item : listEntradas){
			System.out.println(item.intValue());
		}
		
		*/
		
		InsertionSort objInsertion = new InsertionSort();
		BubbleSort objBubble = new BubbleSort();
		SelectionSort objSelection = new SelectionSort();
		
		List<Integer> listInteiros = new ArrayList<Integer>();
		listInteiros.add(10);
		listInteiros.add(15);
		listInteiros.add(1);
		listInteiros.add(16);
		listInteiros.add(9);
		listInteiros.add(70);
		listInteiros.add(21);
		
		//objInsertion.ordenaInsertSort(listInteiros);
		//objInsertion.imprimeArray(listInteiros);
		
		//objBubble.OrdenaBubbleSort(listInteiros);
		//objBubble.imprimeArray(listInteiros);
		
		//objSelection.ordenaSelectionSort(listInteiros);
		//objSelection.imprimeArray(listInteiros);
	}
	
	

}