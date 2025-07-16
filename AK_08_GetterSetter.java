public class AK_08_GetterSetter {
    static class Student {
        private String name;
        private int id;

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }
        public int getId() {
            return id;
        }

        public void setName(String name) {
            this.name = name;
        }   
        public void setId(int id) {
            this.id = id;
        }

    }
    public static void main(String[] args) {
        Student st = new Student("Aanand Kumar", 01);
        System.out.println("Original Name: " + st.name);
        System.out.println("Original Id: " + st.id);
        

        st.setName("Aakash Kumar");
        System.out.println("New Name: " + st.getName());

        st.setId(02);
        System.out.println("Updated ID: " + st.getId());
    }
}