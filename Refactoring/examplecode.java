public class CalculationEngine {
	public static void main(String[] args){
		int a = 1000;
		boolean[] f = new boolean[a+1];
//		Set all to true
		for(int i = 1; i < f.length; i++){
			f[i] = true;
		}
//		Filter false values
		for(int j = 1; j < f.length; j++){
			if(f[j] && j != 1){
				int k = j;
				while(k+j < f.length){
					k = k + j;
					f[k] = false;
				}
			}
		}
//		print
		for(int k = 2; k < f.length; k++){
			if(f[k]){
				System.out.println(k);
			};
		}
	}
}