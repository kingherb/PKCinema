package hb.cinema.pk.event;

import java.util.Date;

public class EventDTO {
	private int num;
	private String fileName;
	private String fileNameTH;
	private String title;
	private String content;
	private Date startDate;
	private Date endDate;
	private int starNum;
	private int readNum;
	private int hit;
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getFileNameTH() {
		return fileNameTH;
	}
	
	public void setFileNameTH(String fileNameTH) {
		this.fileNameTH = fileNameTH;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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