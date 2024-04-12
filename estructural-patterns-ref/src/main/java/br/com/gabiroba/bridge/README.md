# Bridge

A ideia desse padrão é ter abstrações como ponte.

```java
    interface CustomizedList {
        void add(Object value);
    }

    interface Value {
        Object getValue();
    }

    class CustomizedListImpl imlements CustomizedList {
        
        public void add(Value) {
            System.out.println("Valor adicionado");
        }
    }

    class ExampleValue implements Value {
        public Object getValue() {
            return "Gabriel";
        }
    }



    public static void main(String ...args) {

        CustomizedList l = new CustomizedListImpl(new ExampleValue());
    }
```