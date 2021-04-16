package br.com.lutadores.lutadoresprova.repositorio;

import br.com.lutadores.lutadoresprova.dominio.Lutador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LutadorRepository extends JpaRepository<Lutador,Integer> {
}
