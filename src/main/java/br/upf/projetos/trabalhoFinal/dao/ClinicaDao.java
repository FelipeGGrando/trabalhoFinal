package br.upf.projetos.trabalhoFinal.dao;

import java.util.List;

import br.upf.projetos.trabalhoFinal.beans.Clinica;


/**
  * Interface que define operações para uma implementação de um objeto DAO.
  * Concentra as operações para persistêcnia das instâncias de classes de entidades.
  * A implementação deverá ter atributo com a entitymanager para as operações.
  * A instância de entitymanager deverá ser gerada externamente e injetada no objeto DAO.
  * Dependendo de como vai utilizar pode haver diferentes implementações dessa interface sendo:  
  * (i) Se utilizar com recurso local, o controle de transação pode ser inserido no código dos métodos da implementação.
  * (ii) Se utilizar com JTA o controle de transação será feito container EJB, não sendo necessário controlar transação nos métodos. 
 */
public interface ClinicaDao {

    /**
     * Método para armazenar um objeto no banco de dados.
     * Será usitilizado para operações de inserção e alteração de dados do objetos.
     * Se o id do objeto está null, fará uma inclusão, caso houver id, fará uma alteração.
     * @param objeto Instância do objeto a ser persistido.
     * @return Instância atualizada do objeto após sincronizado com o banco de dados.
     * @throws Exception Exceção gerada, se for o caso.
     */
    public Clinica gravar(Clinica objeto) throws Exception;

    /**
     * Remove um objeto do banco de dados.
     * @param id Código identificador do objeto a ser removido.
     * @throws Exception Exceção gerada, se for o caso.
     */
    public void excluir(Integer id) throws Exception;

    /**
     * Recupera a instância de um objeto do banco de dados pelo seu Id.
     * @param id Código do objeto a ser recuperado.
     * @return Instância do objeto respectivo ao id informado.
     */
    public Clinica getObjetoById(Integer id);

    /**
     * Recuperar todas as instâncias da classe passada por parâmetro.
     * @return Coleção com todas as instâncias encontradas.
     */
    public List<Clinica> getObjetos();

    /**
     * Recuperar todas as instâncias da classe passada por parâmetro.
     * Retorna a coleção ordenada pelo nome do atributo passado.
     * @param atributoOrdem Nome do atributo para a ordenação.
     * @return Coleção com todas as instâncias encontradas.
     */
    public List<Clinica> getObjetos(String atributoOrdem);

    /**
     * Obter uma coleção com os objetos persistentes obtidos do banco de dados.
     * Retorna a coleção ordenada pelo nome do atributo passado.
     * Retorna os objetos de um intervalo de paginação informado.
     * @param atributoOrdem Nome do atributo para a ordenação.
     * @param maxResults Quantidade máxima de objetos retornados.
     * @param firstResult Primeiro objeto a ser retornado. Inicia em zero.
     * @return Coleção com os objetos encontrados.
     */
    public List<Clinica> getObjetos(String atributoOrdem, int maxResults, int firstResult);

}