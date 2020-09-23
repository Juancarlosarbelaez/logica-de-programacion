public class Matriz{
	public static void main(String[] args) {
		
		double matriz[][];//Declaración
		matriz = new double[3][5];

		matriz[0][0] = 1;
		matriz[0][1] = 1;
		matriz[0][2] = 1;
		matriz[0][3] = 1;
		matriz[0][4] = 1;

		matriz[1][0] = 2;
		matriz[1][1] = 2;
		matriz[1][2] = 2;
		matriz[1][3] = 2;
		matriz[1][4] = 2;

		matriz[2][0] = 3;
		matriz[2][1] = 3;
		matriz[2][2] = 3;
		matriz[2][3] = 3;
		matriz[2][4] = 3;

		matriz[3][0] = 4;
		matriz[3][1] = 4;
		matriz[3][2] = 4;
		matriz[3][3] = 4;
		matriz[3][4] = 4;

		matriz[4][0] = 5;
		matriz[4][1] = 5;
		matriz[4][2] = 5;
		matriz[4][3] = 5;
		matriz[4][4] = 5;
	
        int contador = 0;

		for (int i=0; i<matriz.length; i++ ) {
			for (int j=0; j<matriz[0].length ; j++ ) {
				if(i==j){
					contador = contador + ((double)matriz[i][j]);
				}
			}
			System.out.println();
		}
        System.out.println(contador);
	}
}