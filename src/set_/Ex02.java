package set_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {
public static void main(String[] args) {
	HashSet<String> set = new HashSet<String>();
	set.add("111");
	set.add("222");
	set.add("333");
	set.remove("222");
	boolean bool = set.remove("222");
	System.out.println("bool : "+bool);
	System.out.println("set : "+set);
	
	
	/*
	iterator : 반복자
	- 컬렉션에 있는 값을 배열 형식으로 만들어준다
	- 처음 위치는 bof, 마지막 위치는 eof
	- bof : 시작점, eof : 끝나는 지점
	 */
	ArrayList<Integer> arr=new ArrayList<Integer>();
	arr.add(111);
	arr.add(222);
	arr.add(333);
	Iterator<Integer> it = arr.iterator();
	// bof, 111, 222, 333, eof 순서로 interator를 통해
	// it에 입력되어 있으며 hasNext는 it 다음 값이 있는가? 참,거짓여부
	//next는 다음 값을 가져온다.
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	/*
	System.out.println(it.hasNext());
	System.out.println(it.next());
	System.out.println(it.next());
	System.out.println(it.next());
	System.out.println(it.hasNext());
	System.out.println(it.next());
	*/

	System.out.println("------------------");
	Iterator<String> its= set.iterator();
	while(its.hasNext()) {
		String s = its.next();
		System.out.println(s);
	}
	
}
}
