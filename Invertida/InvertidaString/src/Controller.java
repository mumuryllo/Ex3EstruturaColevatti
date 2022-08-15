
public class Controller {
	public String stringInvertida(String palavra, int index) {
		if(index == 0) {
			return "";
		}
		return palavra.substring(index-1, index)+stringInvertida(palavra, index - 1);
	}
}
