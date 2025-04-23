package br.edu.ifsp.user_api.util;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import br.edu.ifsp.user_api.model.User;

@Component
public class UserDataSource {
    private List<User> datasource;

    public UserDataSource() {
        datasource = new ArrayList<>();
    }

    public List<User> getDataSource() {
        return datasource;
    }

    public void add(User user) {
        datasource.add(user);
    }

    public void initializeTestData() {
        for (int i = 1; i <= 5; i++) {
            User user = new User();
            user.setId(i);
            user.setLogin("user" + i);
            user.setPassword("pass" + i);
            datasource.add(user);
        }
    }
}