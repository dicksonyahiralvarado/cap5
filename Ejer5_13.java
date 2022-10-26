/*
C-5.13	Dé un algoritmo recursivo para calcular el producto de dos 
números enteros positivos, m y n, usando solo sumas y restas.
*/

public class Ejer5_13 {
    
	public static void main (String[] args)
	{
		int m = 2, n = 10;
		
		System.out.println("El resultado del producto es: " + product(m, n));
	}

	public static int product(int m, int n)
	{
	
		if (m < n)
		return product(n, m);
	
		else if (n != 0)
		return (m + product(m, n - 1));
	
		else
		return 0;
	}

}
