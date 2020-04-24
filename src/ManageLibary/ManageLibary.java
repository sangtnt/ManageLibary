package ManageLibary;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManageLibary {
	private static List<Document> listDocument= new ArrayList<>();
	public static void addDoc(Document document) {
		ManageLibary.listDocument.add(document);
	}
	public static boolean deleteDoc(String id) {
		Document res= ManageLibary.listDocument.stream()
				.filter(o -> o.getId().equals(id))
				.findFirst()
				.orElse(null);
		if (res==null) {
			return false;
		}
		ManageLibary.listDocument.remove(res);
		return true;
	}
	public static String showInfo(Document doc) {
		String res= doc.getId()+" "+doc.getProducerName()+" "+doc.getCirculation();
		return res;
	}
	public static List<Document> searchBook() {
		List<Document> list = ManageLibary.listDocument.stream()
				.filter(o->o instanceof Book)
				.collect(Collectors.toList());
		return list;
	}
	public static List<Document> searchNewspaper() {
		List<Document> list = ManageLibary.listDocument.stream()
				.filter(o->o instanceof Newspaper)
				.collect(Collectors.toList());
		return list;
	}
	public static List<Document> searchMagazine() {
		List<Document> list = ManageLibary.listDocument.stream()
				.filter(o->o instanceof Magazine)
				.collect(Collectors.toList());
		return list;
	}
}
