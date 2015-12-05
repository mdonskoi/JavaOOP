package HashCodeExample;


public class BlackBox {

    int varA;
    int varB;

    BlackBox(int varA, int varB){
        this.varA = varA;
        this.varB = varB;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime*result + varA;
        result = prime*result + varB;
        return result;
    }

    public static void main(String[] args) {
        BlackBox blackBox1 = new BlackBox(1,2);
        BlackBox blackBox2 = new BlackBox(1,2);
        BlackBox blackBox3 = new BlackBox(2,1);

        System.out.println(blackBox1.hashCode());
        System.out.println(blackBox2.hashCode());
        System.out.println(blackBox3.hashCode());
    }

}
