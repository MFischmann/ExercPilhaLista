
public class App {
    public static void main(String[] args) {
        /*LinkedQueue queue = new LinkedQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        while (!queue.isEmpty()) {
            Integer aux = queue.dequeue(); // remove da fila
            System.out.println(aux); // imprime
        }
        
        ArrayStack stack = new ArrayStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }    */
        
        System.out.println(checkExp("()"));
        System.out.println(checkExp("())"));
        System.out.println(checkExp("()]]"));
        System.out.println(checkExp("(){[()]}[()()]"));
        System.out.println(checkExp("((()"));
        System.out.println(checkExp("(){[(]]}[()()]"));
    }

    public static boolean checkExp(String s){
        if(s.length()%2==1){
            return false;
        }
        
        ArrayStack pilha = new ArrayStack();

        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            switch(x){
                case '{':
                pilha.push(1);
                if(pilha.size()>s.length()-i){
                    System.out.println("Excesso de aberturas");
                    return false;
                }
                break;
                case '(':
                pilha.push(2);
                if(pilha.size()>s.length()-i){
                    System.out.println("Excesso de aberturas");
                    return false;
                }
                break;
                case '[':
                pilha.push(3);
                if(pilha.size()>s.length()-i){
                    System.out.println("Excesso de aberturas");
                    return false;
                }
                break;                
                case '}':
                if(pilha.isEmpty()||pilha.pop() != 1){
                    return false;
                }
                break;
                case ')':
                if(pilha.isEmpty()||pilha.pop() != 2){
                    return false;
                }
                break;
                case ']':
                if(pilha.isEmpty()||pilha.pop() != 3){
                    return false;
                }
                break;
                default:
                System.out.println("Simbolo nao suportado");
                return false;
            }
        }

        return true;
    }
}
