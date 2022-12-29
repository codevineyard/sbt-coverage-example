# SBT Coverage Example

Running

```sbt coverage test coverageReport```

passes with 100% coverage even though
[DoubleSpec](https://github.com/codevineyard/sbt-coverage-example/blob/main/src/test/scala/DoubleSpec.scala)
is commented out.

## The problem

How can the project be changed so that MainSpec does not affect coverage,
while DoubleSpec does?