import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class gitTest {

        @Test
        void testSearchGithub() {
            //ОткрытьGithub
            open("https://github.com");
            //Меню -> Solutions -> Enterprize (с помощью команды hover для Solutions)
            $(withText("Solutions")).hover();
            $(withText("Enterprises")).click();
            $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));
        }
}