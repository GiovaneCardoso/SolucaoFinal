package br.com.project.connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect 
{
	/**
	 * create the sql connection 
	 * @return
	 * @throws Exception
	 */
	public static Connection build() throws Exception 
	{
		return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","rm86063","fiap20");
	}
	
}
