package by.overone.repository;

import by.overone.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Показывает спрингу, что этот класс используется для обмена данными с БД
public interface MyUserRepository extends JpaRepository<MyUser, Integer> {
}
