package myproject;

public class EE36 {

	public static void main(String[] args) {
		
	int[] div;
	div = new int[100001]; 
	int max=1;
	int i;
	int j;
	
	for(i=2;i<=10000;i++)
	{
		int nbd=1;
		for(j=2;j<=10000;j++) {
			if(i%j==0) {
				nbd++;
			}
		}
		div[i]=nbd;
		if(nbd>max) {max=nbd;}
	}
	System.out.println("Le nombre de diviseur est :"+max);
	}
	
	
}