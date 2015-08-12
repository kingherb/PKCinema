package hb.cinema.pk.room;

public class RoomDTO {
	private int num;
	private String address;
	private String city;
	private char type;
	private int cap;
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public char getType() {
		return type;
	}
	
	public void setType(char type) {
		this.type = type;
	}
	
	public int getCap() {
		return cap;
	}
	
	public void setCap(int cap) {
		this.cap = cap;
	}
}
