# Push On Bintray Example

## Needed files
You need to have a **credential** file somewhere, it's recommand to have it in `userHome/.bintray/.credentials` but you can choose another place by changing it in your build.sbt. Credentials can be generate [here](https://github.com/sbt/sbt-bintray#credentials).

Roots project/
* build.sbt
* project/
  * plugins.sbt
* src/main/scala/
  * scalaFile1.scala
  * scalaFile2.scala
  * ...