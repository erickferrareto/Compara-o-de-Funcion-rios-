import java.util.List;

public class Funcionários {
    public static void main(String[] args) {
        int salarios;

        FuncActions func1 = new FuncActions();
        func1.name = "Erick";
        func1.old = 22;
        func1.salary = 1800.00f;
        func1.status();

        FuncActions func2 = new FuncActions();
        func2.name = "Tayna";
        func2.old = 24;
        func2.salary = 1300.00f;
        func2.status();

        System.out.println("A média dos salários é de R$" + (func1.salary + func2.salary) / 2);



    }
}
