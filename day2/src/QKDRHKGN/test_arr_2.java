package QKDRHKGN;
import java.util.Scanner;

// 배열을 이용해서 입력받은 수의 합계와 평균을 계산하는 프로그램
public class test_arr_2 {

	public static void main(String[] args) {
		int[] scores = new int[5];
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		double avg = 0;
		
		String[] subjects = {"Java", "C언어", "국어", "영어", "수학" };
		
		for(int i = 0; i<scores.length; i++) {
			System.out.print(subjects[i]+ " 과목 점수 입력 : ");
			scores[i] = scan.nextInt();
			sum += scores[i];
		}
		
		avg = (double)sum/scores.length;
		
		for(int i = 0; i<scores.length; i++) {
			System.out.print(scores[i]+" ");
		}
		
		System.out.println();
		System.out.println("합계 : "+sum);
		//printf -> 형식지정자
		System.out.printf("평균 : %.2f\n",avg);

	}

}
