package by.overone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

//DTO - Data Transfer Object. Простой класс для передачи определенных полей Entity, к примеру
//В отличие от Entity, он не привязан к БД, класс используется только внутри Java приложения

@Data //Добавляет @Getter на все поля, @Setter на все не final поля + @RequiredArgsConstructor
//@RequiredArgsConstructor - добавляет конструктор с final и @NotNull полями
@AllArgsConstructor //Соответственно
public class Guy {
    private String name;
    private int age;
}
