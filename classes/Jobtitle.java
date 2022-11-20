package classes;
import java.util.Scanner;

public class Jobtitle {

        //поля класса
	private String jtitle; //наименование должности
	public int monthlycost; //стоимость месяца работы

 
	//конструктор со всеми параметрами
	public Jobtitle(String j, int h){
		jtitle = j;
		monthlycost = h;
	}
	
	//конструктор с одним параметром
	public Jobtitle(int x){
		jtitle = Integer.toString(x);
		monthlycost = x;
	}
	
	//конструктор без параметров
	public Jobtitle(){
		jtitle = "";
		monthlycost = 0;
	}
	
	//метод ввода класса
	public void input(){
		Scanner inp = new Scanner(System.in);
		System.out.println("Введите должность: ");
		jtitle = inp.nextLine();
		System.out.println("Введите стоимость месяца работы: ");
		monthlycost = inp.nextInt();
	}
	
	//метод вывода класса
	public void output(){
		System.out.println("Должность: " + jtitle);
		System.out.println("Стоимость месяца работы: " + monthlycost);
	}
	
}