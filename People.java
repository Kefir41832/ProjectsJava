import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class People implements Externalizable {
    private String pName;
    private int pAge;
    private String pGender;
    public People(){}
    public People(String name, int age, String gender){
        pName = name;
        pAge = age;
        pGender = gender;
    }
    @Override
    public void writeExternal(ObjectOutput op) throws IOException{
        op.writeUTF(pName);
        op.writeInt(pAge);
        op.writeUTF(pGender);
    }
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{
        pName = in.readUTF();
        pAge = in.readInt();
        pGender = in.readUTF();
    }
    @Override
    public String toString(){ return "Human: " + pName + ", " + pGender + ", " + pAge; }
}
