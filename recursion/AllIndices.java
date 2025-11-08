public class AllIndices {

    public static void main (String [] args ){


        int [] arr = {4 ,9 , 8, 3 , 5, 9, 7, 5, 2,5 ,5,6,7,8};

        int idx = 0 ;
        int target =  5 ;

        int  fsf = 0 ;

        int [] result = allindices(arr , target , idx , fsf );

        for(int val : result){
            System.out.println(val);
        }

    }

    public static int [] allindices(int [] arr , int target ,int idx , int fsf){
        if (idx == arr.length){
            return  new int [fsf];
        }

        if(arr[idx] == target){
            int   [] iarr= allindices(arr ,target , idx + 1 , fsf+ 1);

                iarr[fsf] = idx;
                return iarr;
            } else {
            int [] iarr = allindices(arr , target , idx + 1, fsf);

            return iarr;
        }





    }






}
