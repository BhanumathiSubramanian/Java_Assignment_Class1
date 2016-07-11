
public class PrimeOrNotEx {

	public static void main(String[] args) {
	
	 int i=0;
	
	 for(i = 1;i<100;i++)
	 {
		boolean check = true;
		 for(int j=2;j<i;j++)
		 {
			if(i%j == 0)
			{
				check = false;
				break;
				
			}
			
		 }
		 if(check)
		 System.out.println(i); 
	 }
	}

}
