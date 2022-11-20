package classes;
import java.util.Scanner;

public class Weapon {

        //поля класса
	private String weptitle; //наименование вооружения
	public int wepcost; //стоимость вооружения

 
	//конструктор со всеми параметрами
	public Weapon(String j, int h){
		weptitle = j;
		wepcost = h;
	}
	
	//конструктор с одним параметром
	public Weapon(int x){
		weptitle = Integer.toString(x);
		wepcost = x;
	}
	
	//конструктор без параметров
	public Weapon(){
		weptitle = "";
		wepcost = 0;
	}
	
	//метод ввода класса
	public void input(){
		Scanner inp = new Scanner(System.in);
		System.out.println("Введите тип вооружения: ");
		weptitle = inp.nextLine();
		System.out.println("Введите затраты на вооружение: ");
		wepcost = inp.nextInt();
	}
	
	//метод вывода класса
	public void output(){
		System.out.println("Вооружение: " + weptitle);
		System.out.println("Стоимость вооружения: " + wepcost);
	}
	
}