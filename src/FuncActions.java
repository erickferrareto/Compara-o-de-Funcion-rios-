import java.util.ArrayList;
import java.util.List;

public class FuncActions {

    public String name;
    public int old;
    public float salary;

    public void status(){
        System.out.println("O funcionário " + this.name + " possuí " + this.old + " anos e seu salário é R$ "+ this.salary);
    }
}
