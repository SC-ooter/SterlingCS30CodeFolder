class Walker {
    int x,y; //position Variables
    int size;
    int speed;
    //constructor
    Walker(int tempx, int tempy) {
        x = tempx;
        y = tempy;
        size = 25;
        speed = 25;

    }

    void display() {
        fill(0);
        //rect(xpos, ypos, width, height);
        rect(x, y, size, size);
    }
    // dir var --> 0 = up, 1 = right, 2 = down, 3 = left
    void move(int dir) {
        //UP
        if (dir == 0) {
            y = y - speed;
        }
        else if (dir == 1) {
            x = x+speed;
        }
        else if (dir == 2) {
            y = y + speed;
        }
        else if (dir == 3) {
            x = x - speed;
        }
    }
}