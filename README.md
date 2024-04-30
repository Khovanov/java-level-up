# java-level-up
Java base tutorial

# Install

## Java
https://www.java.com/en/download/

```sh
java --version
#openjdk 11.0.11 2021-04-20
#OpenJDK Runtime Environment AdoptOpenJDK-11.0.11+9 (build 11.0.11+9)
#OpenJDK 64-Bit Server VM AdoptOpenJDK-11.0.11+9 (build 11.0.11+9, mixed mode)
```

## CE IntelliJ IDEA
https://www.jetbrains.com/idea/download/download-thanks.html?platform=mac&code=IIC

## Maven (dependencies manager)
https://mvnrepository.com/

```sh
asdf list
asdf plugin add maven
asdf list maven
asdf install maven 3.9.6
asdf current maven 3.9.6
asdf list

mvn --version
mvn --help
```

## Apache Commons IO
https://commons.apache.org/proper/commons-io/
https://commons.apache.org/proper/commons-io/dependency-info.html
```sh
# after install dependencies pom.xml 
mvn install
```

# Compile and Run
```sh
cd ./src/main/java && \
javac org/tutorial/core/jvm/Program.java && \
java -cp $(pwd) org.tutorial.core.jvm.Program && \
cd -
```
