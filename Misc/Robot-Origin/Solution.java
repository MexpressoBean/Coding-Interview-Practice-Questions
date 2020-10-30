class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0; // x and y variables represent origin(0,0) on graph
        int y = 0; // (0,0) is starting point

        for(char move: moves.toCharArray()) // For each 'move' inside the moves string
        {
            if(move == 'U')
            {
                y++; // Up by 1 on y axis
            }
            else if(move == 'D')
            {
                y--; // Down by 1 on y axis
            }
            else if(move == 'L')
            {
                x--; // Left by 1 on x axis
            }
            else if(move == 'R')
            {
                x++; // Right by 1 on x axis
            }

        }

        return (x == 0 && y == 0); // If both x and y equal 0
                                   // the robot is at its origin
                                   // returns true if so
    }
}
