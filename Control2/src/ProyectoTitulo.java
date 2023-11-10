import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ProyectoTitulo {
    private String titulo;
    private String tipo;
    private String profesorGuia;
    private Date fechaPublicacion;
    private ArrayList<String> autores;
    private ArrayList<ProyectoTitulo> proyectoTitulos = new ArrayList<>();

    public ProyectoTitulo(){

    }
    public ProyectoTitulo(String titulo, String tipo, String profesorGuia, Date fechaPublicacion, ArrayList<String> autores) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.profesorGuia = profesorGuia;
        this.fechaPublicacion = fechaPublicacion;
        this.autores = autores;
    }

    public void agregarProyectoTitulo(){
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese titulo: ");
        String titulo = input.nextLine();
        System.out.print("Ingrese tipo: ");
        String tipo = input.nextLine();
        System.out.print("Ingrese profesor guia: ");
        String profesorGuia = input.nextLine();
        System.out.print("Ingrese fecha publicacion (dd/MM/yy): ");
        String fecha = input.nextLine();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.fechaPublicacion = formato.parse(fecha);
        }catch (ParseException e){
            System.out.println("Error al convertir fecha. Formato incorrecto");
        }

        System.out.print("Ingrese autores cantidad autores: ");
        int cant = input.nextInt();
        input.nextLine();

        for(int i = 0 ; i<cant ; i++){
            System.out.print("Nombre autor = ");
            String autor = input.nextLine();

            autores.add(autor);
        }

        proyectoTitulos.add(new ProyectoTitulo(titulo, tipo, profesorGuia, this.fechaPublicacion, this.autores));
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProfesorGuia() {
        return profesorGuia;
    }

    public void setProfesorGuia(String profesorGuia) {
        this.profesorGuia = profesorGuia;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }
}
