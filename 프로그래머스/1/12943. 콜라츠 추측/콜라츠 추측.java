class Solution {
    public int solution(int num) {
        long bignum = num;
        int answer = -1;
        
        if(num==1) {
            return 0;
        }
        
        for(int i = 0; i < 500; i++) {
            if(bignum%2==0) {
                bignum = bignum/2;
            } else if(bignum%2!=0 && bignum > 0){
                bignum = bignum*3+1;
            }
            if(bignum==1) {
                return i+1;
            }
        }
        
        return answer;
    }
}