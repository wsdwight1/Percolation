public class Percolation {
    public WeightedQuickUnionUF uf;
    public int openSites = 0;
    public boolean[][] grid;
    public int length;
    public int[] parent;
    public int vTop;
    public int vBottom;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        if (n < 1) throw new IllegalArgumentException();
        this.length = n;
        this.grid = new boolean[n][n];
        this.parent = new int[n + 2];
        this.vTop = n + 1;
        this.vBottom = n + 2;
        uf = new WeightedQuickUnionUF(n * n + 2);

    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        if (isOpen(row - 1, col) && row - 1 >= 0) {
            int curr = flattenIndex(row, col);

        }
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
    }

    // does the system percolate?
    public boolean percolates() {
    }

    public int flattenIndex(int row, int col) {
        return ((length * row) + col);
    }

    // test client (optional)
    public static void main(String[] args) {
    }
}
