package org.hdfc.service;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import org.hdfc.beans.EmployeeEntity;
@Provider
@Produces({MediaType.APPLICATION_JSON ,MediaType.APPLICATION_SVG_XML,MediaType.TEXT_PLAIN,MediaType.TEXT_HTML})

public class UtilWriter implements MessageBodyWriter<EmployeeEntity>{

	public long getSize(EmployeeEntity arg0, Class<?> arg1, Type arg2, Annotation[] arg3, MediaType arg4) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isWriteable(Class<?> type, Type arg1, Annotation[] arg2, MediaType arg3) {
		// TODO Auto-generated method stub
		return EmployeeEntity.class.isAssignableFrom(type);
	}

	

	public void writeTo(EmployeeEntity list, Class<?> arg1, Type arg2, Annotation[] arg3, MediaType mt,
			MultivaluedMap<String, Object> arg5, OutputStream arg6) throws IOException, WebApplicationException {
		// TODO Auto-generated method stub
		
	}

}
