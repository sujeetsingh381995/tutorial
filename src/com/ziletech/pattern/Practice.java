package com.ziletech.pattern;

public class Practice {
    public static void main(String[] args) {
        PrintA a = new PrintA();
        a.pattern(6);
        PrintB b = new PrintB();
        b.pattern(6);
        PrintC c = new PrintC();
        c.pattern(6);
        PrintD d = new PrintD();
        d.patter(10);
        PrintE e = new PrintE();
        e.patternJ(7);
        Diamond di = new Diamond();
        di.print(8);
        PrintI f = new PrintI();
        f.print(6);
        PrintJ j = new PrintJ();
        j.print(5           );
    }

}

class PrintA {

    public void pattern(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class PrintB {
    public void pattern(int num) {
        int num1 = num - 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j >= num1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            num1--;
        }

    }
}

class PrintC {
    public void pattern(int num) {
        int num1 = num - 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j >= num1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            num1--;
        }
    }
}

class PrintD {
    void patter(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 1; j < num; j++) {
                System.out.print(j);

            }
            System.out.println();
        }
    }
}

class PrintE {

    void patternJ(int num) {
        for (int i = 0; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (k == 0 || k == i || i == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class Diamond {
    public void print(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}

class PrintI {
    public void print(int num) {
        for (int i = 0; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}




class PrintJ {
    public void print(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = num; j >= i; j--) {
                if (j == num || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}

