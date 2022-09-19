package model.dao;

import java.util.List;

import model.entities.Department;


public interface DepartmentDao {

	/**
	 *Classes DAO s�o respons�veis por trocar informa��es com o SGBD 
	 *e fornecer opera��es CRUD e de pesquisas, 
	 *elas devem ser capazes de buscar dados no banco e 
	 *transformar esses em objetos ou lista de objetos, fazendo uso de listas gen�ricas, 
	 *tamb�m dever�o receber os objetos, converter em instru��es SQL e mandar para o banco de dados.
	 *
	 *
	 Ideia geral do padr�o DAO(Data Access Object):
	 Para cada entidade, haver� um objeto respons�vel por fazer acesso a dados relacionado a esta 
	entidade. Por exemplo:
	 Cliente: ClienteDao
	 Produto: ProdutoDao
	 Pedido: PedidoDao
	 Cada DAO ser� definido por uma interface.
	 A inje��o de depend�ncia pode ser feita por meio do padr�o de projeto Factory

	 */
	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}
