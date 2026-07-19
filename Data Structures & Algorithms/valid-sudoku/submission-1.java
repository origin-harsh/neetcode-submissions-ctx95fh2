class Solution {
    public boolean ValidBox(char[][] board,int sr,int er,int sc,int ec){
         HashSet<Character> st = new HashSet<>();
        for(int i=sr;i<=er;i++){
           
            for(int j=sc;j<=ec;j++){
                if(board[i][j] == '.') continue;
                if(st.contains(board[i][j])) return false;
                st.add(board[i][j]);
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        //validate row
        for(int i=0;i<9;i++){
            HashSet<Character> rv = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j] == '.') continue;
                if(rv.contains(board[i][j])) return false;
                rv.add(board[i][j]);
            }
        }
        //valid col
        for(int i=0;i<9;i++){
            HashSet<Character> cv = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i] == '.') continue;
                if(cv.contains(board[j][i])) return false;
                cv.add(board[j][i]);
            }
        }
        //valid box

        for(int sr =0;sr<9;sr +=3){
            int er = sr + 2;
            for(int sc = 0;sc<9;sc += 3){
                int ec = sc + 2;
                if(!ValidBox(board,sr,er,sc,ec)) return false;
            }
        }
        return true;
    }
}
