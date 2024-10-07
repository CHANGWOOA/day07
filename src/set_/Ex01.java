package set_;


import java.util.HashSet;
import java.util.Random;
import java.util.ArrayList;

public class Ex01 {
public static void main(String[] args) {
	HashSet<String> set = new HashSet<String>();
	ArrayList<String> arr = new ArrayList<String>();
	set.add("라면"); set.add("김밥");
	set.add("순대"); set.add("라면");

	arr.add("라면"); arr.add("김밥");
	arr.add("순대"); arr.add("라면");
	System.out.println("set : "+set);
	System.out.println("arr : "+arr);
	
	System.out.println("---------------");
	
	//1~45
	ArrayList<Integer> arrInt=new ArrayList<Integer>();
	Random ran = new Random();
	for(;6>arrInt.size();) {
		int r=ran.nextInt(45)+1;
		
		//array로 코딩 시에 중복된 숫자가 나올 수 있어서
		//if로 조건문 입력이 필요하다.
		//if(arrInt.contains(ran)==false) {}
		if(!arrInt.contains(r)) {
		arrInt.add(r);
	}
	}
	System.out.println("arrInt : "+ arrInt);
	
	
	HashSet<Integer> setInt = new HashSet<Integer>();
	for(;6>setInt.size();) {
		setInt.add(ran.nextInt(45)+1);
	}
	System.out.println("setInt : "+ setInt);
	
}
}
