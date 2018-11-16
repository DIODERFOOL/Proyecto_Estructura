import java.util.ArrayList;
import java.util.Stack;

public class DFS extends AbstractSearch{

    Node startNode;
    Node goalNode;

    public DFS(Node start, Node goalNode){
        super(start, goalNode);
        this.startNode = start;
        this.goalNode = goalNode;
    }

    public boolean execute(){
        if(this.startNode.equals(goalNode)){
            System.out.println("Goal Node Found at 0 depth");
            System.out.println(startNode);
        }
        Stack<Node> nodeStack = new Stack<>();
        ArrayList<Node> visitedNodes = new ArrayList<>();

        nodeStack.add(startNode);

        while(!nodeStack.isEmpty()){
            Node current = nodeStack.pop();
            if(current.equals(goalNode)){
                System.out.print(visitedNodes);
                System.out.println("Goal node found");
                return true;
            }
            else {
                visitedNodes.add(current);
                nodeStack.addAll(current.getChildren());
            }
        }
        return false;
    }

}