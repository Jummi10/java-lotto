package ui;

public class Message {

    public enum InputMessage {
        INPUT_PURCHASE_PRICE("구입금액을 입력해 주세요."),
        INPUT_LAST_WEEK_WINNING_NUMBERS("\n지난 주 당첨 번호를 입력해 주세요."),
        INPUT_BONUS_BALL("보너스 볼을 입력해 주세요.");

        private String message;

        InputMessage(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    public enum OutputMessage {
        PURCHASED_COUNT("개를 구매했습니다."),
        WINNING_STATISTICS("\n당첨 통계\n"),
        BOUNDARY_LINE("---------\n"),
        MATCH_COUNT("개 일치 ("),
        MATCH_COUNT_BONUS("개 일치, 보너스 볼 일치("),
        WON("원)- "),
        COUNT("개\n"),
        TOTAL_EARNINGS_RATE("총 수익률은 "),
        CLOSING_MENTION("입니다.(1 기준)");

        private String message;

        OutputMessage(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    public enum ExceptionMessage {
        MUST_BUY_MORE_THAN_ONE_TICKET("한 장 이상 구매하셔야 합니다."),
        DUPLICATE_NUMBERS("중복 번호를 입력할 수 없습니다."),
        BONUS_NUMBER_CANNOT_EQUAL_WINNING_NUMBERS("당첨 번호와 일치하는 보너스 번호는 입력할 수 없습니다."),
        MUST_INPUT_NUMBERS_IN_VALID_RANGE("1과 45 사이 번호를 입력해야 합니다."),
        MUST_INPUT_SIX_WINNING_NUMBERS("6개의 당첨 번호를 입력해야 합니다."),
        INPUT_ONLY_NUMBERS_AND_COMMA("숫자와 , 이외의 문자는 입력할 수 없습니다.");

        private String message;

        ExceptionMessage(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
