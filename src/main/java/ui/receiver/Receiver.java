package ui.receiver;

import java.util.Scanner;

import ui.Message;

public class Receiver {
    private static final Scanner SCANNER = new Scanner(System.in);

    public int receivePurchasePrice() {
        System.out.println(Message.InputMessage.INPUT_PURCHASE_PRICE.getMessage());
        return SCANNER.nextInt();
    }

    public String receiveWinningNumbers() {
        System.out.println(Message.InputMessage.INPUT_LAST_WEEK_WINNING_NUMBERS.getMessage());
        SCANNER.nextLine();
        return SCANNER.nextLine();
    }

    public int receiveBonusNumber() {
        System.out.println(Message.InputMessage.INPUT_BONUS_BALL.getMessage());
        return SCANNER.nextInt();
    }
}