package tr.edu.medipol.yova.hesaplama;

public class HesaplamaMain {

	public static void main(String[] args) {
	   System.out.println("Hesaplama uygulaması calisiyor...");
	   
	   int sayi1 = 2;
	   int sayi2 = 5;
	   int sonuc = Calculator.sum(sayi1, sayi2);
	   System.out.println(sayi1 + " + " + sayi2 + " = " + sonuc);
	   
	   System.out.println("Hesaplama uygulaması sonlandi...");
	}

}
