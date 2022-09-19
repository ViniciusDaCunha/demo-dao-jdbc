package model.dao;

import java.util.List;

import model.entities.Department;


public interface DepartmentDao {

	/**
	 *Classes DAO são responsáveis por trocar informações com o SGBD 
	 *e fornecer operações CRUD e de pesquisas, 
	 *elas devem ser capazes de buscar dados no banco e 
	 *transformar esses em objetos ou lista de objetos, fazendo uso de listas genéricas, 
	 *também deverão receber os objetos, converter em instruções SQL e mandar para o banco de dados.
	 *
	 *
	 Ideia geral do padrão DAO(Data Access Object):
	 Para cada entidade, haverá um objeto responsável por fazer acesso a dados relacionado a esta 
	entidade. Por exemplo:
	 Cliente: ClienteDao
	 Produto: ProdutoDao
	 Pedido: PedidoDao
	 Cada DAO será definido por uma interface.
	 A injeção de dependência pode ser feita por meio do padrão de projeto Factory

	 */
	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}
