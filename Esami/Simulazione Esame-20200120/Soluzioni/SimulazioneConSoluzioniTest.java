public class SimulazioneConSoluzioniTest {
	public static void main(String[] args) {
		System.out.println(SimulazioneConSoluzioni.e2(new int[][] {})
				           ==SimulazioneConSoluzioni.e1(new int[][] {}));
		System.out.println(SimulazioneConSoluzioni.e2(new int[][] {{1}})
				           ==SimulazioneConSoluzioni.e1(new int[][] {{1}}));
		System.out.println(SimulazioneConSoluzioni.e2(new int[][] {{1,2},{1,2},})
				           ==SimulazioneConSoluzioni.e1(new int[][] {{1,2},{1,2}}));
		System.out.println(SimulazioneConSoluzioni.e2(new int[][] {{1,2},{2,1},})
				           ==SimulazioneConSoluzioni.e1(new int[][] {{1,2},{2,1}}));
	}
}
