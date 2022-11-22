import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> list=new ArrayList<Integer>();
            
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(!list.contains(numbers[i]+numbers[j]))
                    list.add(numbers[i]+numbers[j]);
            }
        }
        
        answer=new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
