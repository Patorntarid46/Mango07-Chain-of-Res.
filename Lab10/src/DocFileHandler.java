public class DocFileHandler implements Handler{
    private Handler nextHandler;
    private  String name;

    public DocFileHandler(String name){
        this.name = name;
//        this.nextHandler = nextHandler;
    }

    @Override
    public void setHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void process(File file) {
        if(file.getFileType().equals("doc"))
            System.out.println("Processing" + file.getFileName() + "." + file.getFileType() + "by" + name);
        else if (nextHandler != null) {
            nextHandler.process(file);
        } else
            System.out.println("File not supported" + file.getFileType());

    }

    @Override
    public String getName() {
        return name;
    }
}
