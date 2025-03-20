/** HERENCIA

  Permite crear jerarquía de clases para reutillizar
  código y modelar relaciones " es-un ", por ejemplo; un LibroDigital
  *es un* tipo de Libro.


 */

public class LibroDigital extends Libro{
    private String formato; // PDF...

    /**

     * CONSTRUCTOR de una clase que se extiende de otra

      Se utiliza una palabra clave en java para referirse a la clase padre
      ( o superclase ) desde una clase hija ( subclase ), accediendo así a
      metodos o atributos de la clase padre

     * @param titulo
     * @param autor
     * @param ano
     * @param numPaginas
     * @param valoracion
     * @param formato
     */

    public LibroDigital(String titulo, String autor, int ano, int numPaginas, double valoracion, String formato) {
        super(titulo, autor, ano, numPaginas, valoracion); // Llama al constructor del padre, es decir el constructor que está en Libro
        this.formato = formato;
    }


    /** POLIMORFISMO

     * Permite que objetos de diferentes clases respondan al mismo
     * método pero de manera específica ( es decir, de formas distintas )

     */

    //Sobrescritura
    @Override
    public void amosar() {
        super.amosar(); // Llama al método de la clase padre
        System.out.println("Formato: " + formato); // Añade información específica
    }
}

