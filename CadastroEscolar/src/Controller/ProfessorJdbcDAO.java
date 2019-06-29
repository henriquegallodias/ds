package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Professores;


public class ProfessorJdbcDAO {

	private Connection conn;
	
	
	public ProfessorJdbcDAO(Connection conn) {
		this.conn = conn;
	}
	
	
	public void salvar(Professores d) throws SQLException {
		String sql = "insert into professores (nome, endereco, bairro) values ('"+d.getNome()+"','"+d.getEndereco()+"','"+d.getBairro()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
        prepareStatement.close();
	}
	
	public void alterar(Professores d) {
		String sql = "update professores set nome='"+d.getNome()+"',endereco='"+d.getEndereco()+"',bairro='"+d.getBairro()+"';";
		System.out.println(sql);
		PreparedStatement prepareStatement;
		try {
			prepareStatement = this.conn.prepareStatement(sql);
			prepareStatement.executeUpdate();
            prepareStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public void excluir(int id) {
		String sql = "delete from professores where id='"+id+"';";
		System.out.println(sql);
        try {
    		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
    		prepareStatement.executeUpdate();
			prepareStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}                		
	}
	
	public List<Professores> listar() {
		String sql = "select * from alunos";
        System.out.println(sql);		
        List<Professores> professores = new ArrayList<Professores>();
		try {
			PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
			ResultSet rs = prepareStatement.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String endereco = rs.getString("endereco");
				String bairro = rs.getString("bairro");
				Professores prof = new Professores();
				prof.setId(id);
				prof.setNome(nome);
				prof.setEndereco(endereco);
				prof.setBairro(bairro);
			}
			prepareStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return professores;
	}
}
