package map_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class SelfQuiz01 {
public static void main(String[] args) {
	// 50~100 사이 수 중에서 하나를 골라 입력했을 때
	//입력한 숫자보다 같거나 작은 숫자가 랜덤하게 10개가 출력 되도록 하고
	//출력된 랜덤 숫자 중 짝수와 홀수의 갯수를 구분하여 출력
	
	Scanner input = new Scanner(System.in);
	
	int num;
	HashSet<Integer> has = new HashSet<>();
	
	while(true) {
		System.out.println("50~100 사이 수 입력");
		num = input.nextInt();
		
	if(num>=50&&num<=100) {
		Random ran = new Random();
		for(;10>has.size();) {
			has.add(ran.nextInt(num)+1);
		}
			System.out.println("랜덤 10개 출력 : " + has ); break;
	}
	else {
   	 System.out.println("수 다시 입력");
    }
	}
	
	 int evenCount = 0;
     int oddCount = 0;

     Iterator<Integer> iterator = has.iterator();
     while (iterator.hasNext()) {
    	 
         int number = iterator.next();
         if (number % 2 == 0) {
             evenCount++;
         } else {
             oddCount++;
         }
     }
     System.out.println("짝수의 갯수 : " + evenCount);
     System.out.println("홀수의 갯수 : " + oddCount);
     
	}
	
}

