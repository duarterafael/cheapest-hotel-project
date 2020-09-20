public class AClass {
	public static void main(String[] args) {
		int val1 = 100, val2 = 200;
		
		int soma = soma(val1, val2);
		
		System.out.println(val1 +" + "+ val2 +" = "+ soma);
	}
	
	public static int soma(int param1, int param2)
	{
		
		int soma = param1 + param2;
		
		return soma;
	}
}
