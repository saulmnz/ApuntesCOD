public class Principal {
    // 5. Clase Principal con método main
        public static void main(String[] args) {
            // Crear libros usando ambos constructores
            Libro libro1 = new Libro(); // Constructor por defecto
            Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, (int) 471, (double) 3.2);

            // Mostrar información inicial
            System.out.println("Libro 1 (inicial):");
            libro1.amosar();
            System.out.println("Libro 2:");
            libro2.amosar();

            // Modificar libro1 usando setters
            libro1.setTitulo("1984");
            libro1.setAutor("George Orwell");
            libro1.setAno(1949);
            libro1.setNumPaginas((int) 328);
            libro1.setValoracion(4.8);

            // Mostrar libro1 modificado
            System.out.println("Libro 1 (modificado):");
            libro1.amosar();
        }
    }


