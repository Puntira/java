public class NumberNew {
    private int number;

    public NumberNew() {
        setValue((int) (Math.random() * 100));
    }
    public NumberNew(int n) {
        setValue( n );
    }
    public void setValue(int n){
        number = n;
    }
    public int getValue(){
        return(number);
    }
    public String toString(){
        return(Integer.toString(getValue()));
    }
    public void sqrt(int n){
        setValue((int)Math.sqrt(n));
    }
    public void perseint(int n){
        setValue((getValue()*n)/100);
    }
    public void add(int n) {
        setValue( getValue() + n);
    }
    public void subtract(int n) {
        setValue( getValue() - n);
    }
    public void multiply(int n) {
        setValue( getValue() * n);
    }
    public void divide(int n) {
        setValue( getValue() / n);
    }
    
}

