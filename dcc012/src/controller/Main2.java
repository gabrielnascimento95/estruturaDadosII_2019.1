package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Ratings;
import hashing.*;

public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("---------------Parte 2---------------\n");
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
			for(int j = 0; j < listRatings.size(); j++){
				listUserIdAux.add(listRatings.get(j).getUserId());
			}
			System.out.println("Parte 2 - Hashing\nOs algoritmos serão listados e a execução dar-se-á" +
					" pelo índice referente à estrutura de dados.\n" +
					" 0 - HashEnderecamentoAbertoSondagemLinear\n 1 - HashEnderecamentoAbertoSondagemQuadratica" +
					"\n 2 - HashEnderecamentoAbertoHashDuplo\n" +
					" 3 - HashEncadeamentoSeparado\n");
			System.out.print("\nDigite o índice referente à estrutura de dados: ");
			Scanner t = new Scanner(System.in);
			int aux = t.nextInt();
			switch(aux){
			case 0:
				HashEnderecamentoAbertoSondagemLinear objHashLinear = 
				new HashEnderecamentoAbertoSondagemLinear(listEntradas.get(0));
				long tempoInicio00 = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(0); i++){
					objHashLinear.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal00 = System.currentTimeMillis()-tempoInicio00;
				System.out.println("Tempo de processamento: " + tempoFinal00 + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(0), tempoFinal00);
				break;
			case 1:
				HashEnderecamentoAbertoSondagemQuadratica objHashQuadratico =
				new HashEnderecamentoAbertoSondagemQuadratica(listEntradas.get(0));
				long tempoInicio01 = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(0); i++){
					objHashQuadratico.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal01 = System.currentTimeMillis()-tempoInicio01;
				System.out.println("Tempo de processamento: " + tempoFinal01 + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(0), tempoFinal01);
				break;
			case 2:
				HashEnderecamentoAbertoHashDuplo objDuploHash = 
				new HashEnderecamentoAbertoHashDuplo(listEntradas.get(0));
				long tempoInicio = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(0); i++){
				objDuploHash.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal = System.currentTimeMillis()-tempoInicio;
				System.out.println("Tempo de processamento: " + tempoFinal + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(0), tempoFinal);
				break;
			case 3:
				HashEncadeamentoSeparado objSeparado = 
				new HashEncadeamentoSeparado(listEntradas.get(0));
				long tempoInicio03 = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(0); i++){
					objSeparado.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal03 = System.currentTimeMillis()-tempoInicio03;
				System.out.println("Tempo de processamento: " + tempoFinal03 + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(0), tempoFinal03);
				
				break;
			default:
				break;
			}
			break;
		case 1:
			obj.lerRatings(listEntradas.get(1), listRatings);
			for(int j = 0; j < listRatings.size(); j++){
				listUserIdAux.add(listRatings.get(j).getUserId());
			}
			System.out.println("Parte 2 - Hashing\nOs algoritmos serão listados e a execução dar-se-á" +
					" pelo índice referente à estrutura de dados.\n" +
					" 0 - HashEnderecamentoAbertoSondagemLinear\n 1 - HashEnderecamentoAbertoSondagemQuadratica" +
					"\n 2 - HashEnderecamentoAbertoHashDuplo\n" +
					" 3 - HashEncadeamentoSeparado\n");
			System.out.print("\nDigite o índice referente à estrutura de dados: ");
			Scanner k = new Scanner(System.in);
			int l = k.nextInt();
			switch(l){
			case 0:
				HashEnderecamentoAbertoSondagemLinear objHashLinear = 
				new HashEnderecamentoAbertoSondagemLinear(listEntradas.get(1));
				long tempoInicio00 = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(1); i++){
					objHashLinear.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal00 = System.currentTimeMillis()-tempoInicio00;
				System.out.println("Tempo de processamento: " + tempoFinal00 + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(1), tempoFinal00);
				break;
			case 1:
				HashEnderecamentoAbertoSondagemQuadratica objHashQuadratico =
				new HashEnderecamentoAbertoSondagemQuadratica(listEntradas.get(1));
				long tempoInicio01 = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(1); i++){
					objHashQuadratico.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal01 = System.currentTimeMillis()-tempoInicio01;
				System.out.println("Tempo de processamento: " + tempoFinal01 + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(1), tempoFinal01);
				break;
			case 2:
				HashEnderecamentoAbertoHashDuplo objDuploHash = 
				new HashEnderecamentoAbertoHashDuplo(listEntradas.get(1));
				long tempoInicio = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(1); i++){
				objDuploHash.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal = System.currentTimeMillis()-tempoInicio;
				System.out.println("Tempo de processamento: " + tempoFinal + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(1), tempoFinal);
				break;
			case 3:
				HashEncadeamentoSeparado objSeparado = 
				new HashEncadeamentoSeparado(listEntradas.get(1));
				long tempoInicio03 = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(1); i++){
					objSeparado.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal03 = System.currentTimeMillis()-tempoInicio03;
				System.out.println("Tempo de processamento: " + tempoFinal03 + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(1), tempoFinal03);
				break;
			default:
				break;
			}
			break;
		case 2:
			obj.lerRatings(listEntradas.get(2), listRatings);
			for(int j = 0; j < listRatings.size(); j++){
				listUserIdAux.add(listRatings.get(j).getUserId());
			}
			System.out.println("Parte 2 - Hashing\nOs algoritmos serão listados e a execução dar-se-á" +
					" pelo índice referente à estrutura de dados.\n" +
					" 0 - HashEnderecamentoAbertoSondagemLinear\n 1 - HashEnderecamentoAbertoSondagemQuadratica" +
					"\n 2 - HashEnderecamentoAbertoHashDuplo\n" +
					" 3 - HashEncadeamentoSeparado\n");
			System.out.print("\nDigite o índice referente à estrutura de dados: ");
			Scanner kk = new Scanner(System.in);
			int ll = kk.nextInt();
			switch(ll){
			case 0:
				HashEnderecamentoAbertoSondagemLinear objHashLinear = 
				new HashEnderecamentoAbertoSondagemLinear(listEntradas.get(2));
				long tempoInicio00 = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(2); i++){
					objHashLinear.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal00 = System.currentTimeMillis()-tempoInicio00;
				System.out.println("Tempo de processamento: " + tempoFinal00 + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(2), tempoFinal00);
				break;
			case 1:
				HashEnderecamentoAbertoSondagemQuadratica objHashQuadratico =
				new HashEnderecamentoAbertoSondagemQuadratica(listEntradas.get(2));
				long tempoInicio01 = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(2); i++){
					objHashQuadratico.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal01 = System.currentTimeMillis()-tempoInicio01;
				System.out.println("Tempo de processamento: " + tempoFinal01 + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(2), tempoFinal01);
				break;
			case 2:
				HashEnderecamentoAbertoHashDuplo objDuploHash = 
				new HashEnderecamentoAbertoHashDuplo(listEntradas.get(2));
				long tempoInicio = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(1); i++){
				objDuploHash.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal = System.currentTimeMillis()-tempoInicio;
				System.out.println("Tempo de processamento: " + tempoFinal + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(2), tempoFinal);
				break;
			case 3:
				HashEncadeamentoSeparado objSeparado = 
				new HashEncadeamentoSeparado(listEntradas.get(2));
				long tempoInicio03 = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(2); i++){
					objSeparado.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal03 = System.currentTimeMillis()-tempoInicio03;
				System.out.println("Tempo de processamento: " + tempoFinal03 + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(2), tempoFinal03);
				break;
			default:
				break;
			}
			break;
		case 3:
			obj.lerRatings(listEntradas.get(3), listRatings);
			System.out.print("\nDigite o índice referente à estrutura de dados: ");
			for(int j = 0; j < listRatings.size(); j++){
				listUserIdAux.add(listRatings.get(j).getUserId());
			}
			Scanner kkk = new Scanner(System.in);
			int lll = kkk.nextInt();
			switch(lll){
			case 0:
				HashEnderecamentoAbertoSondagemLinear objHashLinear = 
				new HashEnderecamentoAbertoSondagemLinear(listEntradas.get(3));
				long tempoInicio00 = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(3); i++){
					objHashLinear.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal00 = System.currentTimeMillis()-tempoInicio00;
				System.out.println("Tempo de processamento: " + tempoFinal00 + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(3), tempoFinal00);
				break;
			case 1:
				HashEnderecamentoAbertoSondagemQuadratica objHashQuadratico =
				new HashEnderecamentoAbertoSondagemQuadratica(listEntradas.get(3));
				long tempoInicio01 = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(3); i++){
					objHashQuadratico.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal01 = System.currentTimeMillis()-tempoInicio01;
				System.out.println("Tempo de processamento: " + tempoFinal01 + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(3), tempoFinal01);
				break;
			case 2:
				HashEnderecamentoAbertoHashDuplo objDuploHash = 
				new HashEnderecamentoAbertoHashDuplo(listEntradas.get(3));
				long tempoInicio = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(3); i++){
				objDuploHash.insere(listRatings.get(3).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal = System.currentTimeMillis()-tempoInicio;
				System.out.println("Tempo de processamento: " + tempoFinal + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(3), tempoFinal);
				break;
			case 3:
				HashEncadeamentoSeparado objSeparado = 
				new HashEncadeamentoSeparado(listEntradas.get(3));
				long tempoInicio03 = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(3); i++){
					objSeparado.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal03 = System.currentTimeMillis()-tempoInicio03;
				System.out.println("Tempo de processamento: " + tempoFinal03 + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(3), tempoFinal03);
				break;
			default:
				break;
			}
			break;
		case 4:
			obj.lerRatings(listEntradas.get(4), listRatings);
			System.out.print("\nDigite o índice referente à estrutura de dados: ");
			for(int j = 0; j < listRatings.size(); j++){
				listUserIdAux.add(listRatings.get(j).getUserId());
			}
			Scanner a = new Scanner(System.in);
			int b = a.nextInt();
			switch(b){
			case 0:
				HashEnderecamentoAbertoSondagemLinear objHashLinear = 
				new HashEnderecamentoAbertoSondagemLinear(listEntradas.get(4));
				long tempoInicio00 = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(4); i++){
					objHashLinear.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal00 = System.currentTimeMillis()-tempoInicio00;
				System.out.println("Tempo de processamento: " + tempoFinal00 + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(4), tempoFinal00);
				break;
			case 1:
				HashEnderecamentoAbertoSondagemQuadratica objHashQuadratico =
				new HashEnderecamentoAbertoSondagemQuadratica(listEntradas.get(4));
				long tempoInicio01 = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(4); i++){
					objHashQuadratico.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal01 = System.currentTimeMillis()-tempoInicio01;
				System.out.println("Tempo de processamento: " + tempoFinal01 + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(4), tempoFinal01);
				break;
			case 2:
				HashEnderecamentoAbertoHashDuplo objDuploHash = 
				new HashEnderecamentoAbertoHashDuplo(listEntradas.get(4));
				long tempoInicio = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(4); i++){
				objDuploHash.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal = System.currentTimeMillis()-tempoInicio;
				System.out.println("Tempo de processamento: " + tempoFinal + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(4), tempoFinal);
				break;
			case 3:
				HashEncadeamentoSeparado objSeparado = 
				new HashEncadeamentoSeparado(listEntradas.get(4));
				long tempoInicio03 = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(4); i++){
					objSeparado.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal03 = System.currentTimeMillis()-tempoInicio03;
				System.out.println("Tempo de processamento: " + tempoFinal03 + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(4), tempoFinal03);
				break;
			default:
				break;
			}
			break;
		case 5:
			obj.lerRatings(listEntradas.get(5), listRatings);
			System.out.print("\nDigite o índice referente à estrutura de dados: ");
			for(int j = 0; j < listRatings.size(); j++){
				listUserIdAux.add(listRatings.get(j).getUserId());
			}
			Scanner c = new Scanner(System.in);
			int d = c.nextInt();
			switch(d){
			case 0:
				HashEnderecamentoAbertoSondagemLinear objHashLinear = 
				new HashEnderecamentoAbertoSondagemLinear(listEntradas.get(5));
				long tempoInicio00 = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(5); i++){
					objHashLinear.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal00 = System.currentTimeMillis()-tempoInicio00;
				System.out.println("Tempo de processamento: " + tempoFinal00 + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(5), tempoFinal00);
				break;
			case 1:
				HashEnderecamentoAbertoSondagemQuadratica objHashQuadratico =
				new HashEnderecamentoAbertoSondagemQuadratica(listEntradas.get(5));
				long tempoInicio01 = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(5); i++){
					objHashQuadratico.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal01 = System.currentTimeMillis()-tempoInicio01;
				System.out.println("Tempo de processamento: " + tempoFinal01 + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(5), tempoFinal01);
				break;
			case 2:
				HashEnderecamentoAbertoHashDuplo objDuploHash = 
				new HashEnderecamentoAbertoHashDuplo(listEntradas.get(5));
				long tempoInicio = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(5); i++){
				objDuploHash.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal = System.currentTimeMillis()-tempoInicio;
				System.out.println("Tempo de processamento: " + tempoFinal + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(5), tempoFinal);
				break;
			case 3:
				HashEncadeamentoSeparado objSeparado = 
				new HashEncadeamentoSeparado(listEntradas.get(5));
				long tempoInicio03 = System.currentTimeMillis();
				for(int i = 0; i < listEntradas.get(5); i++){
					objSeparado.insere(listRatings.get(i).getUserId(), listRatings.get(i).getMovieId());
				}
				long tempoFinal03 = System.currentTimeMillis()-tempoInicio03;
				System.out.println("Tempo de processamento: " + tempoFinal03 + " milissegundos.");
				arquivoTxt.gravar(listEntradas.get(5), tempoFinal03);
				break;
			default:
				break;
			}
			break;	
		default:
			break;
		}
		System.out.println("---------------Fim da parte 2---------------\n");
	}
}
