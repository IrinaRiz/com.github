package githubProject;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PricingTest {

    @BeforeAll
    static void configure(){
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void searchPricing(){
        open("https://github.com");
        $(byText("Pricing")).hover();
        $(byText("Compare plans")).click();
        $("h1.h2-mktg").shouldHave(text("Choose the plan that’s right for you."));
    }
}
