
public class MinHeap {
    int a[];
    public MinHeap(int[] a){
        this.a = a;
    }

    public static void heapify(int[] a, int i, int n){
        int smallest = i;
        int left = 2*i +1;
        int right = 2*i+2;

        if(left < n && a[left] < a[i]){
            smallest = left;
        }
        if(right < n && a[right] < a[smallest]){
            smallest = right;
        }

        if(i != smallest){
            int temp = a[i];
            a[i] = a[smallest];
            a[smallest] = temp;

            heapify(a, smallest, n);
        }

    }


    public static void main(String[] args){
        int[] a = {5,4,3,2,1,6,7};
        MinHeap mh = new MinHeap(a);
        int n = a.length;
        int nonLeafNodes = n/2-1;

        for(int i=nonLeafNodes;i>=0;i--){
            heapify(a, i, n);
        }

        for (int j : a) {
            System.out.println(j + " ");
        }
    }
}
