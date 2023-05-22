public class Main {
    public static void main(String[] args) {
        float[][] M = {{1, 2}, {3, 4}, {5, 6}};
        float[][] C = {{2, 2}, {2, 2}, {2, 2}};

        float[][] B = {{2, 2}, {2, 2}};

        Matrix mat1 = new Matrix(M, 3, 2);
        Matrix mat2 = new Matrix(C, 3, 2);
        Matrix mat3 = new Matrix(B, 2, 2);

        mat3.print(B);
        mat2.addition(M);
        mat2.multiplicationNum(M,3);
        mat1.multiplication(B);
    }
}