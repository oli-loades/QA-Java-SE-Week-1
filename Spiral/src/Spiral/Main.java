package Spiral;

public class Main {

    public static void main(String[] args) {
        spiral(3);
    }

    public static void spiral(int x){
        int largest = x*x;
        int matrix[][] = new int[x][x];
        int middle = x/2;

        for (int i = 0; i < x;i++){
            for (int j = 0; j < x;j++){
                if(i==0){
                    matrix[i][j] = j+1;
                }else if(i==middle &&j == middle){
                        matrix[i][j] = largest;
                }else if(j==x-1) {
                        matrix[i][j] = i + j + 1;
                }else if(j==0){
                    matrix[i][j] = largest - i;
                }else{
                    matrix[i][j] = i*x;
                }
            }
        }

        for(int i = 0; i< x;i++) {
            for (int j = 0; j < x ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }




    }
}
