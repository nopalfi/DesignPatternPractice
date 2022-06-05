# DesignPatternPractice

### Singleton Pattern

The idea is to prevent an object created every single time someone wanted to instantiate an object, and actually reuse the object instead of create a new one.

```
if (object == null) {
  object = new ClassObject();
  }
return object;
```
