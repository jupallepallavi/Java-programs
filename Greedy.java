import java.util.*;
public class Greedy {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int obj,m;
		System.out.println("Enter the no. of objects : ");
		obj=sc.nextInt();
		int weight[] = new int[obj];
		int profit[] =  new int[obj];
		for(int i=0;i<obj;i++)
		{
			System.out.print("Enter the profit : ");
			profit[i]=sc.nextInt();
			System.out.print("Enter the weight : ");
			weight[i]=sc.nextInt();
			System.out.println();
		}
		System.out.println("Enter the kanpsack capacity : ");
		m=sc.nextInt();
		double p_w[]=new double [obj];
		for(int i=0;i<obj;i++)
		{
			p_w[i] = (double)profit[i]/(double)weight[i];
		}
		System.out.println(" ");
		System.out.println("------");
		System.out.println("---Data-set----");
		System.out.print("-----");
		System.out.println(" ");
		System.out.print("Objects"+" ");
		for(int i=1;i<=obj;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("Profits"+" ");
		for(int i=0;i<obj;i++)
		{
			System.out.print(profit[i]+" ");
		}
		System.out.println();
		System.out.print("Weights"+" ");
		for(int i=0;i<obj;i++)
		{
			System.out.print(weight[i]+" ");
		}
		System.out.println();
		System.out.print("profit/weight"+" ");
		for(int i=0;i<obj;i++) {
			System.out.print(p_w[i]+" ");
		}
		for(int i=0;i<obj-1;i++)
		{
			for(int j=i+1;j<obj;j++)
			{
				if(p_w[i]<p_w[j])
				{
					double temp=p_w[j];
						   p_w[j]=p_w[i];
						   p_w[i]=temp;
					int temp1=profit[j];
					profit[j]=profit[i];
					profit[i]=temp1;
					int temp2=weight[j];
					weight[j]=weight[i];
					weight[i]=temp2;
				}
			}
		}
		System.out.println(" ");
		System.out.println("------");
		System.out.println("-----After arranging-----");
		System.out.print("-----");
		System.out.println(" ");
		System.out.print("Objects"+" ");
		for(int i=1;i<=obj;i++)
		System.out.print(i+" ");
		System.out.println();
		System.out.print("Profits"+" ");
		for(int i=0;i<obj;i++)
		System.out.print(profit[i]+" ");
		System.out.println();
		System.out.print("Weights"+" ");
		for(int i=0;i<obj;i++)
			System.out.print(weight[i]+" ");
		System.out.println();
		System.out.print("Profit/Weight"+" ");
		for(int i=0;i<obj;i++)
		{
			System.out.print(p_w[i]+" ");
		}
		int k=0;
		double sum=0;
		System.out.println();
		while(m>0)
		{
			if(weight[k]<m)
			{
				sum+=1*profit[k];
				m=m-weight[k];
			}
			else
			{
				double x4=m*profit[k];
				double x5=weight[k];
				double x6=x4/x5;
				sum+=x6;
				m=0;
			}
			k++;
		}
		System.out.println();
		System.out.println("Final profit is = "+sum);
	}
}
