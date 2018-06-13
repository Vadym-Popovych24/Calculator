package mainpackage;
import java.awt.*;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculation {
    char beforeFirst;
    public char getBeforeFirst(){return beforeFirst; }
    public void setBeforeFirst(char beforeFirst){
        this.beforeFirst =beforeFirst;
    }
    char firstFront;
    public char getFirstFront(){return firstFront; }
    public void setFirstFront(char firstFront){
        this.firstFront =firstFront;
    }
     char secondFront;
    public char getSecondFront(){return secondFront; }
    public void setSecondFront(char secondFront){
        this.secondFront =secondFront;
    }
    Process process = new Process();

    Prioritet prior = new Prioritet();
    char c;
  LinkedList<Double> st = new LinkedList<>();
 LinkedList<Character> op = new LinkedList<>();
    public LinkedList<Character> getOp(){return op; }
    public void setOp(LinkedList<Character> op){
        this.op =op;
    }
    public Double eval(StringBuilder s, Double indexOf) {
        Main main = new Main();
        String operand = "";

        for (int i = 0; i < s.length(); i++) {
             c = s.charAt(i);
            beforeFirst = ' ';
            firstFront = ' ';
            secondFront = ' ';
            if (i !=s.length()-1){
                i++;
                beforeFirst =s.charAt(i);
                i--;
            }
            if ( i >= 0) {

                firstFront = s.charAt(i);

            }
            if (i >= 1){

                i--;
                secondFront = s.charAt(i);

                i++;
            }
            String t = String.valueOf(c);
            Pattern p = Pattern.compile("^[0-9]*[,.-]?+$");
            Matcher m = p.matcher(t);
            if (process.isDelim(c))
                continue;
            if (c == '(')
                op.add('(');

            else if (c == ')') {
                while (op.getLast() != '(') process.processOperator(st, op.removeLast());
                op.removeLast();
            }

            else if (Character.isDigit(c) && (secondFront == '+'  || secondFront == '*' || secondFront == '/') && firstFront == '-') {
                operand += s.charAt(i);
            }
            else if (secondFront == '-' && firstFront == '-' ){
               op.add('-');
            }

            else if (process.isOperator(c) && firstFront != '-') {
                if (c == '!' && Character.isDigit(beforeFirst)){

                    main.getjLabel1().setForeground(Color.red);
                    main.getjLabel1().setText("Помилка");
                    break;
                }
                if (c == '/' && beforeFirst == '0'){

                    main.getjLabel1().setForeground(Color.red);
                    main.getjLabel1().setText("Помилка");

                }
                while (!op.isEmpty() && prior.priority(op.getLast()) >= prior.priority(c))
                {
                    process.processOperator(st, op.removeLast());
                }

                op.add(c);

            }

            else if (i == s.length()-1  ){
                operand += s.charAt(i++);
                st.add(Double.parseDouble(operand));
            }
            else  {
                if (( firstFront =='-' && Character.isDigit(secondFront)  ))
                {
                    op.add('+');
                }

                while (i < s.length() && m.find() )
                    operand += s.charAt(i++);
                --i;


                if (!process.isOperator(c) && process.isOperator(beforeFirst) || beforeFirst =='('|| beforeFirst ==')' )
                {
                    st.add(Double.parseDouble(operand));
                    operand="";
                }


            }
        }
        while (!op.isEmpty())
            process.processOperator(st, op.removeLast());
        return st.get(0);
    }




}
