package unama.br.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;


import unama.br.Modelo.Aluno;

public class AlunoDAO {
	private DataSource datasource;
	private List<Aluno> listaAlunos;
	
	public AlunoDAO(DataSource datasource) {
		this.datasource = datasource; 
	}
	
	public List<Aluno> consultaAlunos() {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			con = datasource.getConnection();
			String sql = "select * from aluno order by primeiro_nome";		
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return listaAlunos;
	}
}
