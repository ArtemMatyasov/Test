public class FnMetod2 {
    public static void main(String[] args) {
        //Методы в Java. на практике
        //Сложение элементов массива
        byte[] nums1 = new byte[]{5, 6, 8};

        int summ1 = summaArray(nums1);
        System.out.println("Сумма 1: " + summ1);

        byte[] nums2 = new byte[]{5, 7, 23, 75, 6, 8};
        int summ2 = summaArray(nums2);
        System.out.println("Сумма 2: " + summ2);
    }

    public static int summaArray(byte[] arr) {
        int summa = 0;
        for (byte i = 0; i < arr.length; i++)
            summa += arr[i];

        return summa;
    }

}

