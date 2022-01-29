import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int empty = 0;
        Scanner cell = new Scanner(System.in);
        char[] game = {' ',' ',' ',' ',' ',' ',' ',' ',' '};

        System.out.println("---------");
        System.out.print("| ");
        for (int i = 0; i < game.length; i++) {

            if (i % 3 == 0 && i != 0) {
                System.out.print("|" + "\n" + "| ");
            }
            System.out.print(game[i] + " ");
        }
        System.out.print("|");
        System.out.println("\n" + "---------");

        int k = 0;
        boolean stillPlay = true;
        do {
            System.out.print("Enter the coordinates: ");
            String digit = cell.nextLine();
            String [] coordinate = digit.split(" ");
            char [] coord = digit.toCharArray();

            int c1 = Integer.parseInt(coordinate[0]);
            int c2 = Integer.parseInt(coordinate[1]);


            if (!Character.isDigit(coord[0]) || !Character.isDigit(coord[2]))  {
                System.out.println("You should enter numbers!"); continue;
            }

            if (((c1 < 1) || (c1 > 3)) || ((c2 < 1) || (c2 > 3))) {
                System.out.println("Coordinates should be from 1 to 3!"); continue;
            }

            if ((c1==1 && c2==1 && game[0]!=' ') || (c1==1 && c2==2 && game[1]!=' ') || (c1==1 && c2==3 && game[2]!=' ') || (c1==2 && c2==1 && game[3]!=' ') || (c1==2 && c2==2 && game[4]!=' ') || (c1==2 && c2==3 && game[5]!=' ') || (c1==3 && c2==1 && game[6]!=' ') || (c1==3 && c2==2 && game[7]!=' ') || (c1==3 && c2==3 && game[8]!=' ') ) {
                System.out.println("This cell is occupied! Choose another one!"); continue;
            }

            k = k +1;

            if (c1 == 1 && c2 == 1) {
                if (k%2==0) {
                    game[0] = 'O';
                } else game[0] = 'X';

            }

            if (c1 == 1 && c2 == 2) {
                if (k%2==0) {
                    game[1] = 'O';
                } else {
                    game[1] = 'X';
                }
            }

            if (c1 == 1 && c2 == 3) {
                if (k%2==0) {
                    game[2] = 'O';
                } else {
                    game[2] = 'X';
                }
            }

            if (c1 == 2 && c2 == 1) {
                if (k%2==0) {
                    game[3] = 'O';
                } else {
                    game[3] = 'X';
                }
            }

            if (c1 == 2 && c2 == 2) {
                if (k%2==0) {
                    game[4] = 'O';
                } else {
                    game[4] = 'X';
                }
            }

            if (c1 == 2 && c2 == 3) {
                if (k%2==0) {
                    game[5] = 'O';
                } else {
                    game[5] = 'X';
                }
            }

            if (c1 == 3 && c2 == 1) {
                if (k%2==0) {
                    game[6] = 'O';
                } else {
                    game[6] = 'X';
                }
            }

            if (c1 == 3 && c2 == 2) {
                if (k%2==0) {
                    game[7] = 'O';
                } else {
                    game[7] = 'X';
                }
            }

            if (c1 == 3 && c2 == 3) {
                if (k%2==0) {
                    game[8] = 'O';
                } else {
                    game[8] = 'X';
                }
            }

            System.out.println("---------");
            System.out.print("| ");
            for (int i = 0; i < game.length; i++) {

                if (i % 3 == 0 && i != 0) {
                    System.out.print("|" + "\n" + "| ");
                }
                System.out.print(game[i] + " ");
            }
            System.out.print("|");
            System.out.println("\n" + "---------");

            for (int i = 0; i < game.length; i++) {

                if (game[i] == ' ') {
                    empty++;
                }
            }


            if (winO(game)) { stillPlay = false;
                System.out.println("O wins");
            }
            if (winX(game)) { stillPlay = false;
                System.out.println("X wins");
            }

            if (!winX(game) && !winO(game) && empty==0) {
                stillPlay=false;
            }

        } while (stillPlay);


    }

    public static boolean winX (char [] game) {
        if ((game[0] == game[4] && game[4] == game[8] && game[0] == 'X') || (game[2] == game[4] && game[4] == game[6] && game[2] == 'X') || (game[0] == game[3] && game[3] == game[6] && game[3] == 'X') || (game[1] == game[4] && game[4] == game[7] && game[4] == 'X') || (game[2] == game[5] && game[5] == game[8] && game[5] == 'X') || (game[0] == game[1] && game[1] == game[2] && game[1] == 'X') || (game[3] == game[4] && game[4] == game[5] && game[4] == 'X') || (game[6] == game[7] && game[7] == game[8] && game[7] == 'X'))
            return true;
        else return false;
    }

    public static boolean winO (char [] game) {
        return (game[0] == game[4] && game[4] == game[8] && game[0] == 'O') || (game[2] == game[4] && game[4] == game[6] && game[2] == 'O') || (game[0] == game[3] && game[3] == game[6] && game[3] == 'O') || (game[1] == game[4] && game[4] == game[7] && game[4] == 'O') || (game[2] == game[5] && game[5] == game[8] && game[5] == 'O') || (game[0] == game[1] && game[1] == game[2] && game[1] == 'O') || (game[3] == game[4] && game[4] == game[5] && game[4] == 'O') || (game[6] == game[7] && game[7] == game[8] && game[7] == 'O');

    }


}