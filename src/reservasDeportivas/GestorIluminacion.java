package reservasDeportivas;

import java.util.List;

public class GestorIluminacion {
	public List<Reserva> reservas;
	public boolean[] iluminacion;

	public GestorIluminacion() {
	}

	/**
	 * Activa la iluminación para la pista
	 * @param sistemaReservasDeportivas TODO
	 * @param idPista id de la pista
	 * @return devuelve true si se puede encender la luz
	 */
	public boolean endenderLuces(SistemaReservasDeportivas sistemaReservasDeportivas, int idPista) {
	    if (idPista < 0 || idPista >= SistemaReservasDeportivas.MAX_PISTAS) {
	        return false; // ID de pista inválido
	    }
	    iluminacion[idPista] = true;
	    return true;
	}

	/**
	 * desactiava la iluminación de la pista
	 * @param sistemaReservasDeportivas TODO
	 * @param idPista id de la pista
	 * @return devuelve verdadero s se puede apagar la luz
	 */
	public boolean apagarLuces(SistemaReservasDeportivas sistemaReservasDeportivas, int idPista) {
	    if (idPista < 0 || idPista >= SistemaReservasDeportivas.MAX_PISTAS) {
	        return false; // ID de pista inválido
	    }
	    iluminacion[idPista] = false;
	    return true;
	}
}