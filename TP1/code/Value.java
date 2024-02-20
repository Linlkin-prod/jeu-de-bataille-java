public class Value implements Comparable<Value>{
    
    private static String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "As"};
    private String value;
    public int ind;

    public Value(int val){
        this.value = values[val];
        ind = val;
    }

    public int index(String val){
        int index = 0;
        for (String i : values){
            if (val == i){
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
    public int compareTo(Value secondValue){
        if (this.ind > secondValue.ind){
            return 1;
        }
        if (this.ind < secondValue.ind){
            return -1;
        }
        else{
            return 0;
        }
    }

    public String getValue (){
        return value;
    }

}
