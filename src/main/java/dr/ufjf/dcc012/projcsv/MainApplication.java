package dr.ufjf.dcc012.projcsv;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

import com.opencsv.CSVIterator;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {
	private static final String SAMPLE_CSV_FILE_PATH = "/home/gabriel/ratings_small.csv";

	public static void main(String[] args) throws IOException {
		SpringApplication.run(MainApplication.class, args);
		try(
			Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
		){
			CsvToBean<Classificacao> csvToBean = new CsvToBeanBuilder(reader)
				.withType(Classificacao.class)
				.withIgnoreLeadingWhiteSpace(true)
				.build();
			
			Iterator<Classificacao> csvUserIterator = csvToBean.iterator();
			
			while (csvUserIterator.hasNext()) {
				Classificacao classificacao = csvUserIterator.next();
                System.out.println("userId : " + classificacao.getUserId());
                System.out.println("MovieId : " + classificacao.getMovieId());
                System.out.println("Rating : " + classificacao.getRating());
                System.out.println("Timestamp : " + classificacao.getTimeStamp());
                System.out.println("---------------------------");
			}
		} catch (Exception e) {
			e.toString();
		}	
	}
}
