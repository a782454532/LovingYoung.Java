import lovingyoung.Printer;
import lovingyoung.Computer;
import lovingyoung.Output;
public class PrinterFactory{
	public Printer getPrinter(){
		return new Printer();
	}
	public static void main(String[] args){
		PrinterFactory pf=new PrinterFactory();
		Computer co=new Computer(pf.getPrinter());
		co.keyIn("Loving Young 1");
		co.keyIn("Loving Young 2");
		co.keyIn("Loving Young 3");
		co.print();
	}
}
