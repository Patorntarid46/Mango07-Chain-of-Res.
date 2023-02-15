public interface Handler {
    public void setHandler(Handler nextHandler);
    //method สำหรับกำหนด nextHandler
    //เพื่อกำหนดว่า ถ้าprocessทำไม่ได้ จะส่งต่อให้ nextHandler process
    public void process(File file);
    public String getName();
}
