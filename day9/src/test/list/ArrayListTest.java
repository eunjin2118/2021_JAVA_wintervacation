package test.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> namesList = new ArrayList<String>();
		
		while(true) {
			System.out.print("성명 입력 : ");
			String name = scan.nextLine();
			namesList.add(name);
			
			System.out.print("성멍을 계속 입력하시겠습니까?(y/n) ");
			String msg = scan.nextLine();
			if(msg.equals("n") || msg.equals("no")) break;
		}
		
		//ArrayList에 저장된 문자열들을 출력
		for(int i = 0; i<namesList.size(); i++) {
			System.out.println("=== ArrayList nameList에 저장된 내용 출력 ===");
			System.out.println(namesList.get(i));
		}
	}

}
