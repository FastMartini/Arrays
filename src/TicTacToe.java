import java.util.Scanner;

public class TicTacToe {

    private static final int BOARD_SIZE = 3;

    private static void initializeBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private static void printBoard(char[][] board) {
        System.out.println("Board:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                if (j < board[i].length - 1) System.out.print("|");
            }
            System.out.println();
            if (i < board.length - 1) {
                System.out.println("-----");
            }
        }
    }

    private static boolean checkWin(char[][] board, char player) {
        // Check rows
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        // Check columns
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[BOARD_SIZE][BOARD_SIZE];
        char currentPlayer = 'X';
        boolean gameWon = false;
        int totalMoves = 0;

        // Initialize board
        initializeBoard(board);

        while (!gameWon && totalMoves < BOARD_SIZE * BOARD_SIZE) {
            printBoard(board);

            System.out.println("Player " + currentPlayer + ", enter your move (row and column, 0-" + (BOARD_SIZE - 1) + "): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter numbers between 0 and " + (BOARD_SIZE - 1) + ".");
                scanner.next(); // Consume invalid input
                continue;
            }

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row < 0 || row >= BOARD_SIZE || col < 0 || col >= BOARD_SIZE || board[row][col] != ' ') {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            board[row][col] = currentPlayer;
            totalMoves++;

            if (checkWin(board, currentPlayer)) {
                printBoard(board);
                System.out.println("Player " + currentPlayer + " wins!");
                gameWon = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        if (!gameWon) {
            printBoard(board);
            System.out.println("It's a draw!");
        }

        scanner.close();
    }
}

