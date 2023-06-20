package ru.neoflex.practice.controller;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
@OpenAPIDefinition(
        info = @Info(
                title = "Описание контроллера",
                contact = @Contact(
                        name = "Писаренко Артём",
                        email = "wwwartem04@ya.ru"
                )
        )
)
@Tag(name = "Калькулятор", description = "Позволяет складывать, вычитать числа")
public class CalcController {
    @GetMapping("/plus/{a}/{b}")
    @Operation(
            summary = "Сложение",
            description = "Позволяет вычислить сумму двух чисел"
    )
    public int plus(@PathVariable int a,@PathVariable int b){
        return a+b;
    }
    @GetMapping("/minus/{a}/{b}")
    @Operation(
            summary = "Вычитание",
            description = "Позволяет вычислить разность двух чисел"
    )
    public int minus(@PathVariable int a,
                        @PathVariable int b){
        return a-b;
    }
    }




