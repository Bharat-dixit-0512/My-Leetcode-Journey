class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // [x1,y1,x2,y2]
        // x1=left boundary
        // y1=bottom boundary
        // x2=right boundary
        // y2=top boundary
        //1. Rectangle 1 ka right side rectangle 2 ke left side ke aage ho.
        //2. Rectangle 1 ka left side rectangle 2 ke right side ke peeche ho.
        //3. Rectangle 1 ka top side rectangle 2 ke bottom side ke upar ho.
        //4. Rectangle 1 ka bottom side rectangle 2 ke top side ke neeche ho.
        return !(rec1[2]<=rec2[0] ||
        rec1[0]>=rec2[2]||
        rec1[3]<=rec2[1]||
        rec1[1]>=rec2[3]
        );
    }
}