package severo.prg;

/**
 * Clase para manejar las entradas de un blog.
 * La clase se creó el 06/02/2023 por Antonio M.
 * Esta es la versión 2.3
 */
public class EntradaBlogAMA {
    /**
     * separador es el ccarácter que separa ENTRADA DE del
     * nombre del autor
     */
    public static char separador=':';
    /**
     * id del post
     */
    private int id;
    /**
     * texto del post
     */
    private String texto;
    /**
     * autor del post
     */
    private String autor;

    /**
     * Constructor de la clase. recibe el número de entrada, el nombre del autor
     * de la entrada y el texto que contiene la entrada. Si el número de entrada
     * es negativo, lanza una excepción.
     * @param id int
     * @param autor String
     * @param texto String
     * @throws IllegalArgumentException El id no puede ser negativo
     */
    public EntradaBlogAMA(int id,String autor,String texto)throws IllegalArgumentException{
        if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id=id;
        this.autor=autor;
        this.texto=texto;
    }
    @Override
    public String toString(){
        String cad="";
        cad+="\nENTRADA DE"+separador+autor;
        cad+="\n "+texto;
        return cad;
    }

    /**
     * Devuelve el número de la entrada
     * @return int id del post
     */
    public int getId(){
        return this.id;
    }

    /**
     * devuelve el texto completo de la entrada
     * @return String contenido
     */
    public String getTexto(){
        return this.texto;
    }

    /**
     * devuelve el nombre del autor de la entrada en mayúsculas
     * @return String autor del post
     */
    public String getAutor(){
        return this.autor.toUpperCase();
    }

    /**
     * devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
     * @return String autor del post
     */
    public String devuelveAutor(){
        return this.autor;
    }

    /**
     * No tiene porqué tener argumentos.
     * @param args Argumentos cuando ejecutas el programa
     */
    public static void main(String[] args) {
        //Modificar.
        EntradaBlogAMA e1=new EntradaBlogAMA(1,"ana","Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
    }
}
