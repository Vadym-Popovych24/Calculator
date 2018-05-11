package mainpaket;

public class Prioritet {
    static int priority(char op) {
        switch (op) {

            case '+':
                break;
            case '-':

                return 1;

            case '*':
                break;
            case '/':

                return 2;

            case 's':
                break;
            case 'c':
                break;
            case 't':
                break;
            case 'l':
                break;
            case 'T':
                break;
            case 'S':
                break;
            case 'C':
                break;
            case 'L':
                break;
            case '√':
                break;
            case '!':

                return 3;

            case '^':

                return 4;

            default:

                return -1;

        }
        return 0;
    }
}
