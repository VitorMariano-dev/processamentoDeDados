
public class Main {

	public static void main(String[] args) {
		// Exemplos de processamentos de dados 
		
		// Exemplo 1 
		int a, b; // Aqui eu declaro a variavel, esta variável não esta recebendo nenhuma expressão
		a = 5;
		b = 2 * a; // Nestas duas linhas estou informando qual expressão essas variáveis irão receber
		
		System.out.println(a);
		System.out.println(b);
		
		// Exemplo 2 
		int c;
		double d;
		
		c = 5;
		d = 2 * c;
		
		System.out.println(c);
		System.out.println(d);
		
		// Exemplo 3 usando double
		
		double e, E, f, area;
		e = 6.0;
		E = 8.0;
		f = 5.0;
		
		area = (e + E)/2.0 * f;
		System.out.println(area);
		
		// Exemplo 3 usando float
		
		float g, G, h, area2;
		
		g = 6f;
		G = 8f;
		h = 5f;
		
		area2 = (g + G) / 2f * h;
		System.out.println(area2);
		
		//Exemplo 4 
		
		int i, j;
		double resultado;
		
		i = 5;
		j = 2;
		
		resultado = i / j;
		System.out.println(resultado);
		
		
		// Exemplo de Casting
		
		// Exemplo 1
		
		int k, l;
		double resultado2;
		double resultado3;
		k = 5;
		l = 2;
		
		resultado2 = k / l;
		System.out.println(resultado2);
		resultado3 = (double) k / l;
		System.out.println(resultado3);
		
		
		
		// Exemplo 5
		double m;
		int n;
		
		m = 5.0;
		n = (int) m; // Se eu deixo apenas o m ele não consegue converter o double para int então antes de a variável n receber m tenho que declarar que aquele valor é um int
		
		System.out.println(n);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}