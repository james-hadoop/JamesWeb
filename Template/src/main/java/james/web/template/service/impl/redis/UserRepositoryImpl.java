package james.web.template.service.impl.redis;

import james.web.template.entity.redis.User;
import james.web.template.service.redis.IUserRepository;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class UserRepositoryImpl implements IUserRepository {
    private static final Logger logger = Logger.getLogger(UserRepositoryImpl.class);

    @Override
    public User saveUser(Long id) {
        logger.debug("Saving user...");
        User user = new User();
        user.setId(id);
        return user;
    }

    @Override
    public User getUser(Long id) {
        logger.debug("Retrieving user...");
        User user = new User();
        user.setId(id);
        return user;
    }

    @Override
    public void deleteUser(Long id) {
        logger.debug("Deleting user...");
        // delete user
    }
}
