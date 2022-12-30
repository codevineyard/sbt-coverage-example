# SBT Coverage Example

Running

```sbt coverage test coverageReport```

passes with 100% coverage even though
[DoubleSpec](https://github.com/codevineyard/sbt-coverage-example/blob/main/src/test/scala/DoubleSpec.scala)
is commented out.

## The problem

How can the project be changed so that MainSpec does not affect coverage,
while DoubleSpec does?

## Solution 1

Use a combination of test tags and a multi-part sbt script. Run

```./runtests.sh```

## Solution 2

Instead of the run script, add a new command `testWithSmartCoverage` to build.sbt. Run

```sbt testWithSmartCoverage```

Kudos to [Mario Galic](https://stackoverflow.com/users/5205022/mario-galic)
for amazing [help on Stackoverflow](https://stackoverflow.com/questions/74951344/excluding-tests-from-coverage-report-with-sbt-coverage/74952465)!