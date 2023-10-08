package prototype;

import java.io.*;
import java.util.List;

/**
 * @Author: ye.ChenYu
 * @Date: 2023/9/21 22:52
 * @Description:
 */
public class Prototype implements Cloneable,Serializable{
    private int num;

    private String name;
    private long longNum;
    private List<Integer> numList;
    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLongNum(long longNum) {
        this.longNum = longNum;
    }

    public void setNumList(List<Integer> numList) {
        this.numList = numList;
    }


    public Prototype(int num, String name, long longNum, List<Integer> numList) {
        this.num = num;
        this.name = name;
        this.longNum = longNum;
        this.numList = numList;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", longNum=" + longNum +
                ", numList=" + numList +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public Prototype deepClone() {
        ByteArrayOutputStream baos = null;
        ByteArrayInputStream bais = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            bais = new ByteArrayInputStream(baos.toByteArray());

            ois = new ObjectInputStream(bais);
            return (Prototype) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                baos.close();
                bais.close();
                oos.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
