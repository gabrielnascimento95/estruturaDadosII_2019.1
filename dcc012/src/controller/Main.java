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
		
		
		ManipulacaoTXT obj = new ManipulacaoTXT();
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
		MergeSort objMerge = new MergeSort();
		QuickSort objQuick = new QuickSort();
		HeapSort objHeap = new HeapSort();
		MeuSort objMeuSort = new MeuSort();
		
		List<Integer> listInteiros = new ArrayList<Integer>();
		listInteiros.add(10);
		listInteiros.add(15);
		listInteiros.add(1);
		listInteiros.add(16);
		listInteiros.add(9);
		listInteiros.add(34);
		listInteiros.add(70);
		listInteiros.add(21);
		listInteiros.add(45);
		listInteiros.add(89);
		
		//objInsertion.ordenaInsertSort(listInteiros);
		//objInsertion.imprimeArray(listInteiros);
		
		//objBubble.ordenaBubbleSort(listInteiros);
		//objBubble.imprimeArray(listInteiros);
		
		//objSelection.ordenaSelectionSort(listInteiros);
		//objSelection.imprimeArray(listInteiros);
		
		//objMerge.ordenaMergeSort(listInteiros);
		//objMerge.imprimeArray(listInteiros);
		
		//objQuick.ordenaQuickSort(listInteiros, 0, listInteiros.size()-1);
		//objQuick.imprimeArray(listInteiros);
		
		//objHeap.ordenaHeapSort(listInteiros);
		//objHeap.imprimeArray(listInteiros);
		
		//objMeuSort.ordenaMeuSort(listInteiros);
		//objMeuSort.imprimeArray(listInteiros);
	}
	
	

}
