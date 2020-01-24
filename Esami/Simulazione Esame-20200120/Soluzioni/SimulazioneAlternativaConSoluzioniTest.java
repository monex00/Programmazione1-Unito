public class SimulazioneAlternativaConSoluzioniTest {
	public static void main(String[] args) {
		System.out.println(SimulazioneAlternativaConSoluzioni.e2(new int[] {}, 0)==true);
		System.out.println(SimulazioneAlternativaConSoluzioni.e2(new int[] {1}, 0)==true);
		System.out.println(SimulazioneAlternativaConSoluzioni.e2(new int[] {1}, 1)==false);
		System.out.println(SimulazioneAlternativaConSoluzioni.e2(new int[] {1,2}, 2)==false);
		System.out.println(SimulazioneAlternativaConSoluzioni.e2(new int[] {1,2}, 0)==true);
		System.out.println(SimulazioneAlternativaConSoluzioni.e2(new int[] {1,2}, 1)==true);
		System.out.println(SimulazioneAlternativaConSoluzioni.e2(new int[] {1,2}, 2)==false);
		System.out.println(SimulazioneAlternativaConSoluzioni.e2(new int[] {1,2,3}, 0)==true);
		System.out.println(SimulazioneAlternativaConSoluzioni.e2(new int[] {1,2,3}, 1)==true);
		System.out.println(SimulazioneAlternativaConSoluzioni.e2(new int[] {1,2,3}, 2)==true);
		System.out.println(SimulazioneAlternativaConSoluzioni.e2(new int[] {1,2,3}, 3)==false);
	}
}
