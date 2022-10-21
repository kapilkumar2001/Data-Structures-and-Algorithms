import java.util.*;

/*
PROBLEM:-
You are conducting a contest at your college. This contest consists of two problems and  participants. You know the problem that a candidate will solve during the contest.

You provide a balloon to a participant after he or she solves a problem. There are only green and purple-colored balloons available in a market. Each problem must have a balloon associated with it as a prize for solving that specific problem. You can distribute balloons to each participant by performing the following operation:
1. Use green-colored balloons for the first problem and purple-colored balloons for the second problem
2. Use purple-colored balloons for the first problem and green-colored balloons for the second problem

You are given the cost of each balloon and problems that each participant solve. Your task is to print the minimum price that you have to pay while purchasing balloons.

Input Format:-
First line: T that denotes the number of test cases (1 <=T <= 10)
For each test case: 
First line: Cost of green and purple-colored balloons 
Second line: n that denotes the number of participants (1 <= n <= 10)
Next n lines: Contain the status of users. For example, if the value of the jth integer in the ith row is 0, then it depicts that the ith participant has not solved the jth problem. Similarly, if the value of the jth integer in the ith row is 1, then it depicts that the ith participant has solved the jth problem.

Output Format:-
For each test case, print the minimum cost that you have to pay to purchase balloons.
*/

class BalloonCost {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0)
        {
            t--;
            int gc = sc.nextInt();
            int pc = sc.nextInt();
            int n = sc.nextInt();
            int sum1 = 0;
            int sum2 = 0;
            for(int i = 0; i < n; i++)
            {
                sum1 += sc.nextInt();
                sum2 += sc.nextInt();
            }
            int cost = 0;
            if(sum1 > sum2)
            {
                if(gc < pc)
                    cost = sum1*gc + sum2*pc;
                else
                    cost = sum1*pc + sum2*gc;
            }
            else if(sum2 > sum1)
            {
                if(gc < pc)
                    cost = sum1*pc + sum2*gc;
                else
                    cost = sum2*pc + sum1*gc;
            }
            else
            {
                if(gc > pc)
                    cost = sum1*gc + sum1*pc;
                else
                    cost = sum1*gc + sum2*pc;
            }
            System.out.println(cost);
        }
        sc.close();
    }
}
