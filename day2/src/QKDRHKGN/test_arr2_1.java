package QKDRHKGN;
//������ �迭
public class test_arr2_1 {

	public static void main(String[] args) {
		String[][] favs1 = {{"ȣ����", "������", "�䳢", "����"}, {"���", "�ٳ���", "��", "Ű��"}, 
							{"��", "����", "����", "�ܿ�"}};
		

		for(int i = 0; i<favs1.length; i++) {
			for(int j = 0; j<=favs1.length; j++) {
				System.out.print(favs1[i][j]+" ");
			}
			System.out.println();
		}
	}

}
