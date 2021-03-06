/*
 * EXProxyUnresolvedAddressException.java
 *
 * Created on 23 août 2005, 16:07
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.exproxy.exceptions;



/**
 * Raised if an UnresolvedAddressException occured
 * @author David Crosson
 */
public class EXProxyUnresolvedAddressException extends EXProxyException {
    
    /**
     * Creates a new instance of <code>EXProxyUnresolvedAddressException</code> without detail message.
     */
    public EXProxyUnresolvedAddressException() {
    }
    
    
    /**
     * Constructs an instance of <code>EXProxyUnresolvedAddressException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public EXProxyUnresolvedAddressException(String msg) {
        super(msg);
    }
}
