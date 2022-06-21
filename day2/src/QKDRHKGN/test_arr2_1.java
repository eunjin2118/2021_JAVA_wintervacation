package QKDRHKGN;
//이차원 배열
public class test_arr2_1 {

	public static void main(String[] args) {
		String[][] favs1 = {{"호랑이", "강아지", "토끼", "사자"}, {"사과", "바나나", "귤", "키위"}, 
							{"봄", "여름", "가을", "겨울"}};
		

		for(int i = 0; i<favs1.length; i++) {
			for(int j = 0; j<=favs1.length; j++) {
				System.out.print(favs1[i][j]+" ");
			}
			System.out.println();
		}
	}

}
