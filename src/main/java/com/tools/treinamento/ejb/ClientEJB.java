package com.tools.treinamento.ejb;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.tools.treinamento.MultiplicacaoService;

public class ClientEJB {

	public static void main(String[] args) throws NamingException {
		final Hashtable<String, Object> env = new Hashtable<>();
		
		env.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
		env.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
		env.put("jboss.naming.client.ejb.context", true);
		InitialContext context = new InitialContext(env);
		//final MultiplicacaoService ejb = (MultiplicacaoService) context.lookup("wildfly-http-remoting-ejb/MultiplicacaoService!br.com.tools.treinamento.MultiplicacaoService");
		//System.out.println(ejb);
	}

}
