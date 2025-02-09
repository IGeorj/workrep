package com.t795.zki.common.bo.message;

public class BlockMessage extends AbstractMessage {
    private char[][] content;
    private int rows;
    private int cols;

    public BlockMessage() {
        this(new char[0][0]);
    }

    public BlockMessage(char[][] content) {
        this.setContent(content);
    }

    public char[][] getContent() {
        return content;
    }

    public void setContent(char[][] content) {
        this.content = content;
        this.rows = content.length;
        this.cols = content[0].length;
    }

    public void setColumnByIndex(int index, char[] column) {
        for(int i = 0; i != this.rows; ++i) {
            this.content[i][index] = column[i];
        }
    }

    public void setRowByIndex(int index, char[] row) {
        this.content[index] = row;
    }

    public int getRows() {
        return rows;
    }

    private void copyLastArrayToResizedArray() {
        char[][] newContent = new char[this.rows][this.cols];

        for (int rowIndex = 0; rowIndex < this.content.length; ++rowIndex) {
            for (int columnIndex = 0; columnIndex < this.content[0].length; ++columnIndex) {
                newContent[rowIndex][columnIndex] = this.content[rowIndex][columnIndex];
            }
        }
    }

    public void setRowsCount(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setColumnsCount(int cols) {
        this.cols = cols;
    }

    public char getContentEntryByIndex(int row, int column) {
        return this.content[row][column];
    }

    public char[] getColumnByIndex(int columnIndex) {
        char[] result = new char[this.rows];

        for(int i = 0; i < this.rows; ++i) {
            result[i] = this.content[i][columnIndex];
        }

        return result;
    }

    public char[] getRowByIndex(int rowIndex) {
        return this.content[rowIndex];
    }
}
