package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import model.Pais;
import model.Ratings;

public class LeituraCSV {
	
	public LeituraCSV() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void lerPais(int cont, List<Pais> listPais){
		String arquivoCSV = "/home/gabriel/workspace/estruturaDadosII_2019.1/dcc012/arqs/arquivo.csv";
	    BufferedReader br = null;
	    String linha = "";
	    String csvDivisor = ",";
	    boolean primeiraLinha = true;
	    
	    try {
	        br = new BufferedReader(new FileReader(arquivoCSV));
	        while ((linha = br.readLine()) != null && cont > 0) {
	        	if (primeiraLinha) {
	        	    primeiraLinha = false;
	        	    continue;
	        	  }
	        String[] campo = linha.split(csvDivisor);
	        listPais.add(new Pais(campo[campo.length-1], campo[campo.length-2]));    
	        cont--;
	        }
	    }catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }catch (IOException e) {
	        e.printStackTrace();
	    }finally {
	        if (br != null) {
	            try {
	                br.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}
	
	public void lerRatings(int cont, List<Ratings> listRatings){
		String arquivoCSV = "/home/gabriel/ratings.csv";
	    BufferedReader br = null;
	    String linha = "";
	    String csvDivisor = ",";
	    boolean primeiraLinha = true;
	    	try{
		        br = new BufferedReader(new FileReader(arquivoCSV));
		        while ((linha = br.readLine()) != null && cont > 0) {
		        	if (primeiraLinha) {
		        		primeiraLinha = false;
			        	continue;
		        	}
			        String[] campo = linha.split(csvDivisor);
			        int userId = Integer.parseInt(campo[campo.length-4]);
			    	int movieId = Integer.parseInt(campo[campo.length-3]);
			    	float rating = Float.parseFloat(campo[campo.length-2]);
			    	long timeStamp = Long.parseLong(campo[campo.length-1]);
			        listRatings.add(new Ratings(userId, movieId, rating, timeStamp));
			        cont--;
		        }    
		    }catch (FileNotFoundException e) {
		        e.printStackTrace();
		    }catch (IOException e) {
		        e.printStackTrace();
		    }finally {
		        if (br != null) {
		            try {
		                br.close();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
		    }
	    }
}
