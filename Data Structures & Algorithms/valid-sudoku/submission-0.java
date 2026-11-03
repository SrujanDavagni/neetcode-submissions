class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Integer> rows = new HashSet<>();
            for(int j=0;j<9;j++){
                int num = board[i][j] - '0';
                if(num <1 || num > 9){
                    continue;
                }
                if(!rows.contains(num)){
                    rows.add(num);
                }
                else{
                    return false;
                }
            }
        }
        
        for(int i=0;i<9;i++){
            HashSet<Integer> cols = new HashSet<>();
            for(int j=0;j<9;j++){
                int num = board[j][i] - '0';
                if(num <1 || num > 9){
                    continue;
                }
                if(!cols.contains(num)){
                    cols.add(num);
                }
                else{
                    return false;
                }
            }
        }

        for(int bRow=0;bRow<9;bRow+=3){
            for(int bCol=0;bCol<9;bCol+=3){
                HashSet<Integer> block = new HashSet<>();
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        int num = board[bRow + i][bCol + j] - '0';
                        if(num<1 || num>9){
                            continue;
                        }
                        if(!block.contains(num)){
                            block.add(num);
                        }
                        else{
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
