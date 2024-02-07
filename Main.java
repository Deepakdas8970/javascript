//Strassen's matrix multiplication technique
  import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int a[][]=new int[2][2],i,j;
		int p,q,r,s,t,u,v;
		int c1,c2,c3,c4;
		System.out.print("enter the first metrix element: ");
		for(i=0;i<2;i++)
		{
		    for(j=0;j<2;j++)
		    {
		        Scanner obj=new Scanner(System.in);
		        a[i][j]=obj.nextInt();
		    }
		}
		int b[][]=new int[2][2];
			System.out.print("enter the second metrix element: ");
		
		for(i=0;i<2;i++)
		{
		    for(j=0;j<2;j++)
		    {
		        Scanner obj =new Scanner(System.in);
		        b[i][j]=obj.nextInt();
		    }
		}
		System.out.print("first metrix element: ");
		
		for(i=0;i<2;i++)
		{
		    System.out.println(" ");
		    for(j=0;j<2;j++)
		    {
		        System.out.print(a[i][j]+" ");
		    }
		}
		System.out.println(" ");
		System.out.print("first metrix element: ");
		for(i=0;i<2;i++)
		{
		    System.out.println(" ");
		    for(j=0;j<2;j++)
		    {
		        System.out.print(b[i][j]+" ");
		    }
		}
		int c[][]=new int[2][2];
	 p=(a[0][0]+a[1][1])*(b[0][0]+b[1][1]);
	 q=b[0][0]*(a[1][0]+a[1][1]);
	 r=a[0][0]*(b[0][1]-b[1][1]);
	 s=a[1][1]*(b[1][0]-b[0][0]);
	 t=b[1][1]*(a[0][0]+a[0][1]);
	 u=(a[1][0]-a[0][0])*(b[0][0]+b[0][1]);
	 v=(b[1][0]+b[1][1])*(a[0][1]-a[1][1]);
	 c[0][0]=p+s-t+v;
	 c[0][1]=r+t;
	 c[1][0]=q+s;
	 c[1][1]=p+r-q+u;
	 System.out.println(" ");
	 System.out.print("result metrix element: ");
		for(i=0;i<2;i++)
		{
		    System.out.println(" ");
		    for(j=0;j<2;j++)
		    {
		        System.out.print(c[i][j]+" ");
		    }
		}
		}
}j