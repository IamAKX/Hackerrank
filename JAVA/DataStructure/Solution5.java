/*
 * Problem name : Java 1D Array (Part 2) 
 */
package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class JumpGame {

	public Boolean canReach(List<Integer> input, Integer m) {
		Set<Integer> visited = new HashSet<Integer>();
		return canReach(input,m,0, visited);
	}

	private Boolean canReach(List<Integer> input, Integer jumpSteps, int currentPosition, Set<Integer> visited) {
		if(currentPosition<0)
			return false;
		if(currentPosition>=input.size())
			return true;
		visited.add(currentPosition);
		if(currentPosition==input.size()-1 && input.get(currentPosition) == 0)
			return true;
		if(input.get(currentPosition) == 1)
			return false;
		return ((!visited.contains(currentPosition+jumpSteps) && canReach(input,jumpSteps,currentPosition+jumpSteps,visited)) ||
				(!visited.contains(currentPosition+1) && canReach(input,jumpSteps,currentPosition+1,visited)) ||
				(!visited.contains(currentPosition-1) && canReach(input,jumpSteps,currentPosition-1,visited))
				);
	}

}

public class Solution5 {

    public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input;
            int testCases = Integer.parseInt(input = br.readLine());
            JumpGame jumpGame = new JumpGame();
            while(testCases-- > 0) {
            	Integer arraySize = null;
            	Integer jumpSteps = null;
                if ((input = br.readLine()) != null) {
                	String[] splited = input.split("\\s+");
                	arraySize = Integer.parseInt(splited[0]);
                	jumpSteps = Integer.parseInt(splited[1]);
                }
                List<Integer> arrayInput = new ArrayList<Integer>();
                if ((input = br.readLine()) != null) {
                	
                	String[] splited = input.split("\\s+");
                	for(int i=0;i<arraySize;i++) {
                		arrayInput.add(Integer.parseInt(splited[i]));
                	}
                }
                System.out.println(jumpGame.canReach(arrayInput, jumpSteps) ? "YES" : "NO");
            }
		} catch(IOException io){
            io.printStackTrace();
        }
    }
}