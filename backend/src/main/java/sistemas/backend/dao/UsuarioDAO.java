package sistemas.backend.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import sistemas.backend.entity.Usuario;

public class UsuarioDAO {

	private static EntityManager em;

	public List<Usuario> listarUsuarios() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("backendPU");
		em = emf.createEntityManager();

		String jpql = "select usu from Usuario usu ";
		// jpql = jpql + "where usu.cpf = :cpf ";
		jpql = jpql + "order by usu.nome asc";
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		// query.setParameter("cpf", cpf);

		return query.getResultList();
	}

}
