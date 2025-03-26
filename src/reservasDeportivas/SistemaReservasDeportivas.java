package reservasDeportivas;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class SistemaReservasDeportivas {

    GestorIluminacion data = new GestorIluminacion();
	static final int MAX_PISTAS = 10; // Asumimos un máximo de 10 pistas
    /**
     * Crea un nuevo array y un boolean para el estado de iluminación
     */
    public SistemaReservasDeportivas() {
        data.reservas = new ArrayList<>();
        data.iluminacion = new boolean[MAX_PISTAS];
    }
    /**
     * reserva una pista si está disponible
     * @param idPista introduce el id de la pista
     * @param fecha la fecha de reserva 
     * @param duracion la duración de la reserva
     * 
     * @return devuelve verdadero si se puede reservar, falso si no
     */
    public boolean reservarPista(Reserva reserva) {
        if (reserva.getIdPista() < 0 || reserva.getIdPista() >= MAX_PISTAS) {
            return false; // ID de pista inválido
        }
        LocalDateTime fecha = null;
		for (Reserva r : data.reservas) {
            if (r.getIdPista() == reserva.getIdPista() && r.getFecha().equals(fecha)) {
                return false; // La pista ya está reservada en esa fecha
            }
        }
        data.reservas.add(reserva);
        return true;
    }

    /**
     * cancela la reserva
     * @param idReserva id de la reserva
     * @return devuelve true si se puede cancelar la reserva
     */
    public boolean cancelarReserva(int idReserva) {
        for (int i = 0; i < data.reservas.size(); i++) {
            if (data.reservas.get(i).getIdPista() == idReserva) {
                data.reservas.remove(i);
                return true;
            }
        }
        return false; // No se encontró la reserva
    }

    /**
     * verifica si la piestá está disponible para reservar
     * @param idPista id de la pista
     * @param fecha fecha de la reserva
     * @param hora hora de la reserva
     * @return devuelve true si está disponible para reservar
     */
    public boolean verificarDisponibilidad(int idPista, LocalDateTime fecha, String hora) {
        if (idPista < 0 || idPista >= MAX_PISTAS) {
            return false; // ID de pista inválido
        }
        for (Reserva r : data.reservas) {
            if (r.getIdPista() == idPista && r.getFecha().equals(fecha)) {
                return false; // La pista no está disponible en esa fecha
            }
        }
        return true; // La pista está disponible
    }
    
}