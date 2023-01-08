
public class CharStringCount {

	public static void main(String[] args)
	{
		
				String str="Rutuja";
				String str1="Rutuja";
				char ch[];
				int i,c=0,j;
				ch=str1.toCharArray();
				
				
				for(i=0;i<str.length();i++)
				{
					c=0;
					for(j=0;j<ch.length;j++)
					{
					if(str.charAt(j)==ch[i])
					
							
					c++;
					
					
				    }
				System.out.println(ch[i]+" "+c);
				}
				// TODO Auto-generated method stub

			}

		}

		// TODO Auto-generated method stub

	


