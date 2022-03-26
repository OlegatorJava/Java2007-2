package lesson2;

public class ArraySum {
    public void arraySum(String [][] arr){
    try {
        System.out.println(array(arr));
    }
         catch (MyArrayDataException data) {
        data.printStackTrace();
        System.out.println("преобразование в Integer не удалось");
    }catch (MyArraysSizeException size) {
        size.printStackTrace();
        System.out.println("Массив должен быть размера [4][4]");}

        System.out.println("продолжаем работать"); //это просто для наглядности мне
}

    public int array(String[][] arr) throws MyArraysSizeException, MyArrayDataException{
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length != 4 || arr[j].length != 4){
                    throw new MyArraysSizeException("массив размера [" + arr.length + "]" + "[" + arr[i].length + "]");
                }try {
                    sum += (Integer.parseInt(arr[i][j]));
                }catch (Exception exp){
                    System.out.println("сумма всех значений до ошибки = " + sum);
                    throw new MyArrayDataException(getMessageErrorData(i,j));
                }
            }
        }
        return sum;
    }

    public String getMessageErrorData(int i, int j){
        String s = ("Неверные данные в ячейке " + "["+i+"]" + "["+j+"]");
        return s;
    }
}
