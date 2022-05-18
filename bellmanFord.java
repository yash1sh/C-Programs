import java.util.Scanner;
public class bellmanFord
{
	private int d[];
	private int num_ver;
	public static final int max_values=999;
	public  bellmanFord(int num_ver)
	{
		this.num_ver=num_ver;
		d=new int[num_ver+1];
	}
	public void bellmanFordEvaluation(int source,int A[][])
	{
		for(int node=1;node<=num_ver;node++)
		{
			d[node]=max_values;
		}
		d[source]=0;
		for(int node=1;node<=num_ver-1;node++)
		{
			for(int sn=1;sn<=num_ver;sn++)
			{
				for(int dn=1;dn<=num_ver;dn++)
				{
					if(d[dn]>d[sn]+A[sn][dn])
					{
					d[dn]=d[sn]+A[sn][dn];
				        }
				}
			}
		}	
		for(int sn=1;sn<=num_ver;sn++)
		{
		for(int dn=1;dn<=num_ver;dn++)
			{
				if(A[sn][dn]!=max_values)
				{
					if(d[dn]>d[sn]+A[sn][dn])
					{
						System.out.println("the graph contains negative edge cycle");
					}
				}
			}
		}
	for(int vertex=1;vertex<=num_ver;vertex++)
	{
		System.out.println("distance of source "+source+" to "+vertex+" is "+d[vertex]);
	}
 	}
	public static void main(String []args)
	{
		int num_ver=0;
		int source;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of verticess");
		num_ver=sc.nextInt();
		int A[][]=new int[num_ver+1][num_ver+1];
		System.out.println("enter the adjacent matrix");
		for(int sn=1;sn<=num_ver;sn++)
		{
			for(int dn=1;dn<=num_ver;dn++)
			{
				A[sn][dn]=sc.nextInt();
				if(sn==dn)
				{
					A[sn][dn]=0;
					continue;
				}
				if(A[sn][dn]==0)
				{
					A[sn][dn]=max_values;
				}
			}
		}
		System.out.println("enter the source vertex");
		source=sc.nextInt();
		bellmanFord b=new bellmanFord(num_ver);
		b.bellmanFordEvaluation(source,A);
		sc.close();
	}
} 