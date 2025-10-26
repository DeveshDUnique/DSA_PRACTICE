package NormllyAskedQuestions;

public class Robber 
{
    public static int rob(int [] arr)
    {
        int currentHouse = 0;
        int nextHouse = 0;

        for(int money : arr)
        {
/// calculated by adding the amount of money in the current house (money) to the maximum amount that can be robbed from the next house (nextHouse)
            int maxCurrentHome = nextHouse + money; 

/// This is because, if the current house is not robbed, then the maximum amount of money that can be robbed from 
//the next house would be the same as the maximum amount that can be robbed from the current house. So, nextHouse effectively represents the maximum amount of money that can be robbed if the robber decides to skip the current house and move on to the next one.
            nextHouse = Math.max(currentHouse, nextHouse);

//robCurrent stores the maximum amount of money that can be robbed if the current house is indeed robbed. It is updated to store the value of maxIfRobCurrent, which represents the maximum amount of money that can be robbed if the current house is robbed.

            currentHouse = maxCurrentHome;

        }

        return Math.max(currentHouse, nextHouse);
    }


    public static void main(String[] args) 
    {
        int num1[] = {1,2,3,1};
        System.out.println("Max amount of money robber = " + rob(num1));

       
    }


    
}
