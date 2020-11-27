class Solution {
	public int[] solution(int[] prices) {
		int [] answer = new int[prices.length];
		int count = 1;      
		
		for (int i = 0; i < prices.length; i++) {
			if (i == prices.length - 1) {
				answer[i] = 0;
				break;
			}
			
			for ( int j = i+1; j < prices.length; j++) {
				if (j == prices.length - 1) {
					answer[i] = count;
					break;
				}else {
					if (prices[i] <= prices[j] ) {
						count = count + 1;
						
					}else {
						
						answer[i] = count;
						break;				
					}
				}
			}
			count = 1;
			
			
		}
		return answer;
	}
}
	