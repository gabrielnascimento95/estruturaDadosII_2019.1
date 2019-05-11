package hashing;

public class TermoDicionario {
	
	private Integer userID;
	private Integer movieID;
	
	public TermoDicionario(int n, int j){
		this.userID = n;
		this.movieID = j;
	}
	
	public Integer getMovieID() {
		return movieID;
	}
	
	public Integer getUserID() {
		return userID;
	}
	
	public void setMovieID(Integer movieID) {
		this.movieID = movieID;
	}
	
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	
}
