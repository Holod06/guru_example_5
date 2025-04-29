import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class elementAction {
    @Test
    void action(){
        // открыть страницу
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // Перетаскиваем прямоугольник A на место B
        actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).release().perform();
        // Проверяем, что прямоугольники поменялись местами
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));

    }

    @Test
        void dragAndDrop() {
            // Открываем страницу с элементами
            //open("https://the-internet.herokuapp.com/drag_and_drop");
            // Перетаскиваем прямоугольник A на место B. Не работает
            // $("#column-a").dragAndDrop($("#column-b"));
            // Проверяем, что прямоугольники поменялись местами
            //$("#column-a").shouldHave(text("B"));
            //$("#column-b").shouldHave(text("A"));
        }


}
