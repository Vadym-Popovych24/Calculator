package mainpackage;

import java.util.LinkedList;

public class Process {
    public Process() {
        /* Do nothing because of X and Y. */
    }
     double firstOperand;
    public double getFirstOperand(){return firstOperand; }
    public void setFirstOperand(double firstOperand){
        this.firstOperand =firstOperand;
    }
    double secondOperand;
    public double getSecondOperand(){return secondOperand; }
    public void setSecondOperand(double secondOperand){
        this.secondOperand =secondOperand;
    }
    public  boolean isDelim(char c) {
        return c == ' ';
    }
    public boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^'
                || c == '√' || c == 't' || c == 's' || c == 'c' || c == 'l'
                || c == '!' || c == 'T' || c == 'S' || c == 'C' || c == 'L';
    }

    public void processOperator(LinkedList<Double> st, char op) {

        switch (op) {
            case '+':
                firstOperand = st.removeLast();
                secondOperand = st.removeLast();
                st.add(secondOperand + firstOperand);

                break;

            case '-':
                firstOperand = st.removeLast();
                secondOperand = st.removeLast();
                st.add(secondOperand - firstOperand);
                break;

            case '*':
                firstOperand = st.removeLast();
                secondOperand = st.removeLast();
                st.add(secondOperand * firstOperand);
                break;

            case '/':
                firstOperand = st.removeLast();
                secondOperand = st.removeLast();
                st.add(secondOperand / firstOperand);
                break;

            case '^':
                firstOperand = st.removeLast();
                secondOperand = st.removeLast();
                st.add(Math.pow(secondOperand ,firstOperand));
                break;

            case '!':
                double ret = 1.0;
                secondOperand = st.removeLast();

                for (int i = 1; i <= secondOperand; ++i) ret *= i;
                st.add(ret);
                break;

            case '√':
                secondOperand = st.removeLast();
                st.add(Math.sqrt(secondOperand));
                break;

            case ('s'):
                secondOperand = st.removeLast();
                st.add(Math.sin(secondOperand));
                break;

            case ('S'):
                secondOperand = st.removeLast();
                st.add(Math.sinh(secondOperand));
                break;

            case ('c'):
                secondOperand = st.removeLast();
                st.add(Math.cos(secondOperand));
                break;

            case ('C'):
                secondOperand = st.removeLast();
                st.add(Math.cosh(secondOperand));
                break;

            case ('t'):
                secondOperand = st.removeLast();
                st.add(Math.tan(secondOperand));
                break;

            case ('T'):
                secondOperand = st.removeLast();
                st.add(Math.tanh(secondOperand));
                break;

            case ('l'):
                secondOperand = st.removeLast();
                st.add(Math.log(secondOperand));
                break;

            case ('L'):
                secondOperand = st.removeLast();
                st.add(Math.log10(secondOperand));
                break;
            default :
       secondOperand = 0.0;
       firstOperand = 0.0;
                break;
        }

    }

}
