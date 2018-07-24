public class J22_5 {
    public static void main(String[] args) {
        String zm1 = "zmienna globalna";
        String zm2;
        String zm3;
        if (zm1.length()>2){
            zm2 = "zmienna w if";
        }
        for (int i = 0; i<5;i++){
            zm3 = "zmienna w for";
            System.out.println(zm3 + i);
        }
//        System.out.println(zm1+zm2+zm3);
//        System.out.println(zm2);
//        System.out.println(zm3);
    }
}
