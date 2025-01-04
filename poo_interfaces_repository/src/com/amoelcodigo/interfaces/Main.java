package com.amoelcodigo.interfaces;

import com.amoelcodigo.interfaces.models.Cliente;
import com.amoelcodigo.interfaces.repository.list.ClientListRepository;
import com.amoelcodigo.interfaces.repository.Direction;
import com.amoelcodigo.interfaces.repository.OrdablePaginableCrudRepositoy;
import com.amoelcodigo.interfaces.repository.OrdenableRepository;
import com.amoelcodigo.interfaces.repository.PaginableRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrdablePaginableCrudRepositoy<Cliente> repository = new ClientListRepository();
        repository.create(new Cliente("Jano", "Perez"));
        repository.create(new Cliente("Bea", "Triz"));
        repository.create(new Cliente("Luci", "Ernaga"));
        repository.create(new Cliente("Victor", "Pedraza"));

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