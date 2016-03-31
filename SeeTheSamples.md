Q. How can you run the samples?
A. Let's run our 'hello, world' sample.
  1. Clone the repository.
```
hg clone https://mmlc.googlecode.com/hg/ mmlc
```
  1. Edit the build.properties so it points to your gwt and antlr jars (download [antlr](http://www.antlr.org/download.html)).
```
cd mmlc
gedit build.properties
```
  1. Build the MMLc. It should create a folder name releases in the project root, and a file name MML.jar inside it.
```
ant
```
  1. Run the samples!
```
cd samples/basic-mmlc
ant hosted
```

## BasicMMLc ##

A simple "Hello, World" application.