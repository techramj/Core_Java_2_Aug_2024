
public class TwoDArrayDemo {
	
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		int barr[][] = {{1,2,3}, {3,4},{5,6,7,8}};
		
		int[][] carr = new int[4][3];
		
		arr[1][2] = 123;
		arr[0][1] = 456;
		
		int[][] darr = new int[3][];
		darr[0] = new int[] {2,3,4,5};
		darr[1] = new int[6];
		darr[2] = new int[] {1,2};
		
		System.out.println(darr[0]);
		
		display2dArray(arr);
		display2dArray(barr);
		display2dArray(carr);
		display2dArray(darr);
	}
	
	static void display2dArray(int[][] xarr) {
		for(int i=0;i<xarr.length;i++) {
			for(int j=0;j<xarr[i].length;j++) {
				System.out.print(xarr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
	}

}
