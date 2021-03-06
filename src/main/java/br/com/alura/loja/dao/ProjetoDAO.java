package br.com.alura.loja.dao;

import br.com.alura.loja.modelo.Projeto;
import com.thoughtworks.xstream.XStream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Michel Medeiros on 09/03/2017.
 */
public class ProjetoDAO {

    private static Map<Long, Projeto> banco = new HashMap<Long, Projeto>();
    private static AtomicLong contador = new AtomicLong(1);

    static {
        banco.put(1l, new Projeto(1l, "Minha loja", 2014));
        banco.put(2l, new Projeto(2l, "Alura", 2012));
    }

    public void adiciona(Projeto projeto) {
        long id = contador.incrementAndGet();
        projeto.setId(id);
        banco.put(id, projeto);
    }

    public Projeto busca(Long id) {
        return banco.get(id);
    }


    public List<Projeto> busca() {
        return Arrays.asList(banco.get(1));
    }


    public Projeto remove(long id) {
        return banco.remove(id);
    }
}
