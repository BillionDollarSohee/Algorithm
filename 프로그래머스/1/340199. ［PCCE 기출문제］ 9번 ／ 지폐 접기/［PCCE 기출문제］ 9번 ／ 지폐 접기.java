class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        int walletLong = Math.max(wallet[0], wallet[1]);
        int walletShort = Math.min(wallet[0], wallet[1]);

        int bill0 = bill[0];
        int bill1 = bill[1];

        while (true) {
            int billLong = Math.max(bill0, bill1);
            int billShort = Math.min(bill0, bill1);

            if (billLong <= walletLong && billShort <= walletShort) {
                break;
            }

            if (bill0 >= bill1) {
                bill0 /= 2;
            } else {
                bill1 /= 2;
            }

            answer++;
        }

        return answer;
    }
}