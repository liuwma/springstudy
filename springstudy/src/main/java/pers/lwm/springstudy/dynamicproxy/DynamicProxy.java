package pers.lwm.springstudy.dynamicproxy;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;
import sun.misc.ProxyGenerator;  

/**
 * java 动态代理原理
 * @author lwm 2017/04/11
 *
 */
public class DynamicProxy {
	public static void main(String[] args) {
		
		RealSubject real = new RealSubject();   
	    ISubject proxySubject = (ISubject)Proxy.newProxyInstance(ISubject.class.getClassLoader(), 
	     new Class[]{ISubject.class}, 
	     new ProxyHandler(real));
	         
	    proxySubject.doSth();

	}
	
	public static void createProxyClassFile()   
	  {   
	    String name = "ProxySubject";   
	    byte[] data = ProxyGenerator.generateProxyClass( name, new Class[] { ISubject.class } );   
	    try  
	    {   
	      FileOutputStream out = new FileOutputStream( name + ".class" );   
	      out.write( data );   
	      out.close();   
	    }   
	    catch( Exception e )   
	    {   
	      e.printStackTrace();   
	    }   
	  }   
}
