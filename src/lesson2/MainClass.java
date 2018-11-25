package lesson2;

public class MainClass {
    public static void main(String[] args) {
        String[][] arr2=
                {
                        {"1","16","598","6"},
                        {"15","-4","0","17"},
                        {"3","17","90","-3"},
                        {"15","16","4","0"}
                };
        processingArray(arr2);

    }

    public static void processingArray(String[][] array) throws MyException {
        if (array.length != 4 || array[0].length != 4 || array[1].length != 4 || array[2].length != 4 || array[3].length != 4 )  {
            throw new MyArraySizeException();
        }

        int sum = 0;

        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        System.out.println("Сумма элементов массива: " + sum);
    }
}
