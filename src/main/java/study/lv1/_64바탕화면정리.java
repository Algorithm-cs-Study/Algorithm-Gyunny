package study.lv1;

public class _64바탕화면정리 {

    public static void main(String[] args) {
        _64바탕화면정리 t = new _64바탕화면정리();
        String[] wallpaper = {".#...", "..#..", "...#."};
        for (int x : t.solution(wallpaper)) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int minRow = Integer.MAX_VALUE;
        int minCol = Integer.MAX_VALUE;
        int maxRow = Integer.MIN_VALUE;
        int maxCol = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[0].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    minRow = Math.min(minRow, i);
                    minCol = Math.min(minCol, j);
                    maxRow = Math.max(maxRow, i);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        answer[0] = minRow;
        answer[1] = minCol;
        answer[2] = maxRow + 1;
        answer[3] = maxCol + 1;

        return answer;
    }

}