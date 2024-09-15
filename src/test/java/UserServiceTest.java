import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.vagapov.spring.config.AppConfig;
import ru.vagapov.spring.dto.User;
import ru.vagapov.spring.service.UserService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserServiceTest {

    private static final String LAST_NAME_TEST = "lastNameTest22";

    @Autowired
    private UserService userService;

    @Test
    void createUserUser() {
        User user = new User();
        user.setUserName("userNameTest1");
        user.setLastName("lastNameTest1");
        user.setEmail("emailTest1");
        user.setPassword("passwordTest1");
        user.setAge(56);

        userService.createUser(user);
        User newUser = userService.findUserByUserName(user.getUserName());

        Assert.assertEquals(user, newUser);
    }

    @Test
    void findAllUsers() {
        User user = new User();
        user.setUserName("userNameTest2");
        user.setLastName("lastNameTest22");
        user.setEmail("emailTest11");
        user.setPassword("passwordTest11");
        user.setAge(22);

        User user2 = new User();
        user2.setUserName("userNameTest3");
        user2.setLastName(LAST_NAME_TEST);
        user2.setEmail("emailTest11");
        user2.setPassword("passwordTest11");
        user2.setAge(23);

        User user3 = new User();
        user3.setUserName("userNameTest4");
        user3.setLastName("lastNameTest4");
        user3.setEmail("emailTest11");
        user3.setPassword("passwordTest11");
        user3.setAge(43);

        userService.createUser(user);
        userService.createUser(user2);
        List<User> newUsers = userService.findAllUsersByLastName(LAST_NAME_TEST);

        Assert.assertEquals(2, newUsers.size());
        Assert.assertTrue(newUsers.stream().allMatch(newUser -> newUser.equals(user) || newUser.equals(user2)));
    }
}
