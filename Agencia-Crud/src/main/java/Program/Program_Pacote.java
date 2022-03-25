package Program;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Connection.Conexao;
import model.Pacote;


public class Program_Pacote {
	
	public void create() {
		Scanner entrada = new Scanner(System.in);

		String sql = "INSERT INTO Pacote(NomeDoPacote, Destino, Duracao, Promo, Preco) VALUES (?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		Pacote pacote = new Pacote();

		System.out.println("--------- Cadastre seu destino ---------");
		System.out.println("Nome do Destino : ");
		pacote.setNomeDoPacote(entrada.nextLine());
		System.out.println("Destino: ");
		pacote.setDestino(entrada.nextInt());
		System.out.println("Duracao: ");
		pacote.setDuracao(entrada.nextInt());
		System.out.println("Promo: ");
		pacote.setPromo(entrada.nextBoolean());
		System.out.println("Preco: ");
		pacote.setPreco(entrada.nextFloat());
	

		try {
			conn = Conexao.CreateConnectionToMySql();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, pacote.getNomeDoPacote());
			pstm.setInt(2, pacote.getDestino());
			pstm.setInt(3, pacote.getDuracao());
			pstm.setBoolean(4, pacote.isPromo());
			pstm.setFloat(5, pacote.getPreco());

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

	public List<Pacote> getRead() {

		String sql = "SELECT * FROM Destino";

		List<Pacote> pacote = new ArrayList<Pacote>();

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = Conexao.CreateConnectionToMySql();

			pstm = conn.prepareStatement(sql);

			ResultSet rset = pstm.executeQuery();

			while (rset.next()) {

				Pacote pacotes = new Pacote();

				pacotes.setIdPacote(rset.getInt("IdPacote"));
				System.out.println(toString());
				pacotes.add(pacote);

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
		return pacote;
	}

	public void update() {

		Scanner entrada = new Scanner(System.in);

		String sql = "UPDATE Pacote SET NomeDoDestino = ? , Destino = ? , Duracao = ?, Promo = ?, Preco = ? WHERE Id_Destino = ? ";
		Connection conn = null;
		PreparedStatement pstm = null;

		Pacote pacote = new Pacote();

		System.out.println("Id do Pacote: ");
		pacote.setIdPacote(entrada.nextInt());
		entrada.nextLine();
		System.out.println("Nome do Pacote : ");
		pacote.setNomeDoPacote(entrada.nextLine());
		System.out.println("Destino : ");
		pacote.setDestino(entrada.nextInt());
		System.out.println("Duracao : ");
		pacote.setDuracao(entrada.nextInt());
		System.out.println("Promo: ");
		pacote.setPromo(entrada.nextBoolean());
		System.out.println("Preco: ");
		pacote.setPreco(entrada.nextFloat());

		try {
			conn = Conexao.CreateConnectionToMySql();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(5, pacote.getIdPacote());
			pstm.setString(1, pacote.getNomeDoPacote());
			pstm.setInt(2, pacote.getDestino());
			pstm.setInt(3, pacote.getDuracao());
			pstm.setBoolean(4, pacote.isPromo());
			pstm.setFloat(5, pacote.getPreco());


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

		Pacote pacote = new Pacote();

		System.out.println("--------- Deletar seus Dados ? ---------");
		System.out.println("Digite o Id do Destino");
		pacote.setIdPacote(entrada.nextInt());

		try {
			conn = Conexao.CreateConnectionToMySql();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setInt(1, pacote.getIdPacote());
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
			
			Program_Pacote pacote = new Program_Pacote();

			switch (op) {
			case 1:
				pacote.create();
				break;
			case 2:
				pacote.getRead();
				break;
			case 3:
				pacote.update();
				break;
			case 4:
				pacote.delete();
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
