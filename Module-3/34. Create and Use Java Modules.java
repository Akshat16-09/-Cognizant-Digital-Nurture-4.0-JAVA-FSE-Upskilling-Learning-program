Folder Structure:
project-root/
├── com.utils/
│   ├── module-info.java
│   └── Utils.java
├── com.greetings/
│   ├── module-info.java
│   └── Main.java
com.utils/module-info.java

module com.utils {
    exports com.utils;
}
com.utils/Utils.java

package com.utils;

public class Utils {
    public static String greet(String name) {
        return "Hello, " + name;
    }
}
com.greetings/module-info.java


module com.greetings {
    requires com.utils;
}
com.greetings/Main.java


package com.greetings;

import com.utils.Utils;

public class Main {
    public static void main(String[] args) {
        System.out.println(Utils.greet("MiniBlog Dev"));
    }
}

Compile and run using:


javac -d out --module-source-path . com.utils/module-info.java com.utils/Utils.java
javac -d out --module-source-path . --module com.greetings
java --module-path out -m com.greetings/com.greetings.Main
