package QKDRHKGN;

public class test_arr_1 {

	public static void main(String[] args) {
		int[] scores = {99,95,93,91,99};
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		avg = (double)sum/scores.length;
		
		System.out.println("�������� ���� : "+ sum);
		System.out.println("�������� ����� : "+ avg);

	}

}
