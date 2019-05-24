package controller;
import hashing.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		LeituraCSV obj = new LeituraCSV();
		List<Ratings> listRatings = new ArrayList<Ratings>();
		arquivoTxt.ler(listEntradas);
		
		System.out.println("---------------Objetos dentro da lista---------------\n");
		for(int i =0; i < listEntradas.size(); i++){
			System.out.println("Indice["+i+"] = " + listEntradas.get(i));
		}
		
		System.out.print("\nDigite o índice referente a entrada dos dados: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		switch (n) {
		case 0:
			obj.lerRatings(listEntradas.get(0), listRatings);
			System.out.println("Parte 1 - Ordenação\nOs algoritmos serão listados e a execução dar-se-á" +
					" pelo índice referente à estrutura de dados.\n" +
					" 0 - InsertionSort\n 1 - MergeSort\n 2 - HeapSort\n" +
					" 3 - MeuSort\n 4 - QuickSort (Visto em Aula)\n" +
					" 5 - QuickSortInsercao\n 6 - QuickSortMediana\n");
			for(int j = 0; j < listRatings.size(); j++){
				listUserIdAux.add(listRatings.get(j).getUserId());
			}
			System.out.print("\nDigite o índice referente à estrutura de dados: ");
			Scanner t = new Scanner(System.in);
			int aux = t.nextInt();
			switch(aux){
			case 0:
				InsertionSort objInsertion = new InsertionSort();
				long tempoInicioInsertion = System.currentTimeMillis();
				objInsertion.ordenaInsertSort(listUserIdAux);
				long tempoFinalInsertion = System.currentTimeMillis()-tempoInicioInsertion;
				arquivoTxt.gravar(listEntradas.get(0), tempoFinalInsertion);
				System.out.println("Tempo de processamento: " + tempoFinalInsertion + " milissegundos.");
				break;
			case 1:
				MergeSort objMerge = new MergeSort();
				long tempoInicioMerge = System.currentTimeMillis();
				objMerge.ordenaMergeSort(listUserIdAux);
				long tempoFinalMerge = System.currentTimeMillis()-tempoInicioMerge;
				arquivoTxt.gravar(listEntradas.get(0), tempoFinalMerge);
				System.out.println("Tempo de processamento: " + tempoFinalMerge + " milissegundos.");
				break;
			case 2:
				HeapSort objHeap = new HeapSort();
				long tempoInicioHeap = System.currentTimeMillis();
				objHeap.ordenaHeapSort(listUserIdAux);
				long tempoFinalHeap = System.currentTimeMillis()-tempoInicioHeap;
				System.out.println("Tempo de processamento: " + tempoFinalHeap + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(0), tempoFinalHeap);	
				break;
			case 3:
				MeuSort objMeuSort = new MeuSort();
				long tempoInicioMeu = System.currentTimeMillis();
				objMeuSort.ordenaMeuSort(listUserIdAux);
				long tempoFinalMeu = System.currentTimeMillis()-tempoInicioMeu;
				System.out.println("Tempo de processamento: " + tempoFinalMeu + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(0), tempoFinalMeu);
				break;
			case 4:
				QuickSort objQuick = new QuickSort();
				long tempoInicioQuick = System.currentTimeMillis();
				objQuick.ordenaQuickSort(listUserIdAux, 0, listUserIdAux.size()-1);
				long tempoFinalQuick = System.currentTimeMillis()-tempoInicioQuick;
				System.out.println("Tempo de processamento: " + tempoFinalQuick + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(0), tempoFinalQuick);
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				break;
			}
			break;
		case 1:
			obj.lerRatings(listEntradas.get(1), listRatings);
			System.out.println("Parte 1 - Ordenação\nOs algoritmos serão listados e a execução dar-se-á" +
					" pelo índice referente à estrutura de dados.\n" +
					" 0 - InsertionSort\n 1 - MergeSort\n 2 - HeapSort\n" +
					" 3 - MeuSort\n 4 - QuickSort (Visto em Aula)\n" +
					" 5 - QuickSortInsercao\n 6 - QuickSortMediana\n");
			for(int j = 0; j < listRatings.size(); j++){
				listUserIdAux.add(listRatings.get(j).getUserId());
			}
			System.out.print("\nDigite o índice referente à estrutura de dados: ");
			Scanner k = new Scanner(System.in);
			int l = k.nextInt();
			switch(l){
			case 0:
				InsertionSort objInsertion = new InsertionSort();
				long tempoInicioInsertion = System.currentTimeMillis();
				objInsertion.ordenaInsertSort(listUserIdAux);
				long tempoFinalInsertion = System.currentTimeMillis()-tempoInicioInsertion;
				arquivoTxt.gravar(listEntradas.get(1), tempoFinalInsertion);
				System.out.println("Tempo de processamento: " + tempoFinalInsertion + " milissegundos.");
				break;
			case 1:
				MergeSort objMerge = new MergeSort();
				long tempoInicioMerge = System.currentTimeMillis();
				objMerge.ordenaMergeSort(listUserIdAux);
				long tempoFinalMerge = System.currentTimeMillis()-tempoInicioMerge;
				arquivoTxt.gravar(listEntradas.get(1), tempoFinalMerge);
				System.out.println("Tempo de processamento: " + tempoFinalMerge + " milissegundos.");
				break;
			case 2:
				HeapSort objHeap = new HeapSort();
				long tempoInicioHeap = System.currentTimeMillis();
				objHeap.ordenaHeapSort(listUserIdAux);
				long tempoFinalHeap = System.currentTimeMillis()-tempoInicioHeap;
				System.out.println("Tempo de processamento: " + tempoFinalHeap + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(1), tempoFinalHeap);	
				break;
			case 3:
				MeuSort objMeuSort = new MeuSort();
				long tempoInicioMeu = System.currentTimeMillis();
				objMeuSort.ordenaMeuSort(listUserIdAux);
				long tempoFinalMeu = System.currentTimeMillis()-tempoInicioMeu;
				System.out.println("Tempo de processamento: " + tempoFinalMeu + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(1), tempoFinalMeu);
				break;
			case 4:
				QuickSort objQuick = new QuickSort();
				long tempoInicioQuick = System.currentTimeMillis();
				objQuick.ordenaQuickSort(listUserIdAux, 0, listUserIdAux.size()-1);
				long tempoFinalQuick = System.currentTimeMillis()-tempoInicioQuick;
				System.out.println("Tempo de processamento: " + tempoFinalQuick + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(1), tempoFinalQuick);
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				break;
			}
			break;
		case 2:
			obj.lerRatings(listEntradas.get(2), listRatings);
			System.out.println("Parte 1 - Ordenação\nOs algoritmos serão listados e a execução dar-se-á" +
					" pelo índice referente à estrutura de dados.\n" +
					" 0 - InsertionSort\n 1 - MergeSort\n 2 - HeapSort\n" +
					" 3 - MeuSort\n 4 - QuickSort (Visto em Aula)\n" +
					" 5 - QuickSortInsercao\n 6 - QuickSortMediana\n");
			for(int j = 0; j < listRatings.size(); j++){
				listUserIdAux.add(listRatings.get(j).getUserId());
			}
			System.out.print("\nDigite o índice referente à estrutura de dados: ");
			Scanner kk = new Scanner(System.in);
			int ll = kk.nextInt();
			switch(ll){
			case 0:
				InsertionSort objInsertion = new InsertionSort();
				long tempoInicioInsertion = System.currentTimeMillis();
				objInsertion.ordenaInsertSort(listUserIdAux);
				long tempoFinalInsertion = System.currentTimeMillis()-tempoInicioInsertion;
				arquivoTxt.gravar(listEntradas.get(2), tempoFinalInsertion);
				System.out.println("Tempo de processamento: " + tempoFinalInsertion + " milissegundos.");
				break;
			case 1:
				MergeSort objMerge = new MergeSort();
				long tempoInicioMerge = System.currentTimeMillis();
				objMerge.ordenaMergeSort(listUserIdAux);
				long tempoFinalMerge = System.currentTimeMillis()-tempoInicioMerge;
				arquivoTxt.gravar(listEntradas.get(2), tempoFinalMerge);
				System.out.println("Tempo de processamento: " + tempoFinalMerge + " milissegundos.");
				break;
			case 2:
				HeapSort objHeap = new HeapSort();
				long tempoInicioHeap = System.currentTimeMillis();
				objHeap.ordenaHeapSort(listUserIdAux);
				long tempoFinalHeap = System.currentTimeMillis()-tempoInicioHeap;
				System.out.println("Tempo de processamento: " + tempoFinalHeap + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(2), tempoFinalHeap);	
				break;
			case 3:
				MeuSort objMeuSort = new MeuSort();
				long tempoInicioMeu = System.currentTimeMillis();
				objMeuSort.ordenaMeuSort(listUserIdAux);
				long tempoFinalMeu = System.currentTimeMillis()-tempoInicioMeu;
				System.out.println("Tempo de processamento: " + tempoFinalMeu + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(2), tempoFinalMeu);
				break;
			case 4:
				QuickSort objQuick = new QuickSort();
				long tempoInicioQuick = System.currentTimeMillis();
				objQuick.ordenaQuickSort(listUserIdAux, 0, listUserIdAux.size()-1);
				long tempoFinalQuick = System.currentTimeMillis()-tempoInicioQuick;
				System.out.println("Tempo de processamento: " + tempoFinalQuick + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(2), tempoFinalQuick);
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				break;
			}
			break;
		case 3:
			obj.lerRatings(listEntradas.get(3), listRatings);
			System.out.println("Parte 1 - Ordenação\nOs algoritmos serão listados e a execução dar-se-á" +
					" pelo índice referente à estrutura de dados.\n" +
					" 0 - InsertionSort\n 1 - MergeSort\n 2 - HeapSort\n" +
					" 3 - MeuSort\n 4 - QuickSort (Visto em Aula)\n" +
					" 5 - QuickSortInsercao\n 6 - QuickSortMediana\n");
			for(int j = 0; j < listRatings.size(); j++){
				listUserIdAux.add(listRatings.get(j).getUserId());
			}
			System.out.print("\nDigite o índice referente à estrutura de dados: ");
			Scanner kkk = new Scanner(System.in);
			int lll = kkk.nextInt();
			switch(lll){
			case 0:
				InsertionSort objInsertion = new InsertionSort();
				long tempoInicioInsertion = System.currentTimeMillis();
				objInsertion.ordenaInsertSort(listUserIdAux);
				long tempoFinalInsertion = System.currentTimeMillis()-tempoInicioInsertion;
				arquivoTxt.gravar(listEntradas.get(3), tempoFinalInsertion);
				System.out.println("Tempo de processamento: " + tempoFinalInsertion + " milissegundos.");
				break;
			case 1:
				MergeSort objMerge = new MergeSort();
				long tempoInicioMerge = System.currentTimeMillis();
				objMerge.ordenaMergeSort(listUserIdAux);
				long tempoFinalMerge = System.currentTimeMillis()-tempoInicioMerge;
				arquivoTxt.gravar(listEntradas.get(3), tempoFinalMerge);
				System.out.println("Tempo de processamento: " + tempoFinalMerge + " milissegundos.");
				break;
			case 2:
				HeapSort objHeap = new HeapSort();
				long tempoInicioHeap = System.currentTimeMillis();
				objHeap.ordenaHeapSort(listUserIdAux);
				long tempoFinalHeap = System.currentTimeMillis()-tempoInicioHeap;
				System.out.println("Tempo de processamento: " + tempoFinalHeap + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(3), tempoFinalHeap);	
				break;
			case 3:
				MeuSort objMeuSort = new MeuSort();
				long tempoInicioMeu = System.currentTimeMillis();
				objMeuSort.ordenaMeuSort(listUserIdAux);
				long tempoFinalMeu = System.currentTimeMillis()-tempoInicioMeu;
				System.out.println("Tempo de processamento: " + tempoFinalMeu + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(3), tempoFinalMeu);
				break;
			case 4:
				QuickSort objQuick = new QuickSort();
				long tempoInicioQuick = System.currentTimeMillis();
				objQuick.ordenaQuickSort(listUserIdAux, 0, listUserIdAux.size()-1);
				long tempoFinalQuick = System.currentTimeMillis()-tempoInicioQuick;
				System.out.println("Tempo de processamento: " + tempoFinalQuick + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(3), tempoFinalQuick);
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				break;
			}
			break;
		case 4:
			obj.lerRatings(listEntradas.get(4), listRatings);
			System.out.println("Parte 1 - Ordenação\nOs algoritmos serão listados e a execução dar-se-á" +
					" pelo índice referente à estrutura de dados.\n" +
					" 0 - InsertionSort\n 1 - MergeSort\n 2 - HeapSort\n" +
					" 3 - MeuSort\n 4 - QuickSort (Visto em Aula)\n" +
					" 5 - QuickSortInsercao\n 6 - QuickSortMediana\n");
			for(int j = 0; j < listRatings.size(); j++){
				listUserIdAux.add(listRatings.get(j).getUserId());
			}
			System.out.print("\nDigite o índice referente à estrutura de dados: ");
			Scanner a = new Scanner(System.in);
			int b = a.nextInt();
			switch(b){
			case 0:
				InsertionSort objInsertion = new InsertionSort();
				long tempoInicioInsertion = System.currentTimeMillis();
				objInsertion.ordenaInsertSort(listUserIdAux);
				long tempoFinalInsertion = System.currentTimeMillis()-tempoInicioInsertion;
				arquivoTxt.gravar(listEntradas.get(4), tempoFinalInsertion);
				System.out.println("Tempo de processamento: " + tempoFinalInsertion + " milissegundos.");
				break;
			case 1:
				MergeSort objMerge = new MergeSort();
				long tempoInicioMerge = System.currentTimeMillis();
				objMerge.ordenaMergeSort(listUserIdAux);
				long tempoFinalMerge = System.currentTimeMillis()-tempoInicioMerge;
				arquivoTxt.gravar(listEntradas.get(4), tempoFinalMerge);
				System.out.println("Tempo de processamento: " + tempoFinalMerge + " milissegundos.");
				break;
			case 2:
				HeapSort objHeap = new HeapSort();
				long tempoInicioHeap = System.currentTimeMillis();
				objHeap.ordenaHeapSort(listUserIdAux);
				long tempoFinalHeap = System.currentTimeMillis()-tempoInicioHeap;
				System.out.println("Tempo de processamento: " + tempoFinalHeap + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(4), tempoFinalHeap);	
				break;
			case 3:
				MeuSort objMeuSort = new MeuSort();
				long tempoInicioMeu = System.currentTimeMillis();
				objMeuSort.ordenaMeuSort(listUserIdAux);
				long tempoFinalMeu = System.currentTimeMillis()-tempoInicioMeu;
				System.out.println("Tempo de processamento: " + tempoFinalMeu + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(4), tempoFinalMeu);
				break;
			case 4:
				QuickSort objQuick = new QuickSort();
				long tempoInicioQuick = System.currentTimeMillis();
				objQuick.ordenaQuickSort(listUserIdAux, 0, listUserIdAux.size()-1);
				long tempoFinalQuick = System.currentTimeMillis()-tempoInicioQuick;
				System.out.println("Tempo de processamento: " + tempoFinalQuick + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(4), tempoFinalQuick);
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				break;
			}
			break;
		case 5:
			obj.lerRatings(listEntradas.get(5), listRatings);
			System.out.println("Parte 1 - Ordenação\nOs algoritmos serão listados e a execução dar-se-á" +
					" pelo índice referente à estrutura de dados.\n" +
					" 0 - InsertionSort\n 1 - MergeSort\n 2 - HeapSort\n" +
					" 3 - MeuSort\n 4 - QuickSort (Visto em Aula)\n" +
					" 5 - QuickSortInsercao\n 6 - QuickSortMediana\n");
			System.out.print("\nDigite o índice referente à estrutura de dados: ");
			for(int j = 0; j < listRatings.size(); j++){
				listUserIdAux.add(listRatings.get(j).getUserId());
			}
			Scanner c = new Scanner(System.in);
			int d = c.nextInt();
			switch(d){
			case 0:
				InsertionSort objInsertion = new InsertionSort();
				long tempoInicioInsertion = System.currentTimeMillis();
				objInsertion.ordenaInsertSort(listUserIdAux);
				long tempoFinalInsertion = System.currentTimeMillis()-tempoInicioInsertion;
				arquivoTxt.gravar(listEntradas.get(5), tempoFinalInsertion);
				System.out.println("Tempo de processamento: " + tempoFinalInsertion + " milissegundos.");
				break;
			case 1:
				MergeSort objMerge = new MergeSort();
				long tempoInicioMerge = System.currentTimeMillis();
				objMerge.ordenaMergeSort(listUserIdAux);
				long tempoFinalMerge = System.currentTimeMillis()-tempoInicioMerge;
				arquivoTxt.gravar(listEntradas.get(5), tempoFinalMerge);
				System.out.println("Tempo de processamento: " + tempoFinalMerge + " milissegundos.");
				break;
			case 2:
				HeapSort objHeap = new HeapSort();
				long tempoInicioHeap = System.currentTimeMillis();
				objHeap.ordenaHeapSort(listUserIdAux);
				long tempoFinalHeap = System.currentTimeMillis()-tempoInicioHeap;
				System.out.println("Tempo de processamento: " + tempoFinalHeap + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(5), tempoFinalHeap);	
				break;
			case 3:
				MeuSort objMeuSort = new MeuSort();
				long tempoInicioMeu = System.currentTimeMillis();
				objMeuSort.ordenaMeuSort(listUserIdAux);
				long tempoFinalMeu = System.currentTimeMillis()-tempoInicioMeu;
				System.out.println("Tempo de processamento: " + tempoFinalMeu + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(5), tempoFinalMeu);
				break;
			case 4:
				QuickSort objQuick = new QuickSort();
				long tempoInicioQuick = System.currentTimeMillis();
				objQuick.ordenaQuickSort(listUserIdAux, 0, listUserIdAux.size()-1);
				long tempoFinalQuick = System.currentTimeMillis()-tempoInicioQuick;
				System.out.println("Tempo de processamento: " + tempoFinalQuick + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(5), tempoFinalQuick);
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				break;
			}
			break;	
		default:
			break;
		}
		System.out.println("---------------Fim da parte 1---------------\n");
		
		}	
}
