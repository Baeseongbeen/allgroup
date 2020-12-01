import java.util.*;

class Solution {
public int solution(int[] scoville, int K) {
    int answer = 0;
    PriorityQueue<Integer> Queue = new PriorityQueue<>();

    for (int i : scoville){
        Queue.add(i);
    }
    while(Queue.size() > 1 && Queue.peek() < K){
        int first = Queue.poll();
        int second = Queue.poll();
        Queue.add(first + (second * 2));
        answer = answer + 1;
    }
    if (Queue.peek() < K){
        return -1;
    }
    return answer;
    }
}