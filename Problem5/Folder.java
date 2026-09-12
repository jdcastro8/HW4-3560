import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<File> files;
    private ArrayList<Folder> subFolders;

    public Folder(String name) {
        this.name = name;
        files = new ArrayList<>();
        subFolders = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public ArrayList<Folder> getSubFolders() {
        return subFolders;
    }

    public Folder addFolder(String name) {
        Folder folder = new Folder(name);
        subFolders.add(folder);
        return folder;
    }

    public void addFile(String name) {
        files.add(new File(name));
    }

    public void deleteFolder(String name) {
        for (int i = 0; i < subFolders.size(); i++) {
            if (subFolders.get(i).getName().equals(name)) {
                subFolders.remove(i);
                return;
            }
        }
    }

    public void print() {
        print("");
    }

    private void print(String indent) {
        System.out.println(indent + "Folder: " + name);

        for (Folder folder : subFolders) {
            folder.print(indent + "    ");
        }

        for (File file : files) {
            file.print(indent + "    ");
        }
    }
}
