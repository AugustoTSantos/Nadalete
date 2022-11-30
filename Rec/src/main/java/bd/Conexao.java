package bd;

import java.sql.*;

public class Conexao {
	private String local = "localhost";
	private String user = "postgres";
	private String senha = "123";
	private String porta = "5432";
	private String banco = "Rec";
	private Connection c;
	private Statement statment;
	private String str_conexao;
	private String driverjdbc;


	public Conexao() {
		setStr_conexao("jdbc:postgresql://"+ local +":" + porta +"/"+ banco);
		setDriverjdbc("org.postgresql.Driver");
	}


	public void configUser(String user, String senha) {
		setUser(user);
		setSenha(senha);
	}

	public void configLocal(String banco) {
		setLocal(banco);
	}

	//Conexão com o Banco de Dados
	public void conect(){
		try {
			Class.forName(getDriverjdbc());
			setC(DriverManager.getConnection(getStr_conexao(), getUser(), getSenha()));
			setStatment(getC().createStatement());
		}catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}

	public void disconect(){
		try {
			getC().close();
		}catch (SQLException ex) {
			System.err.println(ex);
			ex.printStackTrace();
		}
	}

	public ResultSet query(String query){
		try {
			return getStatment().executeQuery(query);
		}catch (SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}


	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}

	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

	public String getPorta() {
		return porta;
	}
	public void setPorta(String porta) {
		this.porta = porta;
	}

	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}

	public Connection getC() {
		return c;
	}
	public void setC(Connection c) {
		this.c = c;
	}

	public Statement getStatment() {
		return statment;
	}
	public void setStatment(Statement statment) {
		this.statment = statment;
	}

	public String getStr_conexao() {
		return str_conexao;
	}
	public void setStr_conexao(String str_conexao) {
		this.str_conexao = str_conexao;
	}

	public String getDriverjdbc() {
		return driverjdbc;
	}
	public void setDriverjdbc(String driverjdbc) {
		this.driverjdbc = driverjdbc;
	}
}