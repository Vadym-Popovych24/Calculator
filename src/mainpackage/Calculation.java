package mainpackage;
import java.awt.*;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculation extends Main{
    char y ;
     char x;
    char x2;
    char c;
   public LinkedList<Double> st = new LinkedList<>();
    public LinkedList<Character> op = new LinkedList<>();
    public Double eval(StringBuilder s, Double indexOf) {

        String operand = "";

        for (int i = 0; i < s.length(); i++) {
             c = s.charAt(i);
            y = ' ';
            x = ' ';
            x2 = ' ';
            if (i !=s.length()-1){
                i++;
                y =s.charAt(i);
                i--;
            }
            if ( i >= 0) {

                x = s.charAt(i);

            }
            if (i >= 1){

                i--;
                x2 = s.charAt(i);

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
               op.add('-');
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

                while (i < s.length() && m.find() )
                    operand += s.charAt(i++);
                --i;


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
