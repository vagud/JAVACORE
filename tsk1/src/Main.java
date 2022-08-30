class Main {
    public static void main(String[] args) {
        int[][] a = new int[5][5];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < a.length; i++, System.out.println()) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
        int counter = 0;
        int sum = 0;
        int min = a[0][0];
        int max = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (min > a[i][j]) {
                    min = a[i][j];
                }
                if (max < a[i][j]) {
                    max = a[i][j];
                }
                sum = sum + a[i][j];
                counter++;
            }
        }
        System.out.println("min num " + min);
        System.out.println("max num " + max);
        System.out.println("average num " + sum/counter);
    }
}