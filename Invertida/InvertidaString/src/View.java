
public class View  {
public static void main(String[] args) {
	Controller controller = new Controller();
	String palavra = "Olá a todos";
	String resultado = controller.stringInvertida(palavra, palavra.length());
	System.out.println(resultado);
}
}
