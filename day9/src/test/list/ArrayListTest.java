package test.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> namesList = new ArrayList<String>();
		
		while(true) {
			System.out.print("���� �Է� : ");
			String name = scan.nextLine();
			namesList.add(name);
			
			System.out.print("������ ��� �Է��Ͻðڽ��ϱ�?(y/n) ");
			String msg = scan.nextLine();
			if(msg.equals("n") || msg.equals("no")) break;
		}
		
		//ArrayList�� ����� ���ڿ����� ���
		for(int i = 0; i<namesList.size(); i++) {
			System.out.println("=== ArrayList nameList�� ����� ���� ��� ===");
			System.out.println(namesList.get(i));
		}
	}

}
