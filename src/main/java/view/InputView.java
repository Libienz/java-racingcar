package view;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);

    public String requestCarName() {
        return scanner.nextLine();
    }

    public String requestMoveCount() {
        return scanner.nextLine();
    }
}
