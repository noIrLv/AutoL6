package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TransferPage {
    private final SelenideElement heading = $("[data-test-id=dashboard]");
    private static final SelenideElement amountInput = $("[data-test-id='amount'] input");
    private static final SelenideElement fromInput = $("[data-test-id='from'] input");
    private static final SelenideElement transferHead = $("[data-test-id='action-transfer']");


    public TransferPage() {
        heading.shouldBe(Condition.visible);
    }

    public static DashboardPage cardReplenishment(int amount, String number) {
        amountInput.setValue(String.valueOf(amount));
        fromInput.setValue(number);
        transferHead.click();
        return new DashboardPage();
    }
}