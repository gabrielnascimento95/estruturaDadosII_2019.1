package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import model.Pais;

public class LeituraCSV {
	
	public LeituraCSV() {
		// TODO Auto-generated constructor stub
	}
	
	public void ler(List<Pais> listPais){
		String arquivoCSV = "/home/gabriel/workspace/estruturaDadosII_2019.1/dcc012/arqs/arquivo.csv";
	    BufferedReader br = null;
	    String linha = "";
	    String csvDivisor = ",";
	    boolean primeiraLinha = true;
	    
	  
	    try {
	        br = new BufferedReader(new FileReader(arquivoCSV));
	        while ((linha = br.readLine()) != null) {
	        	if (primeiraLinha) {
	        	    primeiraLinha = false;
	        	    continue;
	        	  }
	        String[] campo = linha.split(csvDivisor);
	        listPais.add(new Pais(campo[campo.length-1], campo[campo.length-2]));
	        System.out.println("País [code= " + campo[campo.length-2] 
	        									+ " , name=" + campo[campo.length-1] + "]");

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