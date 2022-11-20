package classes;
import java.util.Scanner;

public class Transport {

        //поля класса
	private String trtitle; //наименование должности
	public int trcost; //стоимость месяца работы

 
	//конструктор со всеми параметрами
	public Transport(String j, int h){
		trtitle = j;
		trcost = h;
	}
	
	//конструктор с одним параметром
	public Transport(int x){
		trtitle = Integer.toString(x);
		trcost = x;
	}
	
	//конструктор без параметров
	public Transport(){
		trtitle = "";
		trcost = 0;
	}
	
	//метод ввода класса
	public void input(){
		Scanner inp = new Scanner(System.in);
		System.out.println("Введите тип транспорта: ");
		trtitle = inp.nextLine();
		System.out.println("Введите затраты на траспорт: ");
		trcost = inp.nextInt();
	}
	
	//метод вывода класса
	public void output(){
		System.out.println("Транспорт: " + trtitle);
		System.out.println("Стоимость транспортировки: " + trcost);
	}
	
}