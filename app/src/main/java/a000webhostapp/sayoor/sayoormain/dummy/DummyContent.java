package a000webhostapp.sayoor.sayoormain.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import a000webhostapp.sayoor.sayoormain.R;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 27;

    /** Create initial items **/
    static {
        // Add some sample items.

        addItem(createDummyItem(1, R.drawable.fruits));
        addItem(createDummyItem(2, R.drawable.vegetable));
        addItem(createDummyItem(3, R.drawable.promotion));
        addItem(createDummyItem(4, R.drawable.organic));
        addItem(createDummyItem(5, R.drawable.farmers));
        addItem(createDummyItem(6, R.drawable.new_in));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position, int imageID) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position), imageID);
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;
        public final int image;

        public DummyItem(String id, String content, String details, int image) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.image = image;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
