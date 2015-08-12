package hb.cinema.pk.board;

import java.util.Date;

public class BoardDTO {
	private int num;
	private int movieID;
	private int userID;
	private String content;
	private Date writeDate;
	private int starNum;
	private int readNum;
	private int hit;
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getMovieID() {
		return movieID;
	}
	
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}
	
	public int getUserID() {
		return userID;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getWriteDate() {
		return writeDate;
	}
	
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
	public int getStarNum() {
		return starNum;
	}
	
	public void setStarNum(int starNum) {
		this.starNum = starNum;
	}
	
	public int getReadNum() {
		return readNum;
	}
	
	public void setReadNum(int readNum) {
		this.readNum = readNum;
	}
	
	public int getHit() {
		return hit;
	}
	
	public void setHit(int hit) {
		this.hit = hit;
	}
}
