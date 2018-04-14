import java.awt.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculation extends Main{
    public Double eval(StringBuilder s, Double indexOf) {
        LinkedList<Double> st = new LinkedList<Double>();
        LinkedList<Character> op = new LinkedList<Character>();
        String operand = "";
        char y,x,x2;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            y = ' ';
            x = ' ';
            x2 = ' ' ;
            if (i !=s.length()-1){
                i++;
                y =s.charAt(i);
                i--;
            }
            if ( i >= 0) {

                x = s.charAt(i);
                // System.out.println("i =" + i +  "x = " + x);

            }
            if (i >= 1){

                i--;
                x2 = s.charAt(i);
                //  System.out.println("i = "+ i+ "x2 = " + x2);

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
            else if (Character.isDigit(c) && (x2 == '+'  || x2 == '*' || x2 == '/') && x == '-') {
                operand += s.charAt(i);
            }
            else if (x2 == '-' && x == '-' ){
                //   operand += '-';
                //   System.out.println("Два мінуси підряд");
            }

            else if (process.isOperator(c) && x != '-') {
                if (c == '!' && Character.isDigit(y)){
                    jLabel1.setForeground(Color.red);
                    jLabel1.setText("Помилка");
                    break;
                }
                if (c == '/' && y == '0'){
                    jLabel1.setForeground(Color.red);
                    jLabel1.setText("Помилка");
                    break;
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
                if (( x =='-' && Character.isDigit(x2)  ))
                {
                    op.add('+');
                }
                if (x == '-' && process.isOperator(x2))
                {

                }
                while (i < s.length() && m.find() )
                    operand += s.charAt(i++);
                --i;

              /*
              if (y == '+' || y == '-' || y == '*' || y == '/'  || y == '^' || y == '(' || y == ')' || y == '!' ) {
                    st.add(Double.parseDouble(operand));
                    operand="";
                }
                */

                if (!process.isOperator(c) && process.isOperator(y) || y =='('|| y ==')' )
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
