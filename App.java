
public class App {
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        /*queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        furaFila(queue, 6);
        queue.enqueue(7);
        furaFila(queue, 8);
        queue.enqueue(9);
        /*while (!queue.isEmpty()) {
            Integer aux = queue.dequeue(); // remove da fila
            System.out.println(aux); // imprime
        }*/
        
        ArrayStack stack = new ArrayStack();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        //System.out.println(pilhaContem(stack, 10));
        /*
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }   
        
        System.out.println(checkExp("()"));
        System.out.println(checkExp("())"));
        System.out.println(checkExp("()]]"));
        System.out.println(checkExp("(){[()]}[()()]"));
        System.out.println(checkExp("((()"));
        System.out.println(checkExp("(){[(]]}[()()]"));
        

        System.out.println(ehPalindromo("aba"));
        System.out.println(ehPalindromo("abccba"));
        System.out.println(ehPalindromo("Rotor"));

        System.out.println(pilhaContem(stack, 1));
        System.out.println(stack.size());
        System.out.println(pilhaContem(stack, 3));
        System.out.println(stack.size());
        System.out.println(pilhaContem(stack, 4));
        System.out.println(stack.size());

        Deque deck = new Deque();
        deck.addLast(1);
        deck.addLast(2);
        deck.addLast(3);
        deck.addLast(4);
        System.out.println(deck.removeFirst());
        System.out.println(deck.getFirst());
        System.out.println(deck.removeLast());
        System.out.println(deck.getLast());
        System.out.println(deck.getLast());*/

        ArrayStack stack2 = new ArrayStack();
        stack2.push(8);
        stack2.push(7);
        stack2.push(6);
        stack2.push(5);
        ArrayStack stack3 = unePilha(stack, stack2);
        while (!stack3.isEmpty()) {
            System.out.println(stack3.pop());
        }   
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

    public static LinkedQueue furaFila(LinkedQueue q, int elem){
        //LinkedQueue aux = new LinkedQueue();
        int inicialSize = q.size();
        q.enqueue(elem);
        for(int i = 0; i < inicialSize;i++){
        q.enqueue(q.dequeue());
        }
        return q;
    }

    public static boolean ehPalindromo(String s){
        ArrayStackChar pilhaC = new ArrayStackChar();
        s = s.toLowerCase();
        int halfS = s.length()/2;
        int modS = s.length()%2;
        for(int i = 0; i < halfS; i++){
            pilhaC.push(s.charAt(i));
        }
        for(int j = halfS + modS; j < s.length();j++){
            if(pilhaC.pop()!=s.charAt(j)){
                return false;
            }
        }

        return true;
    }

    public static boolean pilhaContem(ArrayStack pilha ,int e){
        LinkedQueue q = new LinkedQueue();
        boolean contem = false;
        while(!pilha.isEmpty()){
            if(pilha.top()==e){
                contem = true;
                break;
            }
            q.enqueue(pilha.pop());
        }
        int tamFila = q.size();
        while(!q.isEmpty()){
            pilha.push(q.dequeue());
        }
        for(int i = 0; i < tamFila; i++){
            q.enqueue(pilha.pop());
        }
        while(!q.isEmpty()){
            pilha.push(q.dequeue());
        }


        return contem;
    }

    public static ArrayStack unePilha(ArrayStack s, ArrayStack t){
        Deque d = new Deque();
        while(!s.isEmpty()){
            d.addFirst(s.pop());
        }
        while(!t.isEmpty()){
            d.addFirst(t.pop());
        }

        while(!d.isEmpty()){
            t.push(d.removeLast());
        }
        while(!t.isEmpty()){
            s.push(t.pop());
        }
        return s;
    }
}
