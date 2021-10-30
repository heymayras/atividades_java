
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista l = new Lista();
		
		l.inserirPrimeiro(20);
		l.inserirPrimeiro(30);
		l.inserirPrimeiro(40);
		
		l.mostrar();	
		System.out.println();
		
		System.out.println("Inserir Ultimo");
		l.inserirUltimo(10);
		
		l.mostrar();
		System.out.println();
		
		System.out.println("Inserir Primeiro");
		l.inserirPrimeiro(50);
		
		l.mostrar();
		System.out.println();
		
		System.out.println("Inserir Depois posicao 2");
		l.inserirDepois(2, 35);
		
		l.mostrar();
		System.out.println();
		
		System.out.println("Remover No 3");
		l.removerNo(3);
		
		l.mostrar();
		System.out.println();
		
		System.out.println("Remover Primeiro");
		l.removerPrimeiro();
		
		l.mostrar();
		System.out.println();
		
		System.out.println("Remover Ultimo");
		l.removerUltimo();
		
		l.mostrar();
		System.out.println();
		
		
		

	}

}
