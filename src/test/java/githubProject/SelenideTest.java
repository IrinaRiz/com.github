package githubProject;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {

    @Test
    void searchSelenide() {
        open("https://github.com");

        $("[placeholder='Search GitHub']").setValue("Selenide").pressEnter();
        $("a[class='menu-item'][href='/search?q=Selenide&type=wikis']").click();
        $("#wiki_search_results").shouldHave(text("SoftAssertions"));
        $("a[title='SoftAssertions']").click();
        $("#wiki-content").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
