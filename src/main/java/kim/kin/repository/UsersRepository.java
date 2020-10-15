package kim.kin.repository;

import kim.kin.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersRepository extends CrudRepository<User, Integer> {

	User findByUsername(String username);

}
