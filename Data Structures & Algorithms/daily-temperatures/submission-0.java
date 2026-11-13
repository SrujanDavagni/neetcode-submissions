class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(temp[j] > temp[i]){
                    res[i] = j - i;
                    break;
                }
            }
        }
        return res;
    }
}