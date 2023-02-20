import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Notebook> notebookList = new ArrayList();
        Notebook nb1 = new Notebook(95300, 256);
        Notebook nb2 = new Notebook(35300, 128);
        Notebook nb3 = new Notebook(65300, 64);
        notebookList.add(nb1);
        notebookList.add(nb2);
        notebookList.add(nb3);
        Collections.sort(notebookList, new PriceComparator());
        System.out.println("Notebooks sorted by Price: " + notebookList);
        Collections.sort(notebookList, new RamComparator());
        System.out.println("Notebooks sorted by RAM: " + notebookList);
        Collections.sort(notebookList, new RamPriceComparator());
        System.out.println("Notebooks sorted by RAM then by Price: " + notebookList);
    }

    public static class RamComparator implements Comparator<Notebook> {
        @Override
        public int compare(Notebook o1, Notebook o2) {
            return o1.ram - o2.ram;
        }
    }

    public static class PriceComparator implements Comparator<Notebook> {
        @Override
        public int compare(Notebook o1, Notebook o2) {
            return Double.compare(o1.price, o2.price);
        }

    }

    public static class RamPriceComparator implements Comparator<Notebook> {
        @Override
        public int compare(Notebook o1, Notebook o2) {
            int result;
            result = Integer.compare(o1.ram, o2.ram);
            result = Double.compare(o1.price, o2.price);
            return result;
        }

    }
}
