package controller;
import hashing.HashEnderecamentoAbertoSondagemLinear;

import java.util.ArrayList;
import java.util.List;
import model.*;
import algoritOrdenacao.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ManipulacaoTXT arquivoTxt = new ManipulacaoTXT();
		List<Integer> listEntradas = new ArrayList<Integer>();
		arquivoTxt.ler(listEntradas);
		System.out.println("\n");
		System.out.println("---------------Objetos dentro da lista---------------");
		for(Integer item : listEntradas){
			System.out.println(item.intValue());
		}
		
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
		
		InsertionSort objInsertion = new InsertionSort();
		BubbleSort objBubble = new BubbleSort();
		SelectionSort objSelection = new SelectionSort();
		MergeSort objMerge = new MergeSort();
		QuickSort objQuick = new QuickSort();
		HeapSort objHeap = new HeapSort();
		MeuSort objMeuSort = new MeuSort();
		HashEnderecamentoAbertoSondagemLinear objHashLinear;
		
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
		
		List<Integer> listInteirosMovieId = new ArrayList<Integer>();
		listInteirosMovieId.add(100);
		listInteirosMovieId.add(152);
		listInteirosMovieId.add(11);
		listInteirosMovieId.add(126);
		listInteirosMovieId.add(94);
		listInteirosMovieId.add(343);
		listInteirosMovieId.add(740);
		listInteirosMovieId.add(251);
		listInteirosMovieId.add(445);
		listInteirosMovieId.add(895);
		
		//long tempoInicio = System.currentTimeMillis();
		//objInsertion.ordenaInsertSort(listInteiros);
		//long tempoFinal = System.currentTimeMillis()-tempoInicio;
		//arquivoTxt.gravar(1000, tempoFinal);
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
		
		/*
		objHashLinear = new HashEnderecamentoAbertoSondagemLinear(listInteiros);
		for(int i = 0; i < listInteiros.size(); i++){
			objHashLinear.insere(listInteiros.get(i), listInteirosMovieId.get(i));
		}
		objHashLinear.imprimirTabelaHash();
		*/
		
		
	}
	
	

}
