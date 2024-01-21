package br.com.cesar.generic.JDBC.dao;

import domain.Cliente;

public interface IClienteDAO {
    public Integer cadastrar (Cliente cliente) throws Exception;

    Cliente consultar(String codigo) throws Exception;

    Integer excluir(Cliente clienteBD) throws Exception;
}
