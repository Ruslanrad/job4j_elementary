package ru.job4j.loop;

public class Frame {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                boolean isTopOrBottomBorder = false;
                boolean isSideBorder = false;
                if (row == 0 || row == size - 1) {
                    isTopOrBottomBorder = true;
                }
                if (col == 0 || col == size - 1) {
                    isSideBorder = true;
                }
                if (isTopOrBottomBorder && isSideBorder) {
                    System.out.print("+");
                } else if (isTopOrBottomBorder) {
                    System.out.print("-");
                } else if (isSideBorder) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Draw frame of size 3");
        draw(3);
        System.out.println("Draw frame of size 5");
        draw(5);
    }
}
