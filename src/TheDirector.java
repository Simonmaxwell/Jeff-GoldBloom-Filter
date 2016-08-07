
import java.util.HashMap;
import java.util.Map;

class TheDirector {

    private Map<Integer, Boolean> goldBloomFilter = new HashMap<>();

     void watchMyMovie(String movie) {
         int hash = createHash(movie);
         remember(hash);
    }

    private void remember(int hash) {
      goldBloomFilter.put(hash, true);
    }

    boolean wasItWorthIt(String myMovie) {
        int newHash = createHash(myMovie);
        return goldBloomFilter.get(newHash) != null;
    }

    private int createHash(String movie) {
        byte[] byteString = movie.getBytes();
        int byteStringLength = byteString.length;
        return MurmurHash3.murmurhash3_x86_32(byteString, 0, byteStringLength, 0);
    }

}


