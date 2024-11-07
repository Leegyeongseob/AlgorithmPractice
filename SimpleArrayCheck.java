public class SimpleArrayCheck {

    public static void main(String[] args) {

        int arr[] = {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        SimpleArrayCheck simpleArrayCheck = new SimpleArrayCheck();
        System.out.print(simpleArrayCheck.isMonitoring(arr));

    }
    public boolean isMonitoring(int[] arr){
        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 1 ; i < arr.length;i++){
            if(arr[i] < arr[i-1]){
                increasing = false;
            }
            if(arr[i] > arr[i-1]){
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }

}
