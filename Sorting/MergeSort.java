/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 * youtube.com/@senacademia
 *
 * @author dsr
 */
public class MergeSort {

    public static void mergeSort(int[] arr, int kiri, int kanan) {//membagi array secara rekursif
        if (kiri < kanan) {//masih ada lebih dari 1 elemen
            int tengah = (kiri + kanan) / 2; // (0+3)/2 = 1 -> bagian kiri [0 - 1], bagian kanan [2 - 3]

            mergeSort(arr, kiri, tengah);//mengurutkan array bagian kiri secara rekursif
            mergeSort(arr, tengah + 1, kanan);//mengurutkan array bagian kanan secara rekursif

            gabung(arr, kiri, tengah, kanan);
        }
    }
//    mergeSort([5,2,8,1], 0, 3)
//        mergeSort([5,2], 0, 1)
//            mergeSort([5], 0, 0) -> stop
//            mergeSort([2], 1, 1) -> stop
//            gabung([5] dan [2]) -> [2,5]
//    
//        mergeSort([8,1], 2, 3)
//            mergeSort([8], 2, 2) -> stop
//            mergeSort([1], 3, 3) -> stop
//            gabung([8] dan [1] -> [1,8]
//            
//        gabung([2,5] dan [1,8]) -> [1,2,5,8]

    public static void gabung(int[] arr, int kiri, int tengah, int kanan) {//menggabungkan 2 bagian array yang sudah terurut
        int[] temp = new int[kanan - kiri + 1];
//        kiri = 0, kanan = 3 -> temp = 3 - 0 + 1 = 4 elemen
//        temp = [_, _, _, _]

        int i = kiri;//pointer array bagian kiri
        int j = tengah + 1;//pointer array bagian kanan
        int k = 0;//pointer array temp

//        bagian kiri = [2,5] -> sudah terurut
//        bagian kanan = [1,8] -> sudah terurut
////        [2, 5, 1, 8]
//           ↑     ↑
//           i=0   j=2
        
        while(i <= tengah && j <= kanan){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        
//        iterasi 1 -> arr[0]=2 vs arr[2]=1 -> 1 lebih kecil -> temp = [1, _, _, _] -> j bergerak ke 3, k bergerak ke 1
//        iterasi 2 -> arr[0]=2 vs arr[3]=8 -> 2 lebih kecil -> temp = [1, 2, _, _] -> i bergerak ke 1, k bergerak ke 2
//        iterasi 3 -> arr[1]=5 vs arr[3]=8 -> 5 lebih kecil -> temp = [1, 2, 5, _] -> i bergerak ke 2, k bergerak ke 3
//        iterasi 4 -> i=2 tengah=1 -> looping berhenti
//                temp = [1, 2, 5, _]

        while(i <= tengah){//copy elemen dari bagian kiri (kalau ada)
            temp[k] = arr[i];
            i++;
            k++;
        }
        
        //copy elemen dari bagian kanan (kalau ada)
//        3 <= 3  -> t
        while(j <= kanan){ 
            temp[k] = arr[j];//temp[3] = arr[3] -> temp = [1, 2, 5, 8]
            j++;
            k++;
        }
        
        //copy elemen yang sudah terurut dari variabel temp ke variabel arr
        for (int x = 0; x < temp.length; x++) {
            arr[kiri + x] = temp[x];//kenapa arr[kiri + x] bukan arr[x]
            //jika kiri =4 kanan=7 -> temp[0] harus arr[4] bukan arr[0], temp[1] harus arr[5] bukan arr[1]
        }
        
    }
    public static void cetakArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    

    public static void main(String[] args) {
//        [38, 27, 43, 3] -> [38, 27] dan [43, 3]
//        [38, 27] -> [38] dan [27]
//        [43, 3] -> [43] dan [3]
//                
//        [38] dan [27] -> [27, 38]
//        [43] dan [3] -> [3, 43]
//        [27, 38] dan [3, 43] -> [3, 27, 38, 43]

        int[] data = {38, 27, 43, 3};
        System.out.println("Sebelum terurut:");
        cetakArr(data);
        
        mergeSort(data, 0, data.length -1);
        
        System.out.println("Setelah terurut:");
        cetakArr(data);
    }
    
   
}
