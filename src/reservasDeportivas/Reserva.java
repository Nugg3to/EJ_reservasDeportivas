package reservasDeportivas;

import java.time.LocalDateTime;

public class Reserva {
    private int idPista;
    private String fecha;
    private int duracion;

    /**
     * crea una reserva dera una pista
     * @param idPista id de la pista
     * @param fecha2 fecha de la reserva
     * @param duracion duracion de la reserva
     */
    public Reserva(int idPista, LocalDateTime fecha2, int duracion) {
        this.idPista = idPista;
        this.fecha = fecha2;
        this.duracion = duracion;
    }
    /**
     * recoge la id de la pista
     * @return devuelve la id
     */

    public int getIdPista() {
        return idPista;
    }

    /**
     * recoge la fecha de reserva
     * @return devuelve la fecha de reserva
     */
    public String getFecha() {
        return fecha;
    }
    
    /**
     * recoge la duracion de la reserva
     * @return devuelve la duración de la reserva
     */
    public int getDuracion() {
        return duracion;
    }
}
