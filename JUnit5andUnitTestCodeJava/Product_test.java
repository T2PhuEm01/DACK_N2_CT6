public class Product_test {
    static  String arr[][]=new String[20][3];
    static int a=-1;
    public static void product(String ten,String gia,String soluong)
    {
        boolean zzz = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][0] == ten)
            {
                zzz = false;
                int a =Integer.parseInt(arr[i][2])+Integer.parseInt(soluong);
                arr[i][2]= String.valueOf(a);
            }
        }
        if(zzz ==true) {
                a++;
                arr[a][0]=ten;
                arr[a][1]=gia;
                arr[a][2]=soluong;
            }
    }
    public static int thanhtien(){
        int tam=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][0]!= null){

                tam += (Integer.parseInt(arr[i][1])*Integer.parseInt(arr[i][2]));


            }
        }
        return tam;
    }
    public static void showInfo(){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][0]!= null)
            {
                for (int j = 0; j < 3; j++) {
                    System.out.println(arr[i][j]);
                }
            }

        }
    }


    public static String  search(String value){
        String h="no item search";
        for (int i = 0; i < arr.length; i++) {
          if(arr[i][0]!=null)
          {
              if(arr[i][0].indexOf(value)!=-1)
              {
                  h=arr[i][0];
              }
          }
        }
       return h;
    }


}
