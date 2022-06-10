import java.util.*;
public class Allpaths {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices : ");
		int n=sc.nextInt();
		int a[][]= new int[n][n];
		int cost[][]=new int[n][n];
		
		System.out.println("Enter the adjacency matrix : ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			   cost[i][j]=sc.nextInt();
			   a[i][j]=cost[i][j];
			}
		}
		for(int k=0;k<n;k++)
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(a[i][j]>(a[i][k]+a[k][j]))
						a[i][j]=a[i][k]+a[k][j];
				}
			}
		}
		//allpaths(cost, a, n);
		System.out.println("The shortest path is : ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]);
			}
		}
	}
}
