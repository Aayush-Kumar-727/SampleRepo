import java.util.Scanner;

public class MyDate{
	static Scanner sc = new Scanner(System.in);
	int day,month,year;
	MyDate(){
		day = 20;
		month = 20;
		year = 2020;
	}
	MyDate(int d,int m,int y){
		day = d;
		month = m;
		year = y;
	}
	int getDay(){
		return day;
	}
	void setDay(int d){
		day = d;
	}
	int getMonth(){
		return month;
	}
	void setMonth(int m){
		month = m;
	}
	int getYear(){
		return year;
	}
	void setYear(int y){
		year = y;
	}
	void set(int d,int m,int y){
		day = d;
		month = m;
		year = y;
	}
	void display(){
		System.out.println(day+"/"+month+"/"+year);
	}
	public static void main(String args[]){
		MyDate d = new MyDate(21,9,2020);
		d.display();
		MyDate d1 = new MyDate();
		d1.display();
	}
}