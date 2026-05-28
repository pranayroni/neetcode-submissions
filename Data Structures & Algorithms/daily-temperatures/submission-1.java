class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        ArrayDeque<Integer> list = new ArrayDeque<>();

        for(int i = temperatures.length-1; i>=0; i--)
        { // walk back
            if(i==temperatures.length-1)
            { // end of list
                list.push(0);
            }
            else
            {
                int counter = 0;
                boolean found = false;
                for(int j = i+1; j<temperatures.length; j++)
                { // walk forward until higher temp and count days
                counter++;
                    if(temperatures[j]>temperatures[i]) // found the warmer day
                    {
                        found = true;
                        break;
                    }
                }
                list.push(found ? counter : 0);
            }
        }

        Object[] arr = list.toArray();
        int[] result = new int[temperatures.length];
        for(int i=0; i<result.length; i++)
        {
            result[i] = (int)arr[i];
        }
        return result;

    }
}
