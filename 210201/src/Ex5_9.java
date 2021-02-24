public class Ex5_9 {
    public static void main(String[] args) {
        char[][] star = {
                {'*', '*', ' ', ' ', ' '},
                {'*', '*', ' ', ' ', ' '},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'} //[4][5]행렬
        };
        char[][] result = new char[star[0].length][star.length];

        for (int i = 0; i < star.length; i++) { //세로 0, 1, 2, 3
            for (int j = 0; j < star[i].length; j++) { //0, 1, 2, 3, 4
                System.out.print(star[i][j]);
                Math.random()
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                result[j][i] = star[3-i][j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    } // end of main [3][5] > [5][2]
} // end of class     [4][2] > [2][1]