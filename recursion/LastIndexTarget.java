public class LastIndexTarget {

    public static void main (String [] args){

        int [] arr = {1,2,3,4,5,6,4,1,2,4,5,67,8,7};

        int idx = 0 ;
        int target = 4 ;

int res = lastindextarget(arr , idx, target);
System.out.println(res);

    }

    static  int lastindextarget(int arr [] , int idx, int target ){

if (idx == arr.length ){
    return -1 ;

}
 int    check = lastindextarget(arr , idx +  1 , target);
if (check != -1){
    return check;
}

if (arr[idx] == target){
    return idx ;

} else {
    return -1;
}
        }


    }

