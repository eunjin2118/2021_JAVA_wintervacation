package QKDRHKGN;

public class test_darr {

	public static void main(String[] args) {
		//동적 2차원 배열을 초기화 시켜서 생성
		int[][] nums = {{10}, {20, 30}, {40, 50, 60}};
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}

	}

}
