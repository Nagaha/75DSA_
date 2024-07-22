
/**
 * In MS-Paint, when we take the brush to a pixel and click, the color of the region of that pixel is replaced with a new selected color. Following is the problem statement to do this task.
 * Given a 2D screen, location of a pixel in the screen and a color, replace color of the given pixel and all adjacent same colored pixels with the given color.
 * Example:
 * Input:
 *        screen[M][N] = {{1, 1, 1, 1, 1, 1, 1, 1},
 *                       {1, 1, 1, 1, 1, 1, 0, 0},
 *                       {1, 0, 0, 1, 1, 0, 1, 1},
 *                       {1, 2, 2, 2, 2, 0, 1, 0},
 *                       {1, 1, 1, 2, 2, 0, 1, 0},
 *                       {1, 1, 1, 2, 2, 2, 2, 0},
 *                       {1, 1, 1, 1, 1, 2, 1, 1},
 *                       {1, 1, 1, 1, 1, 2, 2, 1},
 *                       };
 *     x = 4, y = 4, newColor = 3
 * The values in the given 2D screen indicate colors of the pixels.
 * x and y are coordinates of the brush, newColor is the color that
 * should replace the previous color on screen[x][y] and all surrounding
 * pixels with same color.
 *
 * Output:
 * Screen should be changed to following.
 *        screen[M][N] = {{1, 1, 1, 1, 1, 1, 1, 1},
 *                       {1, 1, 1, 1, 1, 1, 0, 0},
 *                       {1, 0, 0, 1, 1, 0, 1, 1},
 *                       {1, 3, 3, 3, 3, 0, 1, 0},
 *                       {1, 1, 1, 3, 3, 0, 1, 0},
 *                       {1, 1, 1, 3, 3, 3, 3, 0},
 *                       {1, 1, 1, 1, 1, 3, 1, 1},
 *                       {1, 1, 1, 1, 1, 3, 3, 1},
 *                       };*/
public class Z4MSPaint {
    public static void main(String[] args) {
        int art[][]=new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
              };//Declaring the array of the paint

        int x=4,y=4;//The coordinates of the color to be changed
        int newColor=3;//The number of the new color

        changeColor(art,x,y,newColor);//calling the function

        for(int i=0;i<art.length;i++){//Printing the output
            for(int j=0;j<art[i].length;j++){
                System.out.print(art[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void changeColor(int[][] art, int x, int y, int newColor) {
        int oldColor=art[x][y];//we find the old color and store
        for(int i=0;i<art.length;i++){//We use nested loop to traverse through the matrix
            for(int j=0;j<art[i].length;j++){
                if(art[i][j]==oldColor){//if we find the old color
                    art[i][j]=newColor;// we change it to new color
                }
            }
        }
    }
}
