class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seenRooms = new boolean[rooms.size()]; // array stores T/F if the rooms have been                                                              // visited
        seenRooms[0] = true; // The first room (room 0) is accessible 
        
        Stack<Integer> keys = new Stack(); // This stack holds the keys to the rooms that have not yet                                            // been visited
        keys.add(0);
        
        
        while(!keys.isEmpty()) // while the keys stack is not empty, visiting all of the rooms
        {
            int currentKey = keys.pop(); // current key to the next room
            
            for(int newKey: rooms.get(currentKey)) // loop through the keys in the new room
            {
                if(!seenRooms[newKey])
                {
                    seenRooms[newKey] = true; // Update the seenRooms array
                    keys.add(newKey);
                }
            }
        }
        
        
        for(boolean visited: seenRooms)
        {
            if(!visited) { return false; }
        }
        
        return true; // Eventually all rooms will be seen (true)
    }
}