package sample_Progs;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String strWithSpaces = "Hello How are you . Srilatha";
		String strWithoutSpaces = strWithSpaces.replaceAll(" ", "");
		System.out.println(strWithoutSpaces);
	}

}
