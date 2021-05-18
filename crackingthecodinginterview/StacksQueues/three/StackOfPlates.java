import java.util.EmptyStackException;

public class SetOfStacks {
  ArrayList<Stack> stacks = new ArrayList<Stack>();
  public void push(int v) {
    Stack last = getLastStack();
    if (last != null && !last.isFull()) {
      last.push(v);
    } else {
      Stack stack = new Stack(capacity);
      stack.push(v);
      stacks.add(stack);
    }
  }

  int pop() {
    Stack last = getLastStack();
    if (last == null) throw new EmptyStackException();
    int v = last.pop();
    if (last.size == 0) stacks.remove(stacks.size() - 1);
    return v;
  }
}