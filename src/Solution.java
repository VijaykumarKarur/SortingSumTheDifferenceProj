import java.util.Arrays;

public class Solution {

    public int multiply(int a, int b, int mod){
        int result = 0;
        a = a % mod;
        while(b > 0){
            if((b & 1) != 0){
                result = (result + a) % mod;
            }
            b = b >> 1;
            a = (a * 2) % mod;
        }
        return result;
    }
    public int power(int x, int y, int mod){
        int result = 1;
        x = x % mod;
        if(x == 0){
            return 0;
        }
        while(y > 0){
            if((y & 1) != 0){
                result = (result * x) % mod;
            }
            y = y >> 1;
            x = (x * x) % mod;
        }
        return result;
    }
    public int solve(int[] A) {
        Arrays.sort(A);
        int sum = 0;
        final int MOD = 1000000007;
        int len = A.length;
        for(int index = len - 1; index >= 0; index--){
            int temp = multiply(power(2, index - 0, MOD) - power(2, len - 1 - index, MOD), A[index], MOD);
            sum = ((sum % MOD) + (temp % MOD))%MOD;
        }
        return sum;
    }
}
