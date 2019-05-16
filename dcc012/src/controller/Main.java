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
		List<Integer> listUserIdAux = new ArrayList<Integer>();
		
		arquivoTxt.ler(listEntradas);
		System.out.println("---------------Objetos dentro da lista---------------");
		System.out.println("Valores de entrada");
		for(int i =0; i < listEntradas.size(); i++){
			System.out.println("listEntradas.get("+i+") = " + listEntradas.get(i));
		}
		
		
		LeituraCSV obj = new LeituraCSV();
		List<Ratings> listRatings = new ArrayList<Ratings>();
		obj.lerRatings(listEntradas.get(0), listRatings);
		
		System.out.println("---------------Objetos dentro da lista---------------");
		for(int i =0; i < listRatings.size(); i++){
			System.out.println("User ID "+ listRatings.get(i).getUserId() + " MovieID: " + listRatings.get(i).getMovieId());
			listUserIdAux.add(listRatings.get(i).getUserId());
		}
		
				
		
		InsertionSort objInsertion = new InsertionSort();
		BubbleSort objBubble = new BubbleSort();
		SelectionSort objSelection = new SelectionSort();
		MergeSort objMerge = new MergeSort();
		QuickSort objQuick = new QuickSort();
		HeapSort objHeap = new HeapSort();
		MeuSort objMeuSort = new MeuSort();
		HashEnderecamentoAbertoSondagemLinear objHashLinear;
		
		/*
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
		
		*/
		
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
		
		long tempoInicio = System.currentTimeMillis();
		objQuick.ordenaQuickSort(listUserIdAux, 0, listUserIdAux.size()-1);
		long tempoFinal = System.currentTimeMillis()-tempoInicio;
		System.out.println("Tempo de processamento: " + tempoFinal + " milissegundos.");
		arquivoTxt.gravar(1000, tempoFinal);
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
