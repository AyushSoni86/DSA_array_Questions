package QuestionsTillLec19;

import java.util.ArrayList;

public class PaintersPartition {
    public static void main(String[] args) {

    }


        static boolean isPossible(ArrayList<Integer> boards, int painters, int mid){
            int paintersCount = 1;
            int boardSum = 0;
            for(int i = 0 ; i < boards.size(); i++){
                if(boardSum + boards.get(i) <= mid)
                    boardSum += boards.get(i);
                else{
                    paintersCount++;
                    if(paintersCount > painters || boards.get(i) > mid)
                        return false;
                    boardSum = boards.get(i);
                }
            }
            return true;
        }
        public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
        {
            int ans  = -1;
            int low = 0, sum = 0;
            for(int i = 0 ; i < boards.size() ; i++){
                sum += boards.get(i);
            }
            int high = sum;
            while(low <= high){
                int mid = low + (high - low)/2;
                if(isPossible(boards, k, mid)){
                    ans = mid;
                    high = mid - 1;
                }else
                    low = mid + 1;
            }
            return ans;
        }

}
