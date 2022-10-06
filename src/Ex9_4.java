
public class Ex9_4 {
	static void printGraph(int[] dataArr, char ch) {
		for (int i = 0; i < dataArr.length; i++) {
			int num = dataArr[i];
			for (int j = 0; j < num; j++) {
				System.out.print(ch);
			}
			System.out.println(num);
		}
	}


	public static void main(String[] args) {
		
		printGraph(new int[]{3,7,1,4},'*');

	}

}
