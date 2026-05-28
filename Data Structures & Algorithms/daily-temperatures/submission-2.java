class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        ArrayDeque<int[]> stack = new ArrayDeque<>();

        /***
        
        iterate
        track indices on stack
        if bigger than the top
        difference is amt of days
        then pop
        else push the index
        */
        int[] result = new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++)
        {
            while(!stack.isEmpty() && temperatures[i] > stack.peek()[0])
            {
                int[] pair = stack.pop();
                result[pair[1]] = i - pair[1];
            }
            stack.push(new int[] {temperatures[i], i});
        }

        return result;
        

    }
}
