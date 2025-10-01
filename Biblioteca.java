package biblioteca;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Object> materiais;

    public Biblioteca() {
        materiais = new ArrayList<>();
    }

    public void adicionarMaterial(Object material) {
        materiais.add(material);
    }

    public void listarMateriais() {
        if (materiais.isEmpty()) {
            System.out.println("Nenhum material cadastrado.");
        } else {
            for (Object m : materiais) {
                System.out.println(m.toString());
            }
        }
    }
}
