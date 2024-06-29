package Centro;
import java.util.Scanner;


public class AdivinaNúmeroJuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);        
        boolean exit = false; // Variable para controlar la salida del bucle principal

        while (!exit) { // Bucle principal que se ejecuta hasta que el usuario seleccione salir
            System.out.println("¡Bienvenido al juego de adivinar el número!");
            System.out.println("Piensa en un número dentro de un rango de 1 a 100.");
            System.out.println("Ingresa 'S' en cualquier momento para salir.");

            int minRange = 1; // Rango mínimo para adivinar
            int maxRange = 100; // Rango máximo para adivinar
            int attempts = 0; // Contador de intentos
            boolean hasGuessed = false; // Variable para controlar si el número ha sido adivinado

            while (!hasGuessed) { // Bucle para adivinar el número
                int guess = (minRange + maxRange) / 2; 

                // Mostrar la adivinanza del programa y las opciones del usuario
                System.out.println("¿tu número es" + guess + "?");
                System.out.println("1. Muy alto");
                System.out.println("2. Muy bajo");
                System.out.println("3. ¡Correcto!");
                System.out.println("Ingrese su respuesta (o 'S' para salir): ");

                String response = scanner.nextLine(); // Leer la respuesta del usuario

                if (response.equalsIgnoreCase("S")) { // Si el usuario ingresa 'S', salir del juego
                    exit = true;
                    break;
                }

                // Ajustar el rango según la respuesta del usuario
                switch (response) {
                    case "1":
                        maxRange = guess - 1;
                        break;
                    case "2":
                        minRange = guess + 1;
                        break;
                    case "3":
                        hasGuessed = true; // El número ha sido adivinado correctamente
                        break;
                    default:
                        System.out.println("Por favor, ingresa una respuesta válida."); // Controlar entradas inválidas
                }

                attempts++; // Incrementar el contador de intentos
            }

            if (!exit) { // si el usuario no ha salido del juego
                System.out.println("¡El programa ha adivinado tu número en " + attempts + " intentos!");
                System.out.println("¿Quieres jugar otra vez? (sí/no)");
                String playAgain = scanner.nextLine(); // Leer si el usuario quiere jugar de nuevo
                if (playAgain.equalsIgnoreCase("no")) { // Si el usuario ingresa 'no', salir del juego
                    exit = true;
                }
            }
        }

        System.out.println("Gracias por jugar. ¡Hasta luego!"); // Mensaje de despedida
        scanner.close(); // Cerrar el objeto Scanner
	
	}

}
