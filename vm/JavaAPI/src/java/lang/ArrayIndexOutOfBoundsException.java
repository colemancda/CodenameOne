/*
 * Copyright (c) 2012, Codename One and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Codename One designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *  
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 * 
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 * Please contact Codename One through http://www.codenameone.com/ if you 
 * need additional information or have any questions.
 */

package java.lang;
/**
 * Thrown to indicate that an array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of the array.
 * Since: JDK1.0, CLDC 1.0
 */
public class ArrayIndexOutOfBoundsException extends java.lang.IndexOutOfBoundsException{
    /**
     * Constructs an ArrayIndexOutOfBoundsException with no detail message.
     */
    public ArrayIndexOutOfBoundsException(){
    }

    /**
     * Constructs a new ArrayIndexOutOfBoundsException class with an argument indicating the illegal index.
     * index - the illegal index.
     */
    public ArrayIndexOutOfBoundsException(int index){
         super("" + index);
    }

    /**
     * Constructs an ArrayIndexOutOfBoundsException class with the specified detail message.
     * s - the detail message.
     */
    public ArrayIndexOutOfBoundsException(java.lang.String s){
         super(s);
    }

}
