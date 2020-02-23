public class Person {


    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public char[] convert(String str)
    {
        char[] ch = new char[str.length()];


        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }



        return ch;

    }

    public boolean charEqual(char[] ch1,char[] ch2)
    {

        boolean ret = true;

        try {
            for (int i = 0; i < ch1.length; i++) {

                if (ch1[i] != ch2[i]) {
                    ret = false;
                }


            }
        }catch (ArrayIndexOutOfBoundsException e)
        {
            ret = false;
        }

        return ret;



    }

    @Override
    public boolean equals(Object obj) {
        Person other = (Person) obj;

        boolean ret = false;



        char[] a1 = convert(this.age+this.name)  ;
        char[] b1 = convert(other.age+other.name);


        return charEqual(a1,b1);


    }
}

