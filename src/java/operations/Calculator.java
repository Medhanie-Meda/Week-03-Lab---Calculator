package operations;
import java.io.Serializable;

public class Calculator implements Serializable
{
    private String firstNumber;
    private String secondnumber;
    private String operation;

    public Calculator() 
    {
        firstNumber = "";
        secondnumber = "";
        operation = "";
    }

    public Calculator(String firstNumber, String secondnumber, String operation) {
        this.firstNumber = firstNumber;
        this.secondnumber = secondnumber;
        this.operation = operation;
    }

    public String getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(String firstNumber) {
        this.firstNumber = firstNumber;
    }

    public String getSecondnumber() {
        return secondnumber;
    }

    public void setSecondnumber(String secondnumber) {
        this.secondnumber = secondnumber;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }    
    
    
}
