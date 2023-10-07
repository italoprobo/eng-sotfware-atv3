import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class RepositorioDePost {

    public void saveToFile(Post post) {
        try (FileWriter writer = new FileWriter(post.getFilePath())) {
            writer.write("ID: " + post.getId() + "\n");
            writer.write("Texto: " + post.getTexto() + "\n");
            writer.write("Autor: " + post.getAutor().getNome() + "\n");
            writer.write("Data: " + post.getData() + "\n");
            writer.write("Quantidade de Likes: " + post.getQuantidadeDeLikes() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Autor felipe = new Autor(0, "Felipe", "felipealves1208@gmail.com");
        Date data = new Date();
        Post post1 = new Post(0, "Vivendo a vida adoidado", felipe, data, "Post/resultados/italo.txt");

        RepositorioDePost post_banco_de_dados = new RepositorioDePost();

        post_banco_de_dados.saveToFile(post1);
    }
}
