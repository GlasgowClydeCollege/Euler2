package euler2;

public class numbersystem {

	double Fnumber;

	public double getFnumber() {
		return Fnumber;
	}

	public void setFnumber() {
		
		double[] fib = new double[100];
		double total=0;
		fib[0]=0;
		fib[1]=1;
		fib[2]=1;
		int counter=2;
		
	do {
			
			fib[counter]=fib[counter-1]+fib[counter-2];
				
			if (fib[counter]%2==0 && fib[counter]<4000000){
				total=total+fib[counter];
			}
			
					counter++;
		}
		while (counter<100);

		
		Fnumber = total;
	}
}
