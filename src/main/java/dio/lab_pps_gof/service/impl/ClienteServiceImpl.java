package dio.lab_pps_gof.service.impl;

import dio.lab_pps_gof.model.Cliente;
import dio.lab_pps_gof.service.ClienteService;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(long id, Cliente cliente) {

    }

    @Override
    public void deletar(long id) {

    }
}
