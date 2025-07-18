class Solution {
    public int solution(int[] nums) {
        //조합 문제, 3개라는 개수가 정해져있으므로 재귀보다 반복문이 더 효율적이라고 판단
        int answer = 0;
        int num = 0;
        
        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i+1; j < nums.length - 1; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    num =  nums[i] + nums[j] + nums[k];
                    if (isPrime(num)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    
    public boolean isPrime(int num) {
        if (num <= 1) return false;
        
        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}