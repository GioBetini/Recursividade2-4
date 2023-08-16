package controller;

public class FatImpar {

	public FatImpar() {
		super();
	}
	
	public int fatorialImpar(int num) {
		if (num <= 1) {
			return 1;
		}
		
		return num*fatorialImpar(num-2);
			
	}

}
