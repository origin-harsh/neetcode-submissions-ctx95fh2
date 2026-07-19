class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {

            while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {

                if (stack.peek() < -a) {
                    stack.pop();
                    continue;
                } 
                else if (stack.peek() == -a) {
                    stack.pop();
                }

                a = 0;
                break;
            }

            if (a != 0) {
                stack.push(a);
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}