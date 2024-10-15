public class democlass {

    public static int sumOfArray(int[] a){
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[]={1,6,9,5,0};
        System.out.println(sumOfArray(arr));
    }
}
