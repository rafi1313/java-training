public class J18 {
    public static void main(String[] args) {
        int[] liczby1 = {3,5,8};
        int[] liczby2 = {11,15,9};
        int suma=0;
//        for (int tmp:liczby1){
//            suma+=tmp;
//        }
//        for (int tmp:liczby2){
//            suma+=tmp;
//        }
        for(int i=0;i<liczby1.length;i++){
            suma+=liczby1[i];
            suma+=liczby2[i];
        }
        System.out.println("Suma liczb w tablicach wynosi: "+suma);





    }
}
