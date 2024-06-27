class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> temp = new HashSet<>();
        int i = 0;

        while(temp.size() < candyType.length/2 && i<candyType.length){
            temp.add(candyType[i++]);
        }
        return temp.size();
    }
}
