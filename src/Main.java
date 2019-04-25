import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import Model.*;


public class Main {

	public static void main(String[] args) {
		Main obj = new Main();
		List<Pais> listPais = new ArrayList<Pais>();
		obj.leituraCSV(listPais);
		
		System.out.println("\n");
		System.out.println("---------------Objetos dentro da lista---------------");
		for(Pais item : listPais){
			System.out.println("Código "+ item.getCod() + " Nome: " + item.getNome());
		}
	}
	
	public void leituraCSV(List listPais){
		String arquivoCSV = "/home/gabriel/workspace/leituraArqCSV/arqs/arquivo.csv";
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