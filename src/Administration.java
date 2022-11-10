public class Administration extends User{
        protected  String type_of_adminsteratore;
        protected int id;
        public  Administration (String name, String surname, int numberphone,String type,int id) {
            super(name, surname, numberphone);
            this.type_of_adminsteratore=type;
            this.id=id;
        }

        public boolean isManager(){
            boolean type=false;
            if(type_of_adminsteratore.equals("Manager")){
                type=true;
            }
            return type;
        }

        public String getType_of_adminsteratore() {
            return type_of_adminsteratore;
        }

        public int getId() {
            return this.id;
        }

        @Override
        public String toString() {
            return "Adminstratore{" +
                    " \n type_of_adminsteratore='" + type_of_adminsteratore + '\'' +" \n name"+name+" \n surname"+surname+
                    "\n id= " + id +" \n  numberphone"+numberphone+
                    '}';
        }
    }
