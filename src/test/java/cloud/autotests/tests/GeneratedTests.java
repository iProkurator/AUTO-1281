package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {

    @Test
    @Description("Autogenerated test")
    @DisplayName("Проверяем текст заголовка вакансии")
    void titleTest() {
        step("Открываем страницу ваканции 'https://hh.ru/vacancy/67766510'", () ->
            open("https://hh.ru/vacancy/67766510"));

        step("Заголовок содержит 'Вакансия QA Automation Engineer (backend) в Москве, работа в компании Талала'", () -> {
            String expectedTitle = "Вакансия QA Automation Engineer (backend) в Москве, работа в компании Талала";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Лог консоли не содержит ошибок")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://hh.ru/vacancy/67766510'", () ->
            open("https://hh.ru/vacancy/67766510"));

        step("В логах консоли нет текста 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }

    @Test
    @DisplayName("Проверка опыта работы")
    void generatedTest1() {

        step("Открыть страницу вакансии", () -> Selenide.open("https://hh.ru/vacancy/67766510"));

        step("Проверить текст", () -> {
            $x("//span[text()='1–3 года']").shouldHave(text("1–3"));
        });

    }

    @Test
    @DisplayName("Проверка заполнения поля значением email")
    void generatedTest2() {
        step("Открыть страницу вакансии", () -> Selenide.open("https://hh.ru/vacancy/67766510"));

        step("Нажать кнопку откликнуться", () -> $(".bloko-form-item").click());

        step("Вводим корректный email", () -> {
            $("[name=login]").setValue("pilatov@yandex.ru");
        });

        step("Вводим некорректный email", () -> {
            $("[name=login]").setValue("!!!pilatovyandex.com");
        });

        step("Нажимаем Продолжить", () -> $(".signup-submit").click());

        step("Проверить текст ошибки", () -> {
            $x("//*[@class=\"bloko-form-error bloko-form-error_entering\"]").shouldHave(text("Пожалуйста, укажите email или телефон"));
        });
    }

    @Test
    @DisplayName("Проверка типа занятости")
    void generatedTest4() {

        step("Открыть страницу вакaнсии", () -> Selenide.open("https://hh.ru/vacancy/67766510"));

        step("Проверить текст", () -> {
            $x("//span[text()='полный день']").shouldHave(text("полный день"));
        });

    }

}