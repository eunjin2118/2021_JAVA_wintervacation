package QKDRHKGN;
import java.util.Scanner;

// �迭�� �̿��ؼ� �Է¹��� ���� �հ�� ����� ����ϴ� ���α׷�
public class test_arr_2 {

	public static void main(String[] args) {
		int[] scores = new int[5];
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		double avg = 0;
		
		String[] subjects = {"Java", "C���", "����", "����", "����" };
		
		for(int i = 0; i<scores.length; i++) {
			System.out.print(subjects[i]+ " ���� ���� �Է� : ");
			scores[i] = scan.nextInt();
			sum += scores[i];
		}
		
		avg = (double)sum/scores.length;
		
		for(int i = 0; i<scores.length; i++) {
			System.out.print(scores[i]+" ");
		}
		
		System.out.println();
		System.out.println("�հ� : "+sum);
		//printf -> ����������
		System.out.printf("��� : %.2f\n",avg);

	}

}
