package Array;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,0,-1,1,4};
		int n = a.length;
		for (int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-1; j++)
			{
				if (a[j+1] < a[j])
				{
					int temp =a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
				
			}
			
		}
		
		
for(int item: a) {
	System.out.print(item+ " ");
}
}
}
