package Program;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Connection.Conexao;
import model.Destino;

public class Program_Destino {

	public void create() {
		Scanner entrada = new Scanner(System.in);

		String sql = "INSERT INTO Destino(NomeDoDestino, Cidade, Estado, Descricao) VALUES (?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;

		Destino destino = new Destino();

		System.out.println("--------- Cadastre seu destino ---------");
		System.out.println("Nome do Destino : ");
		destino.setNomeDoDestino(entrada.nextLine());
		System.out.println("Cidade: ");
		destino.setCidade(entrada.nextLine());
		System.out.println("Estado: ");
		destino.setEstado(entrada.nextLine());
		System.out.println("Descrição: ");
		destino.setDescricao(entrada.nextLine());
		

		try {
			conn = Conexao.CreateConnectionToMySql();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, destino.getNomeDoDestino());
			pstm.setString(2, destino.getCidade());
			pstm.setString(3, destino.getEstado());
			pstm.setString(4, destino.getDescricao());
			

			pstm.execute();

			System.out.println("---------- Cadastro Realizado com Sucesso! ----------");
			System.out.println("");

		} catch (Exception e) {
			System.out.println("Erro ao Cadastrar!" + e.getMessage());
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}



	public List<Destino> getRead() {

		String sql = "SELECT * FROM Destino";

		List<Destino> destinos = new ArrayList<Destino>();

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = Conexao.CreateConnectionToMySql();

			pstm = conn.prepareStatement(sql);

			ResultSet rset = pstm.executeQuery();

			while (rset.next()) {

				Destino destino = new Destino();

				destino.setIdDestino(rset.getInt("Id_Destino"));
				System.out.println("Nome: " + rset.getString("Nome_Destino") + ", Cidade: " + rset.getString("Cidade")
						+ ", Estado: " + rset.getString("Estado") + ", Descricao:  " + rset.getString("Descricao") );
				destinos.add(destino);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return destinos;
	}

	public void update() {

		Scanner entrada = new Scanner(System.in);

		String sql = "UPDATE Destino SET NomeDoDestino = ? , Cidade = ? , Estado = ?, Descricao = ? WHERE Id_Destino = ? ";
		Connection conn = null;
		PreparedStatement pstm = null;

		Destino destino = new Destino();

		System.out.println("--------- Cadastre seu destino ---------");
		System.out.println("Id do Destino: ");
		destino.setIdDestino(entrada.nextInt());
		entrada.nextLine();
		System.out.println("Nome do Destino : ");
		destino.setNomeDoDestino(entrada.nextLine());
		System.out.println("Cidade : ");
		destino.setCidade(entrada.nextLine());
		System.out.println("Estado : ");
		destino.setEstado(entrada.nextLine());
		System.out.println("Descricao: ");
		destino.setDescricao(entrada.nextLine());
		

		try {
			conn = Conexao.CreateConnectionToMySql();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(5, destino.getIdDestino());
			pstm.setString(1, destino.getNomeDoDestino());
			pstm.setString(2, destino.getCidade());
			pstm.setString(3, destino.getEstado());
			pstm.setString(4, destino.getDescricao());
		

			pstm.execute();

			System.out.println("---------- Dados Atualizado com Sucesso! ----------");

			pstm.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("Erro ao Atualizar! " + e.getMessage());
		}

	}

	public void delete() throws Exception {
		Scanner entrada = new Scanner(System.in);

		String sql = "DELETE FROM Destino WHERE Id_Destino = ?";
		Connection conn = null;
		PreparedStatement pstm = null;

		Destino destino = new Destino();

		System.out.println("--------- Deletar seus Dados ? ---------");
		System.out.println("Digite o Id do Destino");
		destino.setIdDestino(entrada.nextInt());

		try {
			conn = Conexao.CreateConnectionToMySql();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setInt(1, destino.getIdDestino());
			pstm.execute();

			System.out.println("---------- Dados Excluidos com Sucesso! ----------");
			System.out.println("");

		} catch (SQLException e) {
			System.out.println("Erro ao Deletar os dados! " + e.getMessage());
		}
		try {
			if (pstm != null) {
				pstm.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Menu() throws Exception {
		Scanner entrada = new Scanner(System.in);
		Boolean opcao = true;

		do {
			System.out.println("--------------------------------------");
			System.out.println("--- Aqui você encontra seus dados. ---");
			System.out.println("O que deseja Realizar ?");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Consultar");
			System.out.println("3 - Atualizar");
			System.out.println("4 - Deletar");
			System.out.println("5 - Sair");
			int op = entrada.nextInt();
			
			Program_Destino destino = new Program_Destino();

			switch (op) {
			case 1:
				destino.create();
				break;
			case 2:
				destino.getRead();				
				break;
			case 3:
				destino.update();
				break;
			case 4:
				destino.delete();
				break;
			case 5:
				System.out.println("----------------");
				System.out.println("| volte sempre!|");
				System.out.println("----------------");
				System.exit(op);
				break;
			default:
				System.out.println("Opçção inválida!");
				break;
			}
		} while (opcao);
	}
	
	
}
