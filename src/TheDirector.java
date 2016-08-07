
 class TheDirector {

    private int goldBloomFilter = 0;

     void watchMyMovie(String movie) {
        byte[] byteString = movie.getBytes();
        int byteStringLength = byteString.length;
        int hash = MurmurHash3.murmurhash3_x86_32(byteString, 0, byteStringLength, 0);
        remember(hash);
    }

    private void remember(int hash) {
      goldBloomFilter  = goldBloomFilter | hash;
    }

    boolean wasItWorthIt(String myMovie) {
        byte[] byteString = myMovie.getBytes();
        int byteStringLength = byteString.length;
        int newHash = MurmurHash3.murmurhash3_x86_32(byteString, 0, byteStringLength, 0);

        return (goldBloomFilter & newHash) == newHash;
    }

}


