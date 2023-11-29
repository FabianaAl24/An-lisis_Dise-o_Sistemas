package Proyecto;
public class Alumno {
 
 String Alumno;
 int Dni;
 int Grado;
 String Seccion;
 String Fecha;
 String Genero;
 int Codigo;

    public Alumno(String Alumno, int dni, int Grado, String Seccion, String Fecha, String Genero, int Codigo) {
        this.Alumno = Alumno;
        this.Dni = dni;
        this.Grado = Grado;
        this.Seccion = Seccion;
        this.Fecha = Fecha;
        this.Genero = Genero;
        this.Codigo = Codigo;
    }

    public String getAlumno() {
        return Alumno;
    }

    public void setAlumno(String Alumno) {
        this.Alumno = Alumno;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public int getGrado() {
        return Grado;
    }

    public void setGrado(int Grado) {
        this.Grado = Grado;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Alumno=" + Alumno + ", dni=" + Dni + ", Grado=" + Grado + ", Seccion=" + Seccion + ", Fecha=" + Fecha + ", Genero=" + Genero + ", Codigo=" + Codigo + '}';
    }
}
