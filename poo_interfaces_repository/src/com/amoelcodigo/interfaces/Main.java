package com.amoelcodigo.interfaces;

import com.amoelcodigo.interfaces.models.Cliente;
import com.amoelcodigo.interfaces.repository.ClientListRepository;
import com.amoelcodigo.interfaces.repository.CrudRepository;
import com.amoelcodigo.interfaces.repository.Direction;
import com.amoelcodigo.interfaces.repository.OrdenableRepository;
import com.amoelcodigo.interfaces.repository.PaginableRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CrudRepository repository = new ClientListRepository();
        repository.createClient(new Cliente("Jano", "Perez"));
        repository.createClient(new Cliente("Bea", "Triz"));
        repository.createClient(new Cliente("Luci", "Ernaga"));
        repository.createClient(new Cliente("Victor", "Pedraza"));

        List<Cliente> clientes = repository.findAll();

        clientes.forEach(System.out::println);

        System.out.println("----- Paginable -----");

        List<Cliente> paginable = ((PaginableRepository)repository).findAll(0, 2);
        paginable.forEach(System.out::println);

        System.out.println("----- Ordenar -----");
        List<Cliente> clientesAsc = ((OrdenableRepository)repository).findAll("nombre", Direction.DESC);
        clientesAsc.forEach(System.out::println);

        System.out.println("----- Editar ------");
        Cliente clienteActualizar = new Cliente("Bea", "Mena");
        clienteActualizar.setId(2);
        repository.edit(clienteActualizar);
        Cliente found = (Cliente) repository.findById(2);
        System.out.println(found);

        System.out.println("----- Eliminar -----");
        repository.deleteById(2);
        clientesAsc.forEach(System.out::println);

        System.out.println("-------Total-----");
        System.out.println("Total Registros " + repository.count());

    }
}