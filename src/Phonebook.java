import java.util.ArrayList;
import java.util.ListIterator;
import java.util.WeakHashMap;

public class Phonebook {
    private ArrayList<String[]> book = new ArrayList();

    public void add(String name, String number) {
        String[] tempArray = new String[2];
        tempArray[0] = name;
        tempArray[1] = number;
        book.add(tempArray);
    }

    public String get(String str) {
        ListIterator<String[]> listIter = book.listIterator();

        ArrayList<String[]> booktemp = new ArrayList();
        while (listIter.hasNext()) {
            String[] clonestr = listIter.next();
            booktemp.add(clonestr);
        }
        listIter = book.listIterator();
        ListIterator<String[]> listIter2 = booktemp.listIterator();
        ArrayList<String> result = new ArrayList();
        while (listIter.hasNext()) {
            String[] ss = listIter.next();
            if (ss[0] == str) {
                ArrayList<String> phones = new ArrayList();
                while (listIter2.hasNext()) {
                    String[] strclone = listIter2.next();
                    if (strclone[0] == ss[0]) {
                        phones.add(strclone[1]);
                        listIter2.remove();
                    }
                }
                if (phones.size() > 0) {
                    String addstr = ss[0] + ": ";

                    ListIterator<String> phoneIter = phones.listIterator();
                    while (phoneIter.hasNext()) {
                        String itemPhone = phoneIter.next();
                        if (phoneIter.previousIndex() == phones.size() -1) {
                            addstr += itemPhone;
                        } else {
                            addstr += itemPhone + ",";
                        }
                    }
                    result.add(addstr);
                    listIter.remove();
                }
            }
        }
        return result.get(0);
    }
}
