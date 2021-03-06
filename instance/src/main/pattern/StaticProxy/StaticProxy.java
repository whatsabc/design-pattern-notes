package StaticProxy;

/**
 * @author Jianshu
 * @since 20200822
 */
public class StaticProxy implements IPrinter {
    private IPrinter iPrinter;
    public StaticProxy(){
        this.iPrinter=new Printer();
    }

    public void print(){
        System.out.println("打印前日志");
        iPrinter.print();
        System.out.println("打印后日志");
    }
}
