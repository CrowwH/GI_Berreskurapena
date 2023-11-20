import java.util.Scanner;

public class Batazbestekoa {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        double zenbaki;
	        double batazbestekoa = 0;
	        int zenbakiKopurua = 0;

	        System.out.println("Zenbaki osoak sartu (0 amaitzeko): ");

	        while (true) {
	            try {
	                zenbaki = Double.parseDouble(sc.nextLine());
	                if (zenbaki == 0) {
	                    break;
	                }
	                batazbestekoa += zenbaki;
	                zenbakiKopurua++;
	            } catch (NumberFormatException e) {
	                System.out.println("Errorea: Zenbaki osoa sartu behar duzu.");
	            }
	        }

	        if (zenbakiKopurua > 0) {
	            double batazbestekoaFinal = batazbestekoa / zenbakiKopurua;
	            System.out.println("Aurreko zenbaki guztien bataz bestekoa: " + batazbestekoaFinal);
	        } else {
	            System.out.println("Ez da zenbaki sartu.");
	        }
	    }
}