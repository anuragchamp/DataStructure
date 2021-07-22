package Recursion;

public class FindPath {
    public static void main(String[] args) {
        int arr[][] = {
                {0,1,0},
                {0,0,1},
                {0,0,0}
        };
        int ans[][] = new int[3][3];
        boolean visited[][] = new boolean[3][3];

        printAllPath(arr , ans , 0 ,0 , 2 ,2  , visited);
        System.out.println("gg");
    }

    private static void printAllPath(int[][] arr, int[][] ans, int si, int sj, int di, int dj, boolean[][] visited) {


        System.out.println(si +" " +di);
        if(si < 0 || sj < 0  || si > di + 1 || sj > dj + 1 || arr[si][sj] == 1 || visited[si][sj]){
            return;
        }

        if(si == di && sj == dj){
            System.out.println("----------------------");
            for (int i=0;i<ans.length;i++) {
                for (int j = 0; j < ans[0].length; j++) {
                    System.out.print(ans[i]);
                }
                System.out.println();
            }
            System.out.println("----------------------");
        }

        ans[si][sj] = 2;
        visited[si][sj] = true;
        printAllPath(arr , ans  , si - 1 , sj , di , dj , visited);
        printAllPath(arr , ans  , si  , sj - 1 , di , dj , visited);
        printAllPath(arr , ans  , si + 1 , sj , di , dj , visited);
        printAllPath(arr , ans  , si , sj + 1 , di , dj , visited);

        ans[si][sj] = 0;
        visited[si][sj] = false;

    }
}
