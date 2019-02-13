package pra_2019_02_13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
	 //基本的な使い方
		Fruit fruit_1 = new Banana();
		fruit_1.show();
		Fruit fruit_2 = new Peach();
		fruit_2.show();
		*/
		//応用
		
		Scanner sc = new Scanner(System.in);
		System.out.print("番号を入力してください (バナナは1番、ももは2番) : ");
		int index = sc.nextInt();
		if(index == 1)
		{
			Fruit fruit = new Banana();
			fruit.show();
		}
		else if(index == 2)
		{
			Fruit fruit = new Peach();
			fruit.show();
		}
		
		sc.close();
	}

}
