package hb.cinema.pk.media.reply;

import java.util.Date;

public class MediaRDTO {
	private int num;
	private int mediaNum;
	private int userNum;
	private String userName;
	private String type;
	private String content;
	private Date writeDate;
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getMediaNum() {
		return mediaNum;
	}
	
	public void setMediaNum(int mediaNum) {
		this.mediaNum = mediaNum;
	}
	
	public int getUserNum() {
		return userNum;
	}
	
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
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
}