import java.util.*;
public class Dijkstra
{
    // Aquí se ve proyectado como arreglos.
    public  int distance[] = new int[10];
    //Se creó un arreglo de 10 * 10
    public  int cost[][] = new int[10][10];

    public void calc(int n,int s) {
        // Crea una bandera para guardar un dato temporal
        int flag[] = new int[n+1];
        int i,minpos=1,k,c,minimum;


        for(i=1;i<=n;i++)
        {
            // Todos los nodos se irán poniendo como "0". "0" es que no se ha pasado por ahí y "1" es que ya se pasó por ahí.
            flag[i]=0;
            // En el arreglo "distancia" se va agregando los valores al arreglo 10*10
            this.distance[i]=this.cost[s][i];
        }
        c=2;
        //Mientras que el contador sea menor o igual a la candidad de nodos.
        while(c<=n)
        {
            minimum=99;

            for(k=1;k<=n;k++)
            {
                // Si la distancia de ese nodo es mínima a 99 y no ha pasado por ahí...
                if(this.distance[k]<minimum && flag[k]!=1)
                {
                    // ... el mínimo se posiciona en aquella distancia de donde está
                    minimum=this.distance[i];
                    // La posisión mínima es la que está pero en "k"
                    minpos=k;
                }
            }
            //Se afrega un 1 el cual significa que ya se ha pasado por ese nodo
            flag[minpos]=1;
            // Se va agregando más al contador
            c++;
            // Se mete de nuevo a un for pero esta vez es para posicionar las distancias de cada vertice
            for(k=1;k<=n;k++)
            {
                //Si el peso de la distancia de la posición mínima más el peso del arreglo "x" y "y" en la posición mínima y "k" es
                // menor a la distancia de "k" y no ha sido marcada como pasada
                if(this.distance[minpos]+this.cost[minpos][k] <  this.distance[k] && flag[k]!=1 ) {
                    // a la distancia que está en el valor de "k" es igual a la distancia de la posición mínima más cost de la posición mínima y en "k"
                    this.distance[k] = this.distance[minpos] + this.cost[minpos][k];
                }
            }
        }

    }


    public static void main(String args[])
    {
        int nodes,source,i,j;
        //Se pide la cantidad máxima de nodos que hay, para implementarlo en el proyecto se hace una variable como "maxNodes" donde se obtendrá el máximo
        // de los nodos.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Nodes \n");
        nodes = in.nextInt();
        Dijkstra d = new Dijkstra();
        // Auí se va agregando el peso de cada uno de los vertices donde si se le pone "0" a alguna
        System.out.println("Enter the Cost Matrix Weights: \n");
        for(i=1;i<=nodes;i++)
            for(j=1;j<=nodes;j++)
            {
                d.cost[i][j]=in.nextInt();
                if(d.cost[i][j]==0)
                    d.cost[i][j]=999;
            }
            // Se ingresa el vértice inicial
        System.out.println("Enter the Source Vertex :\n");
        source=in.nextInt();

        // Se manda a llamar el método de arriba para calcular la distancia más corta para llegar al destino, poniendo los nodos y el lugar inicial
        d.calc(nodes,source);
        System.out.println("The Shortest Path from Source \t"+source+"\t to all other vertices are : \n");
        for(i=1;i<=nodes;i++) {
            if (i != source) {
                System.out.println("source :" + source + "\t destination :" + i + "\t MinCost is :" + d.distance[i] + "\t");
            }
        }

    }
}