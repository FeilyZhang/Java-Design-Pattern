package tech.feily.DesignPattern.Decorator;

public class SideBorder extends Border {
    private char c = '#';
    public SideBorder(Display display) {
        super(display);
    }
    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return c + display.getRowText(row) + c;
    }
}
