public class Matrix {
    float[][] mat1;
    int rowSize;
    int colSize;

    public Matrix(float[][] mat1, int rowSize, int colSize) {
        this.mat1 = mat1;
        this.rowSize = rowSize;
        this.colSize = colSize;
    }

    public int rowSize(float[][] M){
        if(rowSize == mat1.length){
            return rowSize;
        }
        else{
            System.out.println("Строки не совпадают");
            return 0;
        }

    }

    public int colSize(float[][] M){
        if(colSize == mat1[0].length){
            return colSize;
        }
        else{
            System.out.println("Столбцы не совпадают");
            return 0;
        }
    }

    public void addition(float[][] M){
        try {
            float C[][] = new float[rowSize(M)][colSize(M)];

            for (int i = 0; i < rowSize; i++)
                for (int j = 0; j < colSize; j++)
                    C[i][j] = (int) (this.mat1[i][j]) + M[i][j];

            print(C);
        }
        catch (Exception exception){
            System.out.println("Ошибка");
        }
    }

    public void multiplicationNum(float[][] M, int num){
        try {
            float C[][] = new float[rowSize(M)][colSize(M)];

            for (int i = 0; i < rowSize; i++)
                for (int j = 0; j < colSize; j++)
                    C[i][j] = (int) (this.mat1[i][j]) * num;

            print(C);
        }
        catch (Exception exception){
            System.out.println("Ошибка");
        }
    }

    public void multiplication(float[][] M){
        try {
            if(mat1[0].length == M.length){
                float C[][] = new float[mat1.length][M[0].length];

                for (int i = 0; i < rowSize; i++)
                    for (int j = 0; j < colSize; j++)
                        for (int k = 0; k < mat1[0].length; k++)
                            C[i][j] = C[i][j] + mat1[i][k] * M[k][j];
                print(C);
            }
            else{
                System.out.println("Нельзя умножить!");
            }
        }
        catch (Exception exception){
            System.out.println("Ошибка");
        }
    }

    public void print(float[][] M){
        for (int i = 0; i < rowSize(M); i++) {
            for (int j = 0; j < colSize(M); j++)
                System.out.print(M[i][j] + " ");

            System.out.println();
        }
        System.out.println();
    }
}