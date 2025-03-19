public static void main(String[] args){
    //Serializable
    BookSerialize bookOut = new BookSerialize("Shine like a dimand", 150, 1995);
    try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.ser"))){
        oos.writeObject(bookOut);
        System.out.println("Object has Serialized!");
    }
    catch(IOException e){ e.printStackTrace(); }
    //Deserializable
    try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.ser"))) {
        BookSerialize bookIn = (BookSerialize)ois.readObject();
        System.out.println("Object has recovered!" + bookIn);
    } catch (IOException | ClassNotFoundException e) { e.printStackTrace(); }
    
    //EXTERNALIZABLE
    People humanOut = new People("Vovka", 24, "man");
    //Serialize
    try(ObjectOutputStream oosE = new ObjectOutputStream(new FileOutputStream("humans.ser"))){
        oosE.writeObject(humanOut);
        System.out.println("Object has Serialized!");
    }
    catch(IOException e){ e.printStackTrace(); }
    //Deserialize
    try(ObjectInputStream oisE = new ObjectInputStream(new FileInputStream("humans.ser"))) {
        People humanIn = (People)oisE.readObject();
        System.out.println("Object has recovered!" + humanIn);
    } catch (IOException | ClassNotFoundException e) { e.printStackTrace(); }
}