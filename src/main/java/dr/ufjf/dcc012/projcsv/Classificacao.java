package dr.ufjf.dcc012.projcsv;

import com.opencsv.bean.CsvBindByName;

/**
 * classificacoes
 */
public class Classificacao {

    @CsvBindByName
    private Integer userId;
    @CsvBindByName
    private Integer movieId;
    @CsvBindByName
    private Float rating;
    @CsvBindByName
    private Double timeStamp;

    /**
     * @return the movieId
     */
    public Integer getMovieId() {
        return movieId;
    }

    /**
     * @return the timeStamp
     */
    public Double getTimeStamp() {
        return timeStamp;
    }

    /**
     * @return the userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @return the rating
     */
    public Float getRating() {
        return rating;
    }

    /**
     * @param movieId the movieId to set
     */
    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }
    
}