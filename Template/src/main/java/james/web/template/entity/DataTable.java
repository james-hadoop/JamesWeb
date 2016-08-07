package james.web.template.entity;

public class DataTable {
    private int id;

    private String name;

    private String fileNamePrefix;

    private Integer enAble;

    private String hdfsDataDir;

    public DataTable(int id, String name, String fileNamePrefix, Integer enAble, String hdfsDataDir) {
        this.id = id;
        this.name = name;
        this.fileNamePrefix = fileNamePrefix;
        this.enAble = enAble;
        this.hdfsDataDir = hdfsDataDir;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFileNamePrefix() {
        return fileNamePrefix;
    }

    public Integer getEnAble() {
        return enAble;
    }

    public String getHdfsDataDir() {
        return hdfsDataDir;
    }
}