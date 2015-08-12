package hb.cinema.pk.event.reply;

import java.util.Date;

public class EventRDTO {
	private int num;
	private int eventNum;
	private int userNum;
	private String userName;
	private int type;
	private String content;
	private Date writeDate;
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getEventNum() {
		return eventNum;
	}
	
	public void setEventNum(int eventNum) {
		this.eventNum = eventNum;
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
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
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