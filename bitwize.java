public class MyClass {
    
    int unuseBitdMap=0;//ones in size of map in constructor
    
    static int invert(int n) {
        int mask = (Integer.highestOneBit(n) << 1) - 1;
        return (~n & mask);  
    }
    
    public static void main(String args[]) {
     
     unuseBitdMap =  initBitMap(4);
     
     System.println(Integer.toBinaryString(unuseBitdMap));
     setBit(3);
     System.println(Integer.toBinaryString(unuseBitdMap));
        
    }
    
    private void setBit(int pos)
    {
        unusedMap |= 1 << pos;
    }
    
    private void initBitMap(int numOfParams)
    {
        return ~(~0 << numOfParams);
    }
    
}
