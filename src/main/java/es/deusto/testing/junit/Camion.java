package es.deusto.testing.junit;

public class Camion {

    private String matricula;
    private String marca;
    private String modelo;
    private int cargaMaxima;
    private Trailer trailer; 
    
    public Camion(String matricula, String marca, String modelo, int cargaMaxima, Trailer trailer) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
        this.trailer = trailer;
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

    public Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }


    @Override
    public String toString() {
        return "Camion{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cargaMaxima=" + cargaMaxima +
                ", trailer=" + trailer +
                '}';
    }

    
}
