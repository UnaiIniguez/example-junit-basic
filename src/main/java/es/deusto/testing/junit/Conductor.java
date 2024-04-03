package es.deusto.testing.junit;

public class Conductor {
    
    private String nombre; 
    private String dni;   
    private String password;
    private String email;
    private Camion camion;

    public Conductor(String nombre, String dni, Camion camion) {
        this.nombre = nombre;
        this.dni = dni;
        this.camion = camion;
    }

    // Getters y Stters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Camion getCamion() {
        return camion;
    }

    public void setCamion(Camion camion) {
        this.camion = camion;
    }

    // toString method
    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", camion=" + camion +
                '}';
    }


}
