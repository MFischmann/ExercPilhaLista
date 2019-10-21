public class Deque{
    private ArrayStack p1;
    private ArrayStack p2;
    //private int count;

    public Deque(){
        p1 = new ArrayStack();
        p2 = new ArrayStack();
        //count = 0;
    }

    public void addFirst (int e){
        p1.push(e);
    }

    public void addLast(int e){
        p2.push(e);
    }

    public int removeFirst(){
        if(p1.size()!=0){
            return p1.pop();
        }

        if(p2.isEmpty()){
            System.out.println("Erro, deque vazio.");
            return -1;
        }

        while(p2.size()>1){
            p1.push(p2.pop());
        }

        int aux = p2.pop();

        while(!p1.isEmpty()){
            p2.push(p1.pop());
        }

        return aux;
    }

    public int removeLast(){
        if(p2.size()!=0){
            return p2.pop();
        }

        if(p1.isEmpty()){
            System.out.println("Erro, deque vazio.");
            return -1;
        }

        while(p1.size()>1){
            p2.push(p1.pop());
        }

        int aux = p1.pop();

        while(!p2.isEmpty()){
            p1.push(p2.pop());
        }

        return aux;
    }

    public int getFirst(){
        if(p1.size()!=0){
            return p1.top();
        }

        if(p2.isEmpty()){
            System.out.println("Erro, deque vazio.");
            return -1;
        }

        while(p2.size()>1){
            p1.push(p2.pop());
        }

        int aux = p2.top();

        while(!p1.isEmpty()){
            p2.push(p1.pop());
        }

        return aux;
    }

    public int getLast(){
        if(p2.size()!=0){
            return p2.top();
        }

        if(p1.isEmpty()){
            System.out.println("Erro, deque vazio.");
            return -1;
        }

        while(p1.size()>1){
            p2.push(p1.pop());
        }

        int aux = p1.top();

        while(!p2.isEmpty()){
            p1.push(p2.pop());
        }

        return aux;
    }

    public int size(){
        return p1.size()+p2.size();
    }

    public boolean isEmpty(){
        return (p1.isEmpty() && p2.isEmpty());
    }
}