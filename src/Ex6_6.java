
public class Ex6_6 {
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
	}

	public static void main(String[] args) {

		System.out.println(getDistance(1,1,2,2));
		
		MyPoint p = new MyPoint(1, 1);
		
		System.out.println(p.getDistance(2,2));
	}

}

class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	double getDistance(int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
	}
}
