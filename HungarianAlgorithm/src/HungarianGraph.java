public class HungarianGraph {

    private int[][] edge;  // 0表示无边, 1非匹配边, 2匹配边
    private boolean[] node;  // 是否是匹配点

    public HungarianGraph(){
        edge = new int[8][8];
        node = new boolean[8];
        int n = 8;
        edge[0][1] = 1;
        edge[0][5] = 1;
        edge[2][1] = 1;
        edge[4][1] = 1;
        edge[4][3] = 1;
        edge[6][5] = 1;
        edge[6][7] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (edge[i][j] == 1)
                    edge[j][i] = 1;
            }

        }
    }

    public void print(){
        for(int i = 0; i < edge.length; i++) {
            for(int j = 0; j < edge.length; j++) {
                System.out.print(edge[i][j] + " ");
            }
            System.out.println();
        }
    }


}
