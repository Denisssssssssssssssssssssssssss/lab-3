package classes;
import java.util.Scanner;
import java.util.ArrayList;

public class Employee {

    //поля класса
	private int  id; //индивидуальный номер
	private Transport tr; //транспорт
	private Equipment equ; //оборудование
	private Jobtitle jt; //должность
    private Weapon wp; //должность

 
	//конструктор класса со всеми параметрами
	public Employee(int i, Equipment e, Transport t, Jobtitle j, Weapon w){
		id = i;
		equ = e;
		tr = t;
		jt = j;
        wp = w;  
	}
	
	//конструктор класса с одним параметром
	public Employee(int x){
		id = x;
		equ = new Equipment(x);
		tr = new Transport(x);
		jt = new Jobtitle(x);
        wp = new Weapon(x);
	}
	
	//конструктор класса без параметров
	public Employee(){
		id = 0;
		equ = new Equipment();
		tr = new Transport();
		jt = new Jobtitle();
        wp = new Weapon();
	}
	
	//метод вывода
	public void output(){
		System.out.println("ID: " + id);
		equ.output();
		tr.output();
		jt.output();
        wp.output();
	}
	
	//метод ввода
	public void input(){
		Scanner inp = new Scanner(System.in);
		System.out.println("Введите ID: ");
		id = inp.nextInt();
		equ.input();
		tr.input();
		jt.input();
        wp.input();
	}
	
	//метод подсчета затрат
	public int empcost(){
		int cost = 0;
		cost += jt.monthlycost;
		cost += tr.trcost;
        cost += equ.eqcost;
        cost += wp.wepcost;
		return cost;
	}
	
}