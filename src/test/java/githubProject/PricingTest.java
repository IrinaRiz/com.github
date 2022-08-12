package githubProject;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PricingTest {

    @Test
    void searchPricing(){
        open("https://github.com");
        $(byText("Pricing")).hover();
        $("[href= '/pricing#compare-features']").shouldHave(text("Compare plans"));
    }
}
