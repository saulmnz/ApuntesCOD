import java.time.Year;

public class Libro {

    // 1. Atributos (Variables de instancia)

    /**

     * VARIABLES :

     - Las variables pertenecen a una clase y
       representan las características o propiedades que describen
       el estado de un objeto.

     *  ¿ POR QUÉ SON PRIVATE ?
       Principalmente por la encapsulación; se ocultan los datos internos
       para que no se modifiquen directamente ( no se podrá acceder a estas
       variables desde otras clases o paquetes ), pudiendo decidir así
       qué atributos son modificables (con setters) y cuáles son
       de solo lectura (solo getters).

       Para acceder a estas variables necesitaremos MÉTODOS CONTROLADOS:
       ( GETTERS / SETTERS )

     */

    private String titulo;
    private String autor;
    private int ano;
    private int numPaginas;
    private double valoracion;




    // 2. Constructores

    /**

     * CONSTRUCTORES POR DEFECTO

     *  Función :
        Crea un objeto con valores vacíos.

     */


    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.ano = 0;
        this.numPaginas = 0;
        this.valoracion = 0;
    }


    // 2.1 Constructor parametrizado

    /**

     * INTRODUCIMOS EL CONSTRUCTOR PARAMETRIZADO :
     * Inicializa el objeto creado con valores específicos.
     * Esto crea objetos directamente con sus datos esenciales, es decir
     * no necesitamos utilizar un setAutor, setTtitulo para darle un nuevo valor
     * a la variable vacía inicializada, si utilizamos un constructor parametrizado
     * le introduciremos los parámetros directamente

     * ( EJEMPLO EN *Principal.java )

     * @param titulo
     * @param autor
     * @param ano
     * @param numPaginas
     */

    public Libro(String titulo, String autor, int ano, int numPaginas, double valoracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
        this.valoracion = valoracion;
    }

    // 3. Métodos de acceso (getters y setters)

    // Son métodos públicos que permiten acceder ( leer ) y modificar ( escribir )
    // los valores de atributos privados de una clase

    /** GETTERS

     * Función : Retorna el valor de un atributo privado

     * PARTES CLAVE :
     * Visibilidad : ( public ) Para que este método sea accesible desde cualquier clase
     * Tipo de retorno : Coincide con el tipo de atributo  ( String por ejemplo si nos referimos al título )
     * Nombre : El nombre tiene que ser por convención get + NombreAtributo ( Formato CamelCase ) ; Ejemplo ( getTitulo )
     * Cuerpo : Simplemente retorna el valor del atributo = > ( return this.titulo; )

     * @return
     */

    public String getTitulo() {
        return titulo;
    }


    /** SETTERS

     * Función : Retorna el valor de un atributo privado


     * PARTES CLAVE :
     * Visibilidad : ( public ) Para que este método sea accesible desde cualquier clase
     * Tipo de retorno : void ( no retorna nada )
     * Nombre : El nombre tiene que ser por convención set + NombreAtributo ( Formato CamelCase ) ; Ejemplo ( getTitulo )
     * Parámetro : Recibe el nuevo valor del atributo.

     * Encapsulación : Al usar setters se controla como se modifican los datos
     * Por ejemplo:

      public void setAno(int ano) {
          if (ano >= 0) {
             this.ano = ano;
          } else {
              System.out.println("Año no válido");
          }
      }

     * @param titulo
     */


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }




    // 4. MÉTODOS

    /**

     * Función :  Definen el comportamiento de los objetos
     * 2 TIPOS :

            De acceso : Getters y setters
            De instancia : Realizan acciones basadas en el estado del objeto

            Ejemplo:
                 // Método para aumentar la valoración del libro
                 public void incrementarValoracion(double incremento) {
                     if (incremento > 0) {
                         this.valoracion += incremento;
                         }
                 }
     *
     */

    public void amosar() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + ano);
        System.out.println("Páginas: " + numPaginas);
        System.out.println("Valoración: " + valoracion + "\n");
    }


    // Método para verificar si el libro es clásico (más de 50 años)

    public boolean esClasico() {
        int anoActual = Year.now().getValue();
        return (anoActual - this.ano) > 50;
    }
}
