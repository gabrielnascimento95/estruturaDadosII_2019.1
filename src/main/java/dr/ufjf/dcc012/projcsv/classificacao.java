package dr.ufjf.dcc012.projcsv;

/**
 * classificacoes
 */
public class classificacoes {

    private Integer userId;
    private Integer movieId;
    private Float rating;
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