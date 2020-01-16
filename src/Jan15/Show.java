package Jan15;

public class Show {


    private final int SEATS_PER_ROW = 8;
    private final int NUM_ROWS = 6;
    private int[] [] seats = new int[NUM_ROWS][SEATS_PER_ROW];

    public static void main(String[] args) {
        Show test = new Show();
        test.randomSeats();
        test.printShow();
        test.isAvailable(0,0);
        System.out.println(test.findAdjacent(1,3));
    }

    public boolean isAisleSeat (int row, int seatNumber) {
        if (seatNumber == SEATS_PER_ROW-1 || seatNumber == 0) return true;
        else return false;
    }

    public boolean twoTogether() {
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < SEATS_PER_ROW - 1; j++) {
                if (isAvailable(i, j) && isAvailable(i, j + 1)) {
                    reserveSeat(i, j);
                    reserveSeat(i, j + 1);
                    return true;
                } else return false;
            }

        }
        return false;
    }

    public int findAdjacent(int row, int seatsNeeded) {
        int counter = 0;
        for (int i = 0; i < SEATS_PER_ROW; i++) {
            if (isAvailable(row, i)) {
                for (int j = i; j < seatsNeeded; j++) {
                    if(!isAvailable(row, j)) {
                        counter = 0;
                        break;
                    } else counter ++;

                }
                if (counter == seatsNeeded) return i;// something!;
            }

        }
        return -1;
    }

    public int[][] getSeats() {
        return seats;
    }
    public void randomSeats() {
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < SEATS_PER_ROW; j++) {
                double rand = Math.random();
                if(rand > 0.5) {
                    reserveSeat(i, j);
                } else {
                    releaseSeats(i, j);
                }
            }
        }
    }

    public void reserveSeat(int row, int seatNuber) {
        this.seats[row][seatNuber] = 1;
    }

    public void releaseSeats(int row, int seatNumber) {
        this.seats[row][seatNumber] = 0;
    }

    public boolean isAvailable(int row, int seatNumber) {
        if (seats[row][seatNumber] == 0) return true;
        else return false;
    }

    public void printShow() {
        System.out.print("    ");
        for (int i = 0; i < SEATS_PER_ROW; i++) {
            System.out.print("[" + i + "] ");
        }
        System.out.println();
        for (int i = 0; i < this.NUM_ROWS; i++) {
            System.out.print("[" + i + "]  ");
            for (int j = 0; j < this.SEATS_PER_ROW; j++) {
                System.out.print(seats[i][j] + "   ");
            }
            System.out.println();

        }

    }
}
