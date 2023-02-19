public class RepeatedNTimes{
//leetcode 961
    public int repeatedNTimes(int[] nums) {
        int halfOfArray =  nums.length/2;

        HashMap<Integer,Integer> frequencies = new HashMap<>();

        for (int num : nums) {
            if (frequencies.containsKey(num))
                frequencies.put(num, frequencies.get(num) + 1);
            else
                frequencies.put(num, 1);
        }

        for(int i: frequencies.keySet()){
            if (frequencies.get(i) == halfOfArray)
                return i;
        }
        return -1;
    }

}
