public class MyClass {
    
    //int unuseBitdMap=0;//ones in size of map in constructor
    
    private static int invert(int n) 
    {
        int mask = (Integer.highestOneBit(n) << 1) - 1;
        return (~n & mask);  
    }
    
    public static void main(String args[]) {
     
     long unuseBitdMap = 0;//initBitMap(4);
     
     System.out.println(Integer.toBinaryString(unuseBitdMap));
     //unuseBitdMap = unSetBit(3,unuseBitdMap);
     //unuseBitdMap = unSetBit(1,unuseBitdMap);
     unuseBitdMap = SetBit(10,unuseBitdMap);

     System.out.println(Integer.toBinaryString(unuseBitdMap));
     
     System.out.println("Length of max int: "+ (Integer.toBinaryString(2147483647).length()));//max bits are 31.for long is 62 bits for bitmask.
        
    }
    
    private static int SetBit(int pos,int unusedMap)
    {
        unusedMap |= 1 << pos;
        return unusedMap;
    }
    
    private static int initBitMap(int numOfParams)
    {
        return ~(~0 << numOfParams);
    }
    
    private static checkBitmap(long bitMap)
    {
        if(bitMap!=0){
            for(int i=0;i<8*8){ //8bits in byte 8bytes in long
                if((bitMap & (1 << i))!=0)
                {
                    //pushtoLog(Hashmap[i].key)
                }
            }
        }
    }
    
    private static int[]
    
}
