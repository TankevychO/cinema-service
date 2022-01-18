package cinema.config;

import cinema.model.Role;
import cinema.model.RoleEnum;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(RoleEnum.ADMIN);
        roleService.add(adminRole);

        Role userRole = new Role();
        userRole.setRoleName(RoleEnum.USER);
        roleService.add(userRole);

        User admin = new User();
        admin.setEmail("Admin@gmail.com");
        admin.setPassword("Admin1234");
        admin.setRoles(Set.of(adminRole));
        userService.add(admin);

        User bob = new User();
        bob.setEmail("Bob@gmail.com");
        bob.setPassword("Bob1234");
        bob.setRoles(Set.of(userRole));
        userService.add(bob);
    }
}
