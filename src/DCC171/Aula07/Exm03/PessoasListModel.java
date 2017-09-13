package DCC171.Aula07.Exm03;

import java.util.LinkedList;
import java.util.List;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

public class PessoasListModel implements ListModel<Pessoa> {

    private final List<Pessoa> pessoas;
    private List<ListDataListener> dataListeners = new LinkedList<>();

    public PessoasListModel(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public int getSize() {
        return pessoas.size();
    }

    @Override
    public Pessoa getElementAt(int index) {
        return pessoas.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        dataListeners.add(l);
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        dataListeners.remove(l);
    }

}
