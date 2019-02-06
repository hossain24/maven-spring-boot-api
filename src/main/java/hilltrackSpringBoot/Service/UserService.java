package hilltrackSpringBoot.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hilltrackSpringBoot.DBM.UserDbm;
import hilltrackSpringBoot.Model.User;
import java.util.Collection;

@Service 
public class UserService {
	
	@Autowired
	private UserDbm userDbm;
	
	public Collection<User> getAllUsers(){
		return this.userDbm.getAllUsers();
	}
	
	public User getUserById(int id) {
		return this.userDbm.getUserById(id);
	}

	public void deleteUserById(int id) {
		this.userDbm.deleteUserById(id);
	}
	
	public void updateUser(User user) {
		this.userDbm.updateUser(user);
	}

	public void insertUser(User user) {
		this.userDbm.insertUser(user);
	}

	
}
