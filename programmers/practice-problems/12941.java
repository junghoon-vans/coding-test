import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        reverse(B);
        
        for (int i=0; i<A.length; i++) {
            answer += A[i] * B[i];
        }

        return answer;
    }
    
    private void reverse(int[] arr) {
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}
