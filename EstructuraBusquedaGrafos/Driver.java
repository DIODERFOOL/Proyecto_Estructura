public class Driver {

    public static void main(String args[]){
        Node station1 = new Node("Westminster", null, null);
        Node station2 = new Node("Waterloo", station1, null);
        Node station3 = new Node("Trafalgar Square", station1, station2);
        Node station4 = new Node("Canary Wharf", station2, station3);
        Node station5 = new Node("London Bridge", station4, station3);
        Node station6 = new Node("Tottenham Court Road", station5, station4);
        // ************** A
                    //     start **** goal
        BFS bfs = new BFS(station6, station1);
        if(bfs.compute())
            System.out.print("Path Found!");
            System.out.println("");
            // ***** A profundidad

        AbstractSearch searchAlgo = new DFS(station6, station1);

        if(searchAlgo.execute())
            System.out.print("Path Found!");
    }
}
