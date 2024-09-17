import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        // int 배열을 String 배열로 변환
        String[] strNums = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNums[i] = String.valueOf(numbers[i]);
        }
        
        // 두 숫자를 이어 붙였을 때 더 큰 순서대로 정렬
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));
        
        // 정렬된 값이 모두 "0"일 경우 "0" 반환
        if (strNums[0].equals("0")) return "0";
        
        // 정렬된 숫자를 순서대로 이어 붙여 가장 큰 수 생성
        StringBuilder sb = new StringBuilder();
        for (String n : strNums) {
            sb.append(n);
        }
        
        return sb.toString();
    }
}