import Utils.Chromerunner;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Test_2 extends Chromerunner {
    @Test
    public void eeTest_2(){
        System.setProperty("selenide.browserSize", "1980x1080");
        open("https://ee.ge/");
        $(By.id("rcc-confirm-button")).click();
        $(byText("რეგისტრაცია")).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible, Duration.ofMillis(5000));
        $(By.id("singup")).shouldBe(Condition.disabled);
        $(By.id("firstName")).click();
        $(By.id("lastName")).click();
        $(byText("სახელი სავალდებულოა")).shouldBe(Condition.visible);
        $(By.id("lastName")).click();
        $(By.id("firstName")).click();
        $(byText("გვარი სავალდებულოა")).shouldBe(Condition.visible);
        $(By.id("email")).click();
        $(By.id("firstName")).click();
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $(By.id("password")).click();
        $(By.id("firstName")).click();
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(By.id("confirmPassword")).click();
        $(By.id("firstName")).click();
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
        $(By.id("email")).setValue("ksjafkjdfhbv");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $(By.id("password")).setValue("kdjkf");
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(By.id("password")).setValue("kdjkf");
        $(By.id("confirmPassword")).setValue("sdvhsijsi");
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
    }
}
