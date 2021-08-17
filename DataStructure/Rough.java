package DataStructure;

public class Rough {
    public static void main(String[] args) {
        System.out.println(3 >>3);
        System.out.println(solve(2, 2, 3));
        System.out.println("x");
    }
    public static int solve(int a, int b, int target) {
        int count = 0;
        int i = 1;
        while(target !=0) {
            if ((target & 1) == 0) {
                if ((a & 1) != 0) {
                    count++;
                    System.out.print("x");

                }
                if ((b & 1) != 0) {
                    count++;
                    System.out.print("y");
                }
            } else {
                if ((a & 1) !=0) {
                    continue;
                } else if((b & 1) == 0) {

                    count++;
                    System.out.print("z");

                }
            }
            target = target >> i;
            a = a >> i;
            b = b >> i;
            i++;
        }
        System.out.print(a +" " + b+ " " +  target);
        return count;
    }
}
