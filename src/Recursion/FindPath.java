package Recursion;

public class FindPath {
    public static void main(String[] args) {
        int arr[][] = {
                {0,0,1},
                {0,0,0},
                {1,0,0}
        };
        int ans[][] = new int[3][3];
      //  boolean visited[][] = new boolean[3][3];

        printAllPath(arr , ans , 0 ,0 , arr.length - 1 ,arr[0].length - 1 );
        //System.out.println("gg");
    }

    private static void printAllPath(int[][] arr, int[][] ans, int si, int sj, int di, int dj) {
        if(si < 0 || sj < 0  || si >= di + 1 || sj >= dj + 1 || arr[si][sj] == 1 || ans[si][sj] == 2 ){
            return;
        }

        if(si == di && sj == dj){
            ans[si][sj] = 2;
            System.out.println("----------------------");
            for (int i=0;i<ans.length;i++) {
                for (int j = 0; j < ans[0].length; j++) {
                    System.out.print(ans[i][j]);
                }
                System.out.println();
            }
            System.out.println("----------------------");
        }

        ans[si][sj] = 2;
        //visited[si][sj] = true;
        printAllPath(arr , ans  , si - 1 , sj , di , dj );
        printAllPath(arr , ans  , si  , sj - 1 , di , dj );
        printAllPath(arr , ans  , si + 1 , sj , di , dj );
        printAllPath(arr , ans  , si , sj + 1 , di , dj );

        ans[si][sj] = 0;
        //visited[si][sj] = false;

    }
}
