class Solution {
    public int theMaximumAchievableX(int num, int t) {

        if(num + t*2 > num - t*2) {
            return num + t*2;
        }
        return num - t*2;
    }
}
