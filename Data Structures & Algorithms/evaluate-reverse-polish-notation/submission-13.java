class Solution {
    public boolean isOperator(String token)
    {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
    public int evalRPN(String[] tokens) {
        /** 
        Push all numbers
        when hit operator, grab last two numbers and operate.
        push result back
        */
        ArrayList<Integer> list = new ArrayList<>();
        for(String token: tokens)
        {
            if(!isOperator(token))
            {
                list.add(Integer.parseInt(token));
            } else{
                // operate
                System.out.printf("Op: %s", token);
                System.out.printf(", %s",list);

                int a = list.get(list.size()-2);
                int b = list.get(list.size()-1);
                list.remove(list.size()-1);
                list.remove(list.size()-1);

                System.out.printf(", a: %d , b: %d", a,b);
                if(token.equals("+"))
                {
                    list.add(a+b);
                } else if(token.equals("-"))
                {
                    list.add(a-b);
                } else if(token.equals("*"))
                {
                    list.add(a*b);
                } else
                {
                    list.add(a/b);
                }
                System.out.printf(", After: %s\n",list);

            }
        }
        return list.get(0);
    }
}
