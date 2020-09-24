public class Bandera{
	public static void main(String[] args) {
		
		char matriz[][];//Declaración
		matriz = new char[70][70];

		for (int i=0; i<matriz.length; i++ )
		{
			for (int j=0; j<matriz.length ; j++ )
			{
				if(i<j)
				{
                   matriz[i][j]= 'r';
				}

				else
				{
                  matriz[i][j]= 'n';
				}
			}
		}

		
		for (int i=0; i<matriz.length; i++ )
		{
			for (int j=0; j<matriz.length ; j++ )
			{
				if(matriz[i][j]=='r')
				{
				    System.out.print(ConsoleColors.RED_BACKGROUND + "  ");
				}

				else if (matriz[i][j]=='n') 
				{
				   System.out.print(ConsoleColors.BLACK_BACKGROUND + "  ");	
				}

				System.out.print(ConsoleColors.RESET);
			}

			System.out.println("");
		}    	 
	}   
}
