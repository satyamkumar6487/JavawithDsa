public class TargetIndex {

    public static void main (String [] args){

        int [] arr = {1,2,3,4,5,6,7,8};
        int idx = 0;
        int target = 4;

        int res = firstIndex(arr , idx, target) ;
        System.out.println(res);

    }


    static  int firstIndex(int [] arr , int idx , int target ){

        if (idx ==arr.length){

            return -1 ;

        }


        if (arr[idx] == target){
            return  idx;
        } else {
          int check =   firstIndex(arr, idx + 1,  + target);
                return check;
            }
        }

    }


