package app.ecofast.eventoapp.application.repository;

import org.springframework.data.repository.CrudRepository;

import app.ecofast.eventoapp.application.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {
	Evento findByCodigo(long codigo);
}
