package com.company;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] array = new int[rows][columns];
        int horizontal=0;
        int vertical=0;
        int count=1;
        int last_row=rows;
        int last_col=columns;
        String direction= "right";
        int volume= rows*columns;

        while (count != volume+1){
            switch (direction){
                case "right":
                    for(int i=horizontal; i<last_col;i++){
                        array [vertical][i]=count;
                        count++;
                    }vertical ++;
                    direction ="down";
                    break;
                case "left":
                    for(int i=last_col-1;i>=horizontal; i--){
                        array[last_row-1][i]=count;
                        count++;
                    } last_row--;
                    direction= "up";
                    break;
                case "down":
                    for(int i = vertical; i<last_row; i++){
                        array[i][last_col-1]=count;
                        count++;}
                    last_col--;
                    direction="left";
                    break;
                case "up":
                    for(int i=last_row-1; i>=vertical;i--){
                        array[i][horizontal]=count;
                        count++;
                    }
                    horizontal++;
                    direction= "right";
                    break;
            }

        }
        return array;
    }
}