class Solution {

    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();

        for (String x : tokens){

            if (x.equals("+")){
                int l = stack.pop();
                int r = stack.pop();
                stack.push(l + r);

            }else if(x.equals("-")){
                int l = stack.pop();
                int r = stack.pop();
                stack.push(r - l);

            }else if(x.equals("*")){
                int l = stack.pop();
                int r = stack.pop();
                stack.push(l * r);

            }else if(x.equals("/")){
                int l = stack.pop();
                int r = stack.pop();
                stack.push(r / l);

            }else{
                stack.push(Integer.parseInt(x));
            }
        }

        return stack.peek();

        
        
    }
}
