package clases;
import java.util.*;
public class Casa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce los metros cuadrados de la entrada: ");
		int metrosCuadradosEntrada= Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el numero de puertas de la entrada: ");
		int numeroPuertasEntrada= Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el numero de ventanas de la entrada: ");
		int numeroVentanasEntrada= Integer.parseInt(sc.nextLine());
		System.out.println("Tiene puerta blindada (S/N): ");
		String puertaBlindadaRespuesta= sc.nextLine();
		boolean puertaBlindada=false;
		if(puertaBlindadaRespuesta=="S") {
			puertaBlindada=true;
		}
		Hall entrada= new Hall("entrada",metrosCuadradosEntrada,
				numeroPuertasEntrada,numeroVentanasEntrada,puertaBlindada );
		Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce los datos de la cocina:");
        System.out.print("Nombre: ");
        String nombreCocina = scanner.nextLine();
        System.out.print("Metros cuadrados: ");
        int mcCocina = scanner.nextInt();
        System.out.print("Número de puertas: ");
        int npCocina = scanner.nextInt();
        System.out.print("Número de ventanas: ");
        int nvCocina = scanner.nextInt();
        System.out.print("¿Tiene tendedero? (true/false): ");
        boolean tendedero = scanner.nextBoolean();
        System.out.print("Metros cuadrados de tendedero: ");
        int mcTendedero = scanner.nextInt();
        scanner.nextLine();

        Cocina cocina = new Cocina(tendedero, mcTendedero, nombreCocina, mcCocina, npCocina, nvCocina);

        System.out.println("Introduce los datos del baño:");
        System.out.print("Nombre: ");
        String nombreBano = scanner.nextLine();
        System.out.print("Metros cuadrados: ");
        int mcBano = scanner.nextInt();
        System.out.print("Número de puertas: ");
        int npBano = scanner.nextInt();
        System.out.print("Número de ventanas: ");
        int nvBano = scanner.nextInt();
        System.out.print("¿Tiene baño? (true/false): ");
        boolean tieneBano = scanner.nextBoolean();
        scanner.nextLine();

        Bano bano = new Bano(nombreBano, mcBano, npBano, nvBano, tieneBano);

        System.out.println("Introduce los datos de la habitación:");
        System.out.print("Nombre: ");
        String nombreHabitacion = scanner.nextLine();
        System.out.print("Metros cuadrados: ");
        int mcHabitacion = scanner.nextInt();
        System.out.print("Número de puertas: ");
        int npHabitacion = scanner.nextInt();
        System.out.print("Número de ventanas: ");
        int nvHabitacion = scanner.nextInt();
        System.out.print("Número de puertas de armario: ");
        int npaHabitacion = scanner.nextInt();
        System.out.print("¿Tiene acceso al baño? (true/false): ");
        boolean accesoBano = scanner.nextBoolean();
        scanner.nextLine();

        Habitacion habitacion = new Habitacion(nombreHabitacion, mcHabitacion, npHabitacion, nvHabitacion, npaHabitacion, accesoBano);

        
        System.out.println("Introduce los datos del salón:");
        System.out.print("Nombre: ");
        String nombreSalon = scanner.nextLine();
        System.out.print("Metros cuadrados: ");
        int mcSalon = scanner.nextInt();
        System.out.print("Número de puertas: ");
        int npSalon = scanner.nextInt();
        System.out.print("Número de ventanas: ");
        int nvSalon = scanner.nextInt();
        System.out.print("Número de tomas de red: ");
        int tomasRed = scanner.nextInt();
        System.out.print("¿Tiene terraza? (true/false): ");
        boolean terraza = scanner.nextBoolean();
        System.out.print("Metros cuadrados de la terraza: ");
        int mcTerraza = scanner.nextInt();

        Salon salon = new Salon(nombreSalon, mcSalon, npSalon, nvSalon, tomasRed, terraza, mcTerraza);

        System.out.println("\nInformación de la cocina: " + cocina.mostrarInfo());
        System.out.println("Información del baño: " + bano.mostrarInfo());
        System.out.println("Información de la habitación: " + habitacion.mostrarInfo());
        System.out.println("Información del hall: " + entrada.mostrarInfo());
        System.out.println("Información del salón: " + salon.mostrarInfo());

        scanner.close();
	}

}

