package es.deusto.testing.junit;

public class Trailer {
    
    private String matricula;
    private String marca;
    private String modelo;
    private int cargaMaxima; 
    
    public Trailer(String matricula, String marca, String modelo, int cargaMaxima) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
    }

    // Getters y Stters

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public String toString() {
        return "Trailer{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cargaMaxima=" + cargaMaxima +
                '}';
    }

}
