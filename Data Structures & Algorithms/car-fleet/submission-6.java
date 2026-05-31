class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] cars = new int[n][2];
        for(int i=0; i<n; i++)
        {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        // cars loaded, now sort
        Arrays.sort(cars, (a,b) -> Integer.compare(a[0],b[0]));

     
// have a stack of cars, if collide pop it
        Deque<int[]> stack = new ArrayDeque<>();
        stack.push(new int[]{cars[n-1][0], cars[n-1][1]});
        for(int i=n-2; i>=0; i--)
        {
            double t1 = (target-cars[i][0])/(double)(cars[i][1]); // current time
            double t2 = (target-stack.peek()[0])/(double) stack.peek()[1]; // top time
            stack.push(new int[]{cars[i][0], cars[i][1]});
            // if faster, pop it
            if(t1<=t2) stack.pop();
        }

        return stack.size();

    }
}
