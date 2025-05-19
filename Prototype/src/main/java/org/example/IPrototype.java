package org.example;
/*

 */
public interface IPrototype<T extends IPrototype> extends Cloneable{

    //simple clone
    public T clone();
    //Depp clone
    public T deepClone();
}
