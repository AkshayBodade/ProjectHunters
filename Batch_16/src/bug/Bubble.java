package bug;

public class Bubble {

	public static void main(String[] args) {
		int a[]= {15,10,6,7,14};
		int itr,t,j;
		for(itr=a.length;itr>1;itr--)
		{
			for(j=0;j<itr-1;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
			
		}
		for(j=0;j<a.length;j++)
			System.out.print(a[j]+" ");
		// TODO Auto-generated method stub

	}

}
