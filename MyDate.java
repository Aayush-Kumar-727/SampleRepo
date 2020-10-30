

public class MyDate{
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
