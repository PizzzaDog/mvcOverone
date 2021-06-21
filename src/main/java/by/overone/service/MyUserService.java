package by.overone.service;

import by.overone.entity.MyUser;
import by.overone.repository.MyUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Показывает спрингу, что класс выполняет бизнес логику приложения
@RequiredArgsConstructor
public class MyUserService {
    private final MyUserRepository userRepository;

    public MyUser createUser(MyUser user) {
        return userRepository.save(user);
    }

    public List<MyUser> getAllUsers() {
        return userRepository.findAll();
    }
}
