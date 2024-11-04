package lotto.enums;

public enum OutputMessage {
    PURCHASE_AMOUNT_PROMPT("구입금액을 입력해 주세요."),
    PURCHASED_LOTTO_COUNT("개를 구매했습니다."),
    WINNING_NUMBERS_PROMPT_MESSAGE("당첨 번호를 입력해 주세요."),
    BONUS_NUMBER_PROMPT_MESSAGE("보너스 번호를 입력해 주세요.");
    private final String text;

    OutputMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
