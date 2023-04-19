public class DynamicArray{


    public int maxSize = 1;
    public int actualSize = 0;
    public int[] data;

    public DynamicArray()
    {
        this.data = new int[this.maxSize];
    }

    public DynamicArray(int maxSize){
        this.maxSize = maxSize;
        this.data = new int[this.maxSize];
    }
    public int[] relocate(int[] table,int maxSize){
        int[] temp = new int[maxSize];

        for (int i = 0; i < maxSize/2;i++)
        {
            temp[i] = table[i];
        }
        return temp;
    }

    public void addElement(int value)
    {
        if (this.actualSize == this.maxSize)
        {
            this.maxSize *= 2;
            this.data = relocate(this.data,this.maxSize);
            this.data[this.actualSize] = value;
            this.actualSize++;
        }
        else {
            this.data[this.actualSize] = value;
            this.actualSize ++;
        }
    }

    public void printData()
    {
        for (int i = 0; i < this.actualSize; i++) {
            System.out.print(this.data[i] + " ");
        }
    }

    public void deleteAll(){
        this.data = null;
        this.actualSize = 0;
        this.maxSize = 1;
    }
}
