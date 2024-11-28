Ball redball;
// happens once an launch
void setup() {
    size(1280,720);
    background(200,200,200);
    redball = new Ball(200,200,50);
}

// happens constantly (screen refresh)
void draw() {
    background(200,200,200);
    redball.display();
    redball.move();
}

class Ball {
    int x , y , r;
    int dx;
    int dy;


    //Constructor
    Ball(int temp x, int temy, int tempr){
        x = tempx;
        y = tempy;
        r = tempr;
        dx = 10;
        dy = 10;
    }

    void display() {
        circle(x,y,r*2);
    }

    void move() {
        y = y + dy;
        x = x + dx;

        if (y>=height - r || y <= 0 + r) {
            dy = dy*-1;
        }
        if (x>=width -r || x <= 0 + r) {
            dx = dx*-1;
        }
    }
}