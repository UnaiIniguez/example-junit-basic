package es.deusto.testing.junit;

public class Viaje {

    private String origen;
    private String destino;
    private int distancia;
    private int tiempoEstimado;
    private Conductor conductor;

    public Viaje(String origen, String destino, int distancia, int tiempoEstimado, Conductor conductor) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.tiempoEstimado = tiempoEstimado;
        this.conductor = conductor;
    }

    // Getters y Stters
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    // toString method
    @Override
    public String toString() {
        return "Viaje{" +
                "origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", distancia=" + distancia +
                ", tiempoEstimado=" + tiempoEstimado +
                ", conductor=" + conductor +
                  '}';
    }
    
}
