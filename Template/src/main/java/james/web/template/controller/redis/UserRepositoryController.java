package james.web.template.controller.redis;

import james.web.template.controller.base.BaseController;
import james.web.template.controller.base.CommonResponse;
import james.web.template.controller.base.ReturnCode;
import james.web.template.entity.redis.User;
import james.web.template.service.redis.IUserRepository;

import java.util.concurrent.atomic.AtomicLong;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class UserRepositoryController extends BaseController {
    private static final Logger logger = Logger.getLogger(UserRepositoryController.class);
    private static final AtomicLong counter = new AtomicLong();

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    public void setUserRepository(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public CommonResponse<Void> monthlyDistrictInfo() {
        return this.buildResponse(ReturnCode.SUCCESS);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable Long id) {
        return userRepository.getUser(id);
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public User saveUser() {
        return userRepository.saveUser(counter.getAndIncrement());
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteUser(id);
    }
}
