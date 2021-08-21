public class Generic_task2 {
    public static void main(String args[]) {
        Pair<String, Integer> newPair = new Pair<String, Integer>("11522", 19);
        newPair = newPair.swap(newPair);
        System.out.println(newPair.toString());
    }
    public static class Pair<K, V> {
        private K name;
        private V id;
        public Pair(K name, V id) {
            this.name = name;
            this.id = id;
        }
        public Pair() {}
        public K getName() {
            return name;
        }
        public V getSize() {
            return id;
        }
        public void setName(K name) {
            this.name = name;
        }
        public void setSize(V id) {
            this.id = id;
        }
        public String toString() {
            return "Название: " + this.name + ". ID: " + this.id + ".";
        }
        public Pair<String, Integer> swap(Pair<String, Integer> pair) {
            Pair<String, Integer> newPair = new Pair<String, Integer>();
            newPair.name = pair.id.toString();
            newPair.id = Integer.parseInt(pair.name);
            return newPair;
        }
    }
}