
public class Statistics {
    private int count;
    private int sum;
//    Constructor
    public Statistics(){
        this.count = 0;
        this.sum = 0;
    }
//    Method
    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }
//    Method
    public int getCount() {
        return this.count;
    }
//    Method
    public int sum() {
        return this.sum;
    }
//Method
    public double average() {
        try {
            if (this.count == 0){
                return 0;
            } else {
            return this.sum * 1.0 / this.count;
            }
        } catch (Exception e) {
         return 0;
        }
        
   }
}
