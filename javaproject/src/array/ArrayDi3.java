package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];

        int i = 1;
        //순서대로 1씩 증가하는 값을 입력한다.
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                arr[row][col] = i++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
