import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("Alura online");
		palavras.add("Editora casa do código");
		palavras.add("Caelum");

//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));

		Function<String, Integer> funcao = String::length;
//		Function<String, Integer> funcao2 = String::length;

		Comparator<String> comparator = Comparator.comparing(funcao);
		palavras.sort(comparator);

		System.out.println(palavras);

		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);

		palavras.forEach(s -> System.out.println(s));
	}

}