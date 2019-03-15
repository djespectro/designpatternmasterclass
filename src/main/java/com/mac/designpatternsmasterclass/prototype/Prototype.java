package com.mac.designpatternsmasterclass.prototype;

public interface Prototype<T> extends Cloneable{

    T clone() throws CloneNotSupportedException;

}
