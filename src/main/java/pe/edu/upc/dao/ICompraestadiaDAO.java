package pe.edu.upc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.entity.Compraestadia;
@Repository
public interface ICompraestadiaDAO extends JpaRepository<Compraestadia, Long> {
	List<Compraestadia> findAll();
}
