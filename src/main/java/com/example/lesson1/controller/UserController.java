package com.example.lesson1.controller;

import com.example.lesson1.dto.UserDto;
import com.example.lesson1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Отмечаем класс, как контроллер
// Аннотация @RestController включает в себя аннотацию @Controller and @ResponseBody
// Упрощает создание контроллера
// При использовании @RestController, использовать аннотацию @ResponseBody нет необходимости
@RestController
// Класс контроллера
public class UserController {

    @Autowired
    private UserService userService;

    // Сопоставляем GET запрос на адрес /users с обработчиком
    @GetMapping("/users")
    // Обработчик
    // Привязываем параметр запроса к параметру метода
    // и задаём значение по умолчанию
    public String welcomeUser(@RequestParam(value = "name", defaultValue = "anonimus") String name) {
        return String.format("Welcome, %s!", name);
    }

    @PostMapping("/users")
    public String createUser(@RequestBody UserDto userDto) {
        userService.createUser(userDto);
        return "OK";
    }
}