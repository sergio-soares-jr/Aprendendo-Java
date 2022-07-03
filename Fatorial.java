import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um inteiro positivo: ");
		int n = scan.nextInt();
		int aux=n;
		
		if(n==0)
			System.out.printf("Fatorial de %d é 1.\n",n);
		else {
			for(int i=aux;i>1;i--) {
				aux=aux*(i-1);
			}
			System.out.printf("O fatorial de %d é %d.",n, aux);
		}
		
		scan.close();
	}

}
