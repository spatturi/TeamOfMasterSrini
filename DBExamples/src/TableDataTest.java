public class TableDataTest {
    public static void main(String[] args) {

        TableData tableData = new TableData();
        String tableName=tableData.getTableName();
        tableData.getTableData(tableName);
    }
}
