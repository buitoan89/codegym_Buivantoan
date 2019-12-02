package bai_tap_giai_thuat;

public class Bai11 {
    public static void main(String[] args) {
        int arr=0;
        int[] array1 = {12,13,4,6,9};
        int k =13;
        for (int i=0;i<array1.length;i++){
            if (array1[i]%2!=0){
            arr=arr+array1[i];
            }
        }
        System.out.println(arr);

        for (int i=0;i<array1.length;i++){
            if (array1[i]==13){
                System.out.println("vi tri" +i);
            }
                    }



        // sắp xếp dãy số theo thứ tự tăng dần
//        sortASC(arr);
//        System.out.println("Dãy số được sắp xếp tăng dần: ");
//        show(arr);


//    public static void sortASC(int [] arr) {
//        int temp = arr[0];
//        for (int i = 0 ; i < array1.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
    }


    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }



}


}

 }