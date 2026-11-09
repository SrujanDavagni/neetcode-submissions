class Solution {
    public int evalRPN(String[] tokens) {
        HashSet<String> hs = new HashSet<>();
        hs.add("+");
        hs.add("-");
        hs.add("*");
        hs.add("/");
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            if(!hs.contains(token)){
                int num = Integer.parseInt(token);
                stack.push(num);
            }
            else{
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(calculate(num2, num1, token));
            }
        }
        return stack.peek();
    }
    public int calculate(int num1, int num2, String operator){
        return switch(operator){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> {
                if(num2 == 0) throw new ArithmeticException("Cant divide by 0");
                yield num1 / num2;
            }
            default -> throw new IllegalArgumentException("Operator not valid");
        };
    }
}
