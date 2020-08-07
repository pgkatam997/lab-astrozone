package model;
public class User{
	public String name;
	public int d;
	public int m;
	
	public User(String name,String date,String month,String gender) {
		this.name=name;
		d=Integer.parseInt(date);
		m=Integer.parseInt(month);
	}
}
//Type your code here