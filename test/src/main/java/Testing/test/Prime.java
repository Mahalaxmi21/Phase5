package Testing.test;

public class Prime {
	public String prime(int n) {
		int i,m=0,flag=0;
		m=n/2;
		if(n==0||n==1) {
			return "It is prime number";
		}else
		{
			for(i=2;i<=m;i++) {
				if(n%i==0) {
					return "It is not prime number";
					
				}
			}
			if(flag==0) {return "is prime number";}
		}
		return null;
	}

}
