
public class AssignmentQue3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =11;
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n; j++) {
				
				if(i+j<= n/2 || j-i >=n/2 || j==0 || j==n-1 || i==n-1)
					System.out.print("*");
					
					else{
						System.out.print(" ");
					}
			}
			System.out.println();

	}

}
}

