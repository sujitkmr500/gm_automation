package program;

public class cube_using_static {
	// created static method type int
	static int cube(int x) {
		return x*x*x;
	}

	public static void main(String[] args) {
		int result = cube(5);
		System.out.println(result);
	}

}
