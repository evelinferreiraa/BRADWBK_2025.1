package br.edu.ifsp.user_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.ifsp.user_api.model.User;
import br.edu.ifsp.user_api.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getUserList() {
        return userRepository.getAllUsers();
    }

    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }

    public User updateUser(int id, User updatedUser) {
        User existingUser = userRepository.getUserById(id);
        if (existingUser != null) {
            existingUser.setLogin(updatedUser.getLogin());
            existingUser.setPassword(updatedUser.getPassword());
            return existingUser;
        }
        return null;
    }

    public boolean deleteUser(int id) {
        User userToDelete = userRepository.getUserById(id);
        if (userToDelete != null) {
            userRepository.deleteUser(id);
            return true;
        }
        return false;
    }
}