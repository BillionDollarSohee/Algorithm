import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        // 배열을 List로 변환
        List<Integer> lostList = new ArrayList<>();
        for (int l : lost) lostList.add(l);

        List<Integer> reserveList = new ArrayList<>();
        for (int r : reserve) reserveList.add(r);

        // 여벌도 있고 잃어버린 학생 제거 (자기만 입음)
        Iterator<Integer> it = lostList.iterator();
        while (it.hasNext()) {
            int l = it.next();
            if (reserveList.contains(l)) {
                reserveList.remove((Integer) l);   // reserve에서도 제거
                it.remove();                       // lost에서도 제거
            }
        }

        // 진짜로 빌려야 하는 학생들 처리
        Collections.sort(lostList);    // 정렬
        Collections.sort(reserveList);

        for (int i = 0; i < lostList.size(); i++) {
            int student = lostList.get(i);

            // 앞번호 학생에게 빌릴 수 있는지 확인
            if (reserveList.contains(student - 1)) {
                reserveList.remove((Integer) (student - 1));
            }
            // 뒷번호 학생에게 빌릴 수 있는지 확인
            else if (reserveList.contains(student + 1)) {
                reserveList.remove((Integer) (student + 1));
            }
            // 앞뒤 모두 불가능 → 이 학생은 수업 못 들음
            else {
                n--;
            }
        }

        return n; // 수업 들을 수 있는 학생 수
    }
}
