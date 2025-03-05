package SistemaMedico.repository;


import SistemaMedico.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
    Optional<Rol> findByNombre(String nombre);
   // Rol findByNombre(String nombre);  // Método para buscar un rol por su nombre
}