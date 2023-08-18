
public class Main {
	

	public static void main(String[] args) {
		imprimirTabla(10);
		
	}
	
	public static void imprimirTabla (int num) {
		
		for (int i =1; i<=10; i++) {
			System.out.printf("%d * %d = %d \n",num,i,i*num);
		}
		
	}
	

}
