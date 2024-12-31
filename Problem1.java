public class FindMissingNumber {


    public int findMissingNum(int[] a){
        int low = 0;
        int high = a.length-1;
        int diff = a[low];
        while(low<=high){
            int mid = low +(high-low)/2;
            if(a[mid] - mid == diff){
                low = mid+1;
            }else if(a[mid] - mid == diff+1){
                if(a[mid] - a[mid-1] ==2 ){
                    return a[mid]-1;
                }
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] a = {3,4,5,6,7,8};
        FindMissingNumber fmn = new FindMissingNumber();
        System.out.println("Missing num "+fmn.findMissingNum(a));
    }
}

