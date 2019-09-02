package app.ecofast.eventoapp.application.repository;

import org.springframework.data.repository.CrudRepository;

import app.ecofast.eventoapp.application.models.Convidado;
import app.ecofast.eventoapp.application.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
	Iterable<Convidado> findByEvento(Evento evento);
}
