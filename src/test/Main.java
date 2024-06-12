package test;



import com.sun.org.apache.regexp.internal.REUtil;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import javafx.scene.transform.Rotate;
import sun.security.util.Length;
import sun.util.resources.hr.CalendarData_hr;

import javax.jnlp.IntegrationService;
import javax.print.attribute.standard.RequestingUserName;
import java.beans.Visibility;
import java.lang.annotation.Target;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.util.*;

class Main {

    public static void main(String[] args) {

        String s = "3+2*2";

        Solution solution = new Solution();






    }
}









class Solution {

    boolean flag = false;
    int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    boolean[][] visit;

    public boolean exist(char[][] board, String word) {

        int n = board.length, m = board[0].length;
        visit = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                backTracking(board, word, i, j, 0);
                if(flag){
                    return true;
                }
            }
        }

        return false;

    }






    public void backTracking(char[][] board, String word, int x, int y, int index){

        if(board[x][y] != word.charAt(index)){
            return ;
        }else if(index == word.length() - 1){
            flag = true;
            return ;
        }

        visit[x][y] = true;

        for (int[] dir : dirs){

            int nextx = x + dir[0];
            int nexty = y + dir[1];

            if(nextx < 0 || nextx >= board.length || nexty < 0 || nexty >= board[0].length){
                continue;
            }
            if(visit[nextx][nexty]){
                continue;
            }

            backTracking(board, word, nextx, nexty, index + 1);


        }

        visit[x][y] = false;

    }




}


















class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};


//class Node {
//    int val;
//    Node next;
//    Node random;
//
//    public Node(int val) {
//        this.val = val;
//        this.next = null;
//        this.random = null;
//    }
//}


//class Node {
//    public int val;
//    public Node left;
//    public Node right;
//
//    public Node() {}
//
//    public Node(int _val) {
//        val = _val;
//    }
//
//    public Node(int _val,Node _left,Node _right) {
//        val = _val;
//        left = _left;
//        right = _right;
//    }
//};


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
  }


//    public static void main(String[] args) throws IOException {
//
////		Scanner scan = new Scanner(System.in);
//
//        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//
//        st.nextToken();
//        int n = (int)st.nval;


//    PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
//pw.println();
//        pw.print();
////这一步必须有，要不然输出不了
//        pw.flush();






