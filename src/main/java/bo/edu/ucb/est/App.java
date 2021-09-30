package bo.edu.ucb.est;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Lista listaAlumnos  = new Lista();
       
       listaAlumnos.agregar(new Alumno("Melany Aranibar", "11222333")); // Agregar elemento
       listaAlumnos.agregar(new Alumno("Horacio Esprella", "222331122")); // Agregar elemento
       listaAlumnos.agregar(new Alumno("Jonathan Jared", "7723424")); // Agregar elemento
       listaAlumnos.agregar(new Alumno("Manuel Segaline", "231234555")); // Agregar elemento
       listaAlumnos.agregar(new Alumno("Bernad Gutierrez", "2010292335")); // Agregar elemento
       listaAlumnos.agregar(new Alumno("Naomi Tacachira", "2010292335")); // Agregar elemento
       System.out.println("El tamanio de la lista es: " + listaAlumnos.getTamanio());
       listaAlumnos.imprimir(); // Imprimir el contenido
       System.out.println(listaAlumnos.obtener(4)); // Obtener un elemento por una posicion
       listaAlumnos.eliminar(0); // Elimnar un elemento por una posicion
       listaAlumnos.imprimir();
    }

    public void ejemploVector() {
        Alumno [] alumnos = new Alumno[3];
        alumnos[0] = new Alumno("Alejandra Pacheco", "1023123123");
        alumnos[1] = new Alumno("Naomi Tacachira", "1231233");
        alumnos[2] = new Alumno("Sebastian Belmonte", "123312312");
        // alumnos[3] = new Alumno("Melany Aranibar", "21123332");

        Alumno otro =  alumnos[1];
        System.out.println(otro.getNombreCompleto());
        otro.setCedulaItentidad("1123581321");
        System.out.println(alumnos[1].getCedulaItentidad());
    }
}
