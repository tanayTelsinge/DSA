package array.basics;

public class Traversals {
    
    public static void main(String[] args) {
        
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;

        for(int i = 0; i < n; i++) { //full scan 
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        //look back traversal (use i - 1)
        // use when comparison with previous element, detecting duplicates, consecutive ops.
        for(int i = 1; i < n; i++) { 
            //eg. if(arr[i - 1] < arr[i])
            System.out.print(arr[i - 1] + " ");
        }

        System.out.println();
        //look ahead traversal (i + 1)
        // pair check, swapping neighbours
        for(int i = 0; i < n - 1; i++) {
            //eg. if (arr[i] < arr[i + 1])
            System.out.print(arr[i + 1] + " ");
        }
    }
}
