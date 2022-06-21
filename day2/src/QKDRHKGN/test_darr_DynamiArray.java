package QKDRHKGN;

public class test_darr_DynamiArray {

	public static void main(String[] args) {
	//동적 2차원 배열을 초기화 시켜서 생성
		int[][] nums = new int[3][];
		int count=1;
			
		for (int i = 0; i < nums.length; i++) {
			nums[i] = new int[i+1];
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = 10* count++;
			}
			
		}
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
