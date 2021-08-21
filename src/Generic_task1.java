public class Generic_task1 {
    public static void main(String args[]) {
        Obscure newObj = returnEmptyObject();
        newObj.setName("Новый объект №1");
        System.out.println(newObj.getName());
    }
    public static Obscure returnNewObject() {
        Obscure<String> obj = new Obscure("Новый объект");
        return obj;
    }
    public static Obscure returnEmptyObject() {
        Obscure<String> obj = new Obscure();
        return obj;
    }
    public static class Obscure<T> {
        private T name;
        Obscure(T name){
            this.name = name;
        }
        Obscure(){}
        public T getName() {
            return name;
        }
        public void setName(T name) {
            this.name = name;
        }
        public boolean isPresent() {
            if(!name.equals(null) & !name.equals("") & !name.equals(" ")) {
                return true;
            } else {
                return false;
            }
        }
        public boolean isEmpty() {
            if(name.equals(null)) {
                return true;
            } else {
                return false;
            }
        }
        public T orElse(T name) {
            if (this.isPresent()) {
                return this.name;
            } else {
                return name;
            }
        }
        public T orElseThrow(Exception ex) throws Exception {
            if (this.isPresent()) {
                return this.name;
            } else {
                throw new Exception(ex);
            }
        }
    }
}