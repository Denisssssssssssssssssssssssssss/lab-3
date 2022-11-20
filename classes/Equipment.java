package classes;
import java.util.Scanner;

public class Equipment {

    //поля класса
	private String eqtitle; //наименование снаряжения
	public int eqcost; //стоимость снаряжения

 
	//конструктор со всеми параметрами
	public Equipment(String j, int h){
		this.eqtitle = j;
		eqcost = h;
	}
	
	//конструктор с одним параметром
	public Equipment(int x){
		eqtitle = Integer.toString(x);
		eqcost = x;
	}
	
	//конструктор без параметров
	public Equipment(){
		eqtitle = "";
		eqcost = 0;
	}
	
	//метод ввода класса
	public void input(){
		Scanner inp = new Scanner(System.in);
		System.out.println("Введите наименование снаряжения: ");
		eqtitle = inp.nextLine();
		System.out.println("Введите стоимость снаряжения: ");
		eqcost = inp.nextInt();
	}
	
	//метод вывода класса
	public void output(){
		System.out.println("Снаряжение: " + eqtitle);
		System.out.println("Стоимость снаряжения: " + eqcost);
	}
}