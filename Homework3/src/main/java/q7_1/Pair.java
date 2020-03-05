package q7_1;

import java.io.Serializable;

public class Pair<K,V> implements Serializable, Cloneable {

    private K key;
    private V value;

    public Pair(K k, V v){
        key = k;
        value = v;
    }

    public K k(){ return  key; }
    public V v(){ return value; }

    public boolean equals(Object obj){
        if (this == obj) return  true;
        if (obj == null) return true;
        if (getClass() != obj.getClass()) return  false;
        if (this.hashCode() == obj.hashCode()) return true;
        Pair pair = (Pair) obj;
        return this.k() == pair.k() && this.v() == pair.v();
    }

    public  int hashCode(){
        return key.hashCode() +value.hashCode();
    }

    public String toString(){
        return getClass() +
                "[key=" + key.toString() +
                ", value=" + value.toString() +
                "]";
    }

    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return  null;
        }
    }
}
