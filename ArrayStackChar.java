
import java.util.EmptyStackException;

public class ArrayStackChar {

    private int topo;
    private Character p[];

    public ArrayStackChar() {
        p = new Character[100];
        topo = 0;
    }

    public int size() {
        return topo;
    }

    public void push(Character e) {
        if (topo >= p.length) {
            throw new StackOverflowError();
        }
        p[topo] = e;
        topo++;
    }

    public Character pop() {
        if (topo == 0) {
            throw new EmptyStackException();
        }
        topo--;
        Character aux = p[topo];
        p[topo] = null;
        return aux;
    }

    public Character top() {
        if (topo == 0) {
            throw new EmptyStackException();
        }
        return p[topo - 1];
    }

    public boolean isEmpty() {
        return (topo == 0);
    }

    public void clear() {
        p = new Character[100];
        topo = 0;
    }
}
